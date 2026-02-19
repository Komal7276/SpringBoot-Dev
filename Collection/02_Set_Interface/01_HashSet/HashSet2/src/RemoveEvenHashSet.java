import java.util.HashSet;

public class RemoveEvenHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> numbers =  new HashSet<>();
		
		numbers.add(10);
		numbers.add(37);
		numbers.add(55);
		numbers.add(98);
		numbers.add(70);
		
		System.out.println("Original Set : "+ numbers);
		
		HashSet<Integer> newSet = new HashSet<>();
		
		Object arr[] = numbers.toArray();
		
		for(int i = 1; i < arr.length; i++)
		{
			int num = (int) arr[i];
			
			if(num % 2 != 0)
			{
				newSet.add(num);
			}
		}
		
		System.out.println("After Removing Even Numbers : "+ newSet);
	}
}
