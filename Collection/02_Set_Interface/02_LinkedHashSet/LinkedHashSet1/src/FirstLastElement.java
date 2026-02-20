import java.util.Iterator;
import java.util.LinkedHashSet;

public class FirstLastElement {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set =  new LinkedHashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Mango");
		set.add("Orange");
		
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		
		String first = null;
		String last = null;
		
		if(itr.hasNext())
		{
			first = itr.next();
			last = first;
		}
		
		while(itr.hasNext())
		{
			last = itr.next();
		}
		
		System.out.println("First Element : "+ first);
		System.out.println("Last Element : " + last);
		
	}
}
