import java.util.TreeSet;

public class DescendingOrder {

	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<>();
	
		numbers.add(10);
		numbers.add(50);
		numbers.add(35);
		numbers.add(78);
		numbers.add(98);
		numbers.add(20);
		
		System.out.println("Ascending : " + numbers);
		
		System.out.println("Descending : " + numbers.descendingSet());
	
	}
}
