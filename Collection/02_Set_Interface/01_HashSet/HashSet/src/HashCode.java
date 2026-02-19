import java.util.HashSet;

public class HashCode {

	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(30); 	//----
		numbers.add(20); 	//   |---->> Does not allow duplicate values
		numbers.add(10); 	//----
		numbers.add(null);
		numbers.add(null); 	//Only allow one null value
							//Insertion order is not maintained in HashSet
		
		System.out.println("HashSet Elements : "+numbers);
	}
}
