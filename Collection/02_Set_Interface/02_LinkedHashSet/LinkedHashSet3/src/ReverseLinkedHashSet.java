import java.util.LinkedHashSet;

public class ReverseLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(70);
		set.add(100);
		
		System.out.println("Original LinkedHash Set : "+ set);
		
		Object arr[] = set.toArray();
		
		System.out.print("Reversed Order : [");
		
		for(int i = arr.length - 1; i >= 0; i--)
		{
			System.out.print(arr[i]);
			
			if(i != 0)
			{
				System.out.print(", ");
			}
		}
		
		System.out.print("]");
	}
}
