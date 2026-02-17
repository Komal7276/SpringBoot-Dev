import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Komal");
		names.add("Pratiksha");
		names.add("Mohini");
		names.add("Prachi");
		
		System.out.println("Names : "+ names);
		System.out.println("First Element : "+ names.getFirst());
		
		names.remove("Prachi");
		System.out.println("After Removing Prachi : "+ names);
		
	}
}
