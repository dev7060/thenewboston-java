package kingstroke;
import java.util.Scanner;

class apples {
	public static void main(String args[]) {
		Scanner var = new Scanner(System.in);
		class2 var2 = new class2();
		
		System.out.println("Enter your name here: ");
		String name = var.nextLine();
		var2.simpleMessage(name);
	}
}