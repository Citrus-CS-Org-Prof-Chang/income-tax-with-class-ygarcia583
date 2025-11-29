package edu.pasadena.cs.cs03b;

import java.util.Scanner

public class Dummy {

	public static void main(String[] args) {
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

	public static int dummy() {
		
		
		// TOOD: add your logic here

		return 1;
	}

}
