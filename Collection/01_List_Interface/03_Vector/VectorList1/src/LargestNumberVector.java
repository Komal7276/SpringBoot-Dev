import java.util.Vector;

public class LargestNumberVector {

	public static void main(String[] args) {
		
		Vector<Integer> numbers = new Vector<>();
		
		numbers.add(10);
		numbers.add(25);
		numbers.add(33);
		numbers.add(70);
		numbers.add(100);
		
		int max = numbers.get(0);
		
		for(int i=1; i<numbers.size(); i++)
		{
			if(numbers.get(i) > max)
			{
				max = numbers.get(i);
			}
		}
		
		System.out.println("Numbers : "+ numbers);
		System.out.println("Largest Number : "+ max);
	}
}
