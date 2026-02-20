import java.util.LinkedHashSet;

public class CheckEquality {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		
		set2.add(90);
		set2.add(20);
		set2.add(30);
		set2.add(10);
		
		if(set1.equals(set2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}
