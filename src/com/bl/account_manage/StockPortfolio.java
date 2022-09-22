package com.bl.account_manage;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    static ArrayList<Stock> portfolio = new ArrayList();
    static int totalValue;

    public static void addStock() {
        Scanner sc = new Scanner(System.in);
        Stock stockInfo = new Stock();

        System.out.println("Enter Stock detail you want to purchase");
        System.out.println("Enter a Name of Sock: ");
        stockInfo.setStockName(sc.next());
        System.out.println("Enter Number of Shares you want to purchase: ");
        stockInfo.setNoOfShares(sc.nextInt());
        System.out.println("Enter Share Price: ");
        stockInfo.setSharePrice(sc.nextInt());

        portfolio.add(stockInfo);
        System.out.println();
        System.out.println("Stock Added Successfully ");
    }

    public static void addNoOfStock() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of Stock you want to add");
        int noOfStock = sc.nextInt();
        for (int i = 0; i < noOfStock; i++) {
            addStock();
        }
    }

    public static void totalValue() {
        for (Stock stock : portfolio) {
            totalValue = totalValue + (stock.sharePrice * stock.noOfShares);
        }
        System.out.println(totalValue);
    }

    public static void main(String[] args) {

        StockPortfolio stocks = new StockPortfolio();

        int choice = 0;
        while (choice < 4) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter your choice \n 1: Add Stock \n 2: Add Multiple of Stocks \n 3: Display Total value of Stocks \n 0: Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stocks.addStock();
                    break;
                case 2:
                    stocks.addNoOfStock();
                    break;
                case 3:
                    System.out.println("Total value of your stocks is : ");
                    stocks.totalValue();
                    break;
                default:
                    choice = 4;
                    break;
            }
        }
    }
}
