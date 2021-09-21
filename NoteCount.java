package com.currencydenomination;

import java.util.Scanner;

public class NoteCount {
	static int AmountWantToPay;

    public static void main(String[] args) {
        SortDenominations mySort = new SortDenominations();
        CurrencyDenominations myDenominations = new CurrencyDenominations();
        Scanner sc = new Scanner(System.in);

        myDenominations.getInputs();
        mySort.sort(myDenominations.denominations, 0, myDenominations.denominations.length-1);
        int[] NotesOrder = new int[myDenominations.denominations.length];

        System.out.println("Enter the amount you want to pay ");
        AmountWantToPay = sc.nextInt();

        int j = 0;

        for(int i=0;i<myDenominations.denominations.length;i++)
        {
           if(Integer.valueOf(AmountWantToPay/myDenominations.denominations[i])>0)
           {
            //    System.out.println("Left over Amount => " + AmountWantToPay);
               NotesOrder[i] = Integer.valueOf(AmountWantToPay/myDenominations.denominations[i]);
               AmountWantToPay -= myDenominations.denominations[i] * NotesOrder[i];
           } 
        }
        
        System.out.println("Your payment approach in order to give min no of notes will be ");
        for (int i = 0; i < NotesOrder.length; i++) {
            System.out.println(myDenominations.denominations[i]+":"+ NotesOrder[i]);
        }
    }
}