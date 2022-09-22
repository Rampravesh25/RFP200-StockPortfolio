package com.bl.deck_of_card;

import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {

        int numberShow[] = new int[36];
        String cardShow[] = new String[36];

        String[][] cards = new String[36][36];

        Random r = new Random();

        int numbers, cardName;
        String cardNamePrint = "";

        for (int i = 0; i < 36; i++) {
            numbers = r.nextInt(13) + 1;
            numberShow[i] = numbers;
            cardName = r.nextInt(4);
            switch (cardName) {
                case 0:
                    cardNamePrint = "Clubs";
                    break;
                case 1:
                    cardNamePrint = "Diamonds";
                    break;
                case 2:
                    cardNamePrint = "Hearts";
                    break;
                case 3:
                    cardNamePrint = "Spades";
                    break;
            }
            cardShow[i] = cardNamePrint;
        }

        int k = 0;
        while (k < 4) {
            System.out.println("player "+(k+1)+" has cards : ");
            for (int i = 0; i < 9; i++) {
                System.out.print(numberShow[i]+" of "+cardShow[i]+", ");
            }
            System.out.println();
            k++;
        }
    }
}
