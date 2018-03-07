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

        String name;
        String cap;
        String price;
        String change;
        StockInfo stock = new StockInfo();
        Stocks stocks = new Stocks();


        for (int row = 1; row <= 50; row++) {
            for (int col = 2; col <= 7; col++) {
                switch (col) {
                    case 2:
                        stock.setName(browser.findElement(By.xpath("//tr["+row+"]//td["+col+"]")).getText());
                        break;
                    case 3:
                        stock.setMarketCap(browser.findElement(By.xpath("//tr["+row+"]//td["+col+"]")).getText());
                        break;
                    case 4:
                        break;
                    case 5:
                        stock.setPrice(browser.findElement(By.xpath("//tr["+row+"]//td["+col+"]")).getText());
                        break;
                    case 6:
                        break;
                    case 7:
                        stock.setPercentChange(browser.findElement(By.xpath("//tr["+row+"]//td["+col+"]")).getText());
                        break;
                    default:
                        break;
                }
            }
            stocks.addStock(stock);
            stocks.showStocks();
        }

        browser.close();

    }
}
