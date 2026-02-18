
public class Vector {

	public static void main(String[] args) {
		
		java.util.Vector<String> names = new java.util.Vector<>();
		
		names.add("Komal");
		names.add("Pratiksha");
		names.add("Mohini");
		
		System.out.println("Names : "+ names);
		
		names.remove("Mohini");
		System.out.println("After Remove : "+ names);
		
		System.out.println("Size : "+ names.size());
	}
}
