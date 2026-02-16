import java.util.ArrayList;
import java.util.Collections;

public class NumberManager {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(15);
		numbers.add(20);
		numbers.add(40);
		numbers.add(8);
		numbers.add(100);
		numbers.add(44);
		
		System.out.println("Numbers : "+numbers);
		
		int max = Collections.max(numbers);
		System.out.println("Largest Number : "+ max);
		
		int min = Collections.min(numbers);
		System.out.println("Smallest Number : "+min);
		
		int sum = 0;
		
		for(int i=0; i<numbers.size(); i++)
		{
			sum = sum + numbers.get(i);
		}
		
		System.out.println("Sum : "+ sum);
		
		double average = sum / (double) numbers.size();
		System.out.println("Average : "+ average);
		
		int search = 30;
		
		if(numbers.contains(search))
		{
			System.out.println(search + " is Present in the list");
		}
		
		else
		{
			System.out.println(search + " is not present in the list");
		}
		
		//Remove a number
		numbers.remove(Integer.valueOf(8));
		System.out.println("After Removing 8 : "+ numbers);

		//Sort the list
		Collections.sort(numbers);
		System.out.println("Sorted List : "+numbers);
		
		//Reverse the List
		Collections.reverse(numbers);
		System.out.println("Reversed List : "+ numbers);
		
	}
}
