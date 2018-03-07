package com.example.madpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.xml.xpath.XPath;

public class Main {

    public static void main(String[] args) {
        //Firefox's geckodriver *requires* you to specify its location.
        WebDriver browser = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\John\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        browser.get("https://coins.live/");

        String name = browser.findElement(By.xpath("//tr[1]//td[2]")).getText();
        String cap = browser.findElement(By.xpath("//tr[1]//td[3]")).getText();
        String price = browser.findElement(By.xpath("//tr[1]//td[5]")).getText();
        String change = browser.findElement(By.xpath("//tr[1]//td[7]")).getText();
        StockInfo bitcoin = new StockInfo(name, cap, price, change);
//        WebElement header = browser.findElement(By.id());

        Stocks stocks = new Stocks();
        stocks.addStock(bitcoin);

        bitcoin.displayInfo();

        browser.close();

    }
}
