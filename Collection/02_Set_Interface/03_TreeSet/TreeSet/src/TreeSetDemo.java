import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(90);
		numbers.add(10);
		numbers.add(23);
		numbers.add(55);
		numbers.add(30);
		numbers.add(40);
		//numbers.add(null); 	//It gives the NullPointerException Error
		
		System.out.println(numbers);
	}
}
