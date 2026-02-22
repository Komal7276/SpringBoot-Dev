import java.util.Vector;

public class VectorListEx {

	public static void main(String[] args) {
		
		Vector<Integer> numbers = new Vector<>();
		
		//Add elements
		numbers.add(100);
		numbers.add(25);
		numbers.add(45);
		numbers.add(80);
		numbers.add(30);
		
		System.out.println("Vector : "+ numbers);
		
		//Add element at specific index
		numbers.add(2,50);
		System.out.println("After adding at index 2 : "+ numbers);
		
		//Get element
		System.out.println("Element at Index 1 : "+ numbers.get(1));
		
		//Remove element
		numbers.remove(Integer.valueOf(80));
		System.out.println("After Remove : "+ numbers);
		
		//Size
		System.out.println("Size : "+ numbers.size());
		
		//Check if contains element
		System.out.println("Contains 40? " + numbers.contains(40));
		
		//List using for-each loop
		System.out.println("Using for-each loop  : ");
		
		for(Integer num : numbers)
		{
			System.out.println(num);
		}
	}
}
