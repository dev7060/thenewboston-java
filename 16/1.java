package kingstroke;
import java.util.Scanner;

class apples {
	public static void main(String args[]) {
		Scanner var = new Scanner(System.in);
		class2 var2 = new class2();
		System.out.println("enter name of first girlfriend here: ");
		String temp = var.nextLine();
		var2.setName(temp);
		var2.saying();
	}
}