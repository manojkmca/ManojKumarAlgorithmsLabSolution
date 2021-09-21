
package com.paymoney;

import java.util.Scanner;

public class PayMoney {
	private int size;
	private int totalTransactions[];
	private int targetNo;

	public void checkIfTargetAchieved() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array:");
		size = sc.nextInt();
		totalTransactions = new int[size];
		System.out.println("Enter the values of Array:");
		for (int i = 0; i < size; i++) {
			totalTransactions[i] = sc.nextInt();
		}
		System.out.println("Enter the total no. of targets that needs to be achieved");
		targetNo = sc.nextInt();
		while (targetNo != 0) {
			int flag = 0;
			int target;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			long totalTarget = 0;
			for (int i = 0; i < size; i++) {
				totalTarget += totalTransactions[i];
				if (totalTarget >= target) {
					System.out.println("Target Achieved in " + (i + 1) + "Transactions");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println("Given Target is not acheived");
			}
		}
	}

}