import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,20,50,30};
		
		System.out.println("Original List : "+ Arrays.toString(arr));
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int i = 0; i < arr.length; i++)
		{
			set.add(arr[i]);
		}
		
		System.out.println("After Removing Duplicates : "+ set);
	}
}
