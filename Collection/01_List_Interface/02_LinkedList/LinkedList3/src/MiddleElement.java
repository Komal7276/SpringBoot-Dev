import java.util.LinkedList;

public class MiddleElement {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(76);
		numbers.add(99);
		numbers.add(100);
		numbers.add(45);
		numbers.add(80);
		numbers.add(25);
		
		System.out.println("Numbers : "+ numbers);
		
		int middleIndex = numbers.size() / 2;
		
		int middleElement = numbers.get(middleIndex);
		
		System.out.println("Middle Element : "+ middleElement);
 	}
}
