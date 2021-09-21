package com.currencydenomination;

import java.util.Scanner;

public class CurrencyDenominations {
	int size;
	int denominations[];

	public void getInputs() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations ");
		size = sc.nextInt();

		denominations = new int[size];
		System.out.println("Enter the currency denomination value ");

		for (int i = 0; i < denominations.length; i++)
			denominations[i] = sc.nextInt();
	}

}
