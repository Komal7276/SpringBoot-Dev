import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		//Create LinkedList
		LinkedList<String> cars = new LinkedList<>();
		
		//Add elements
		cars.add("BMW");
		cars.add("Mahindra");
		cars.add("Toyota");
		cars.add("Hyundai");
		
		System.out.println("LinkedList : "+ cars);
		
		//Add element at first and last
		cars.addFirst("Audi");
		cars.addLast("Mercedes");
		
		System.out.println("After addFirst and addLast : "+ cars);
		
		//Get elements
		System.out.println("First Element : "+ cars.getFirst());
		System.out.println("Last Element : "+ cars.getLast());
		
		//Remove Element
		cars.remove("Mercedes");
		System.out.println("After Remove : "+ cars);
		
		//Size
		System.out.println("Size : "+ cars.size());
		
		//List using for-each loop
		System.out.println("\nUsing for-each loop : ");
		
		for(String car : cars)
		{
			System.out.println(car);
		}
		
	}
}
