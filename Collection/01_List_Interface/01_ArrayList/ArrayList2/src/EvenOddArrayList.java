import java.util.ArrayList;

public class EvenOddArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(15);
		numbers.add(29);
		numbers.add(40);
		numbers.add(55);
		
		System.out.println("Numbers : "+ numbers);
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<numbers.size(); i++)
		{
			int num = numbers.get(i);
			
			if(num % 2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		
		System.out.println("Even Numbers Count : "+ evenCount);
		System.out.println("Odd Numbers Count : "+ oddCount);		
	
	}
}
