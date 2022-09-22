package com.bl.account;

import java.util.Scanner;

public class BalanceAccount {
    private int amount = 2000;

    int getAmount() {
        return amount;
    }

    public void Debit(int amount) {
        if (amount >= this.amount) {
            System.out.println("please enter amount less than that");
            return;
        }
        this.amount = this.amount - amount;
        System.out.println("Remaining Balance is : "+this.getAmount());
    }
}

class GetBalance extends BalanceAccount {
    public static void main(String[] args) {
        GetBalance get = new GetBalance();
        System.out.println("enter amount to debit from account : ");
        Scanner sc = new Scanner(System.in);
        get.Debit(sc.nextInt());

    }
}
