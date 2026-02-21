import java.util.TreeSet;

public class SetList {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(10);
		set.add(25);
		set.add(90);
		set.add(50);
		set.add(33);
		set.add(100);
		set.add(58);
		set.add(70);
		
		System.out.println("List : " + set);
		System.out.println("First Number : " + set.first());
		System.out.println("Last Number : " + set.last());
		System.out.println("Higher than 50 : " + set.higher(50));
		System.out.println("Lower than 50 : " + set.lower(50));
		
		System.out.println("All Higher than 33 : " + set.tailSet(33));
		System.out.println("All Lower than 50 : " + set.headSet(50) );
		
		
	}
}
