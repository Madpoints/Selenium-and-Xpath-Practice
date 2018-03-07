package com.example.madpoints;

import java.util.ArrayList;

public class Stocks {
    private ArrayList<StockInfo> stocks = new ArrayList<>();

    public boolean addStock(StockInfo stock) {
        if (stocks.contains(stock)) {
            return false;
        }

        stocks.add(stock);
        return true;
    }
}
