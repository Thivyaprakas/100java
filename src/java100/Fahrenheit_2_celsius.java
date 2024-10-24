package java100;

import java.util.Scanner;

public class Fahrenheit_2_celsius {

	public static void main(String[] args) {
		System.out.println("enter the temperature in fahrenheit");
		Scanner obj1 = new Scanner(System.in);
		int fahrenhiet = obj1.nextInt();
		double celsius =((fahrenhiet-32)*5)/9;
		System.out.println("the temperature in celsius "+celsius);
	
	}

}
