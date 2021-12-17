package practice;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		x = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			int y = x * i;
			System.out.println(x + " x " + i + " = " + y);
		}
	}

}
