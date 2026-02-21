import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Komal");
		names.add("Pratiksha");
		names.add("Mohini");
		names.add("Prachi");
		names.add("Aditi");
		names.add("Shraddha");
		//names.add(null); 	//It gives NullPointerException Error
		
		System.out.println(names);
		
	}
}
