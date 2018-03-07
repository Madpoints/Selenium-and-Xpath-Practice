package com.example.madpoints;

public class StockInfo {
    private String name;
    private String marketCap;
    private String price;
    private String percentChange;

    public StockInfo(String name, String marketCap, String price, String percentChange) {
        this.name = name;
        this.marketCap = marketCap;
        this.price = price;
        this.percentChange = percentChange;
    }

    public StockInfo() {
    }

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println("Market cap: " + this.marketCap);
        System.out.println("Price(USD): " + this.price);
        System.out.println("24hour change: " + this.percentChange);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }
}
