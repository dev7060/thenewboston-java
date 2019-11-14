package kingstroke;

class apples {
	public static void main(String args[]) {
		int age;
		age = 7;
		/*
		if(age == 1) {
			System.out.println();
		}
		if(age == 2) {
			SOP
		}
		*/
		switch (age) {
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get things done");
			break;
		default:
			System.out.println("I don't know how old you are!");
			break;
		}
	}
}