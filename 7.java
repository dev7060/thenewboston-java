package kingstroke;
import java.util.Scanner;

class apples {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = obj.nextDouble();
		System.out.println("Enter second num: ");
		snum = obj.nextDouble();
		answer = fnum + snum ;
		System.out.println(answer);
	}
}