package java100;

import java.util.Scanner;



public class GetInputFromUser_4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = obj.nextLine();
		
		//System.out.println("");
		System.out.println("enter the roll no ");
		int rollno = obj.nextInt();
	
		System.out.print("Enter the rankstatus");
		obj.nextLine();
		String status = obj.nextLine();
		
		System.out.println("the name is "+name);
		System.out.println("the roll number is "+rollno);
		System.out.println("the rank status is "+status);
	}

}
 