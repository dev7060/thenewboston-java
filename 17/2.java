package kingstroke;

public class class2 {
	private String girlName;
	
	public class2(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("your first gf was %s", getName());
	}
}
