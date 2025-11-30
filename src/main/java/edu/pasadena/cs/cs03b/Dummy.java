package edu.pasadena.cs.cs03b;

import java.util.Scanner;

public class Dummy {

	 {
	public static double getTaxRate(double annualIncome)

	    int[] salaryTable = {20000, 5000, 100000, Integer.Max_Value};
		double[] taxRateTable = {0.10,0.20, 0.30, 0.40};

		for (int i = 0; i < salaryTable.length; i++) {
			if (annualIncome <= salaryTable [i]) {
				return taxRateTable[i];
			}
		}

		return taxRateTable[taxRateTable.length - 1];
	}

	public static double calculateTax (double annualIncome) {
		double rate = getTaxRate(annualIncome);
		return annualIncome * rate;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) { 
			System.out.println("Enter annual income (-1 to exit): ");
			double income = scanner.nextDouble();

			if (income == -1) {
				System.out.println("Exiting the program.");
				break;
			}
			
			double taxRate = getTaxRate(income);
			double taxAmount = calculateTax(income);

			System.out.printf("Annual Income: %.2f Tax rate: %.2f%% Tax to pay: %.2f%n", income, taxRate * 100, taxAmount);
		}

		scanner.close();
	}
	public static int dummy() {
		
		
		// TOOD: add your logic here

		return 1;
	}

}
