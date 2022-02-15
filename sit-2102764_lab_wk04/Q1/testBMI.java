package Q1;

import java.util.Scanner;

public class testBMI extends BMI{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double weight, height;

		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		height = input.nextDouble();

		BMI P0001 = new BMI(height, weight);
		P0001.printOutput();
		input.close();
	}
}
