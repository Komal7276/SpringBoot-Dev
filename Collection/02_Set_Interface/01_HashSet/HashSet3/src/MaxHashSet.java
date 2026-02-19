import java.util.HashSet;

public class MaxHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(10);
		numbers.add(26);
		numbers.add(39);
		numbers.add(70);
		numbers.add(85);
		
		int max = Integer.MIN_VALUE;
		
		Object arr[] = numbers.toArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			int num = (int) arr[i];
			
			if(num > max)
			{
				max = num;
			}
		}
		
		System.out.println("Numbers : " + numbers );
		System.out.println("Maximum Value : "+ max);
	}
}
