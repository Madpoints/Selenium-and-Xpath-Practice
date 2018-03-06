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
        browser.get("http://freecrm.com/index.html");
        String features = browser.findElement(By.xpath("//a[text()='Features']")).getText();
//        WebElement header = browser.findElement(By.id("about"));
        System.out.println(features);
        browser.close();

    }
}
