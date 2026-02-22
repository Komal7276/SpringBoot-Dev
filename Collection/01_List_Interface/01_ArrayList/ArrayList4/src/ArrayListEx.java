import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Komal");
		names.add("Radhika");
		names.add("Aarti");
		names.add("Mohini");
		names.add("Piya");
		
		//Display List
		System.out.println("ArrayList : " + names);
		
		//Get Element
		System.out.println("Second Element : " + names.get(1));
		
		//Update Element
		names.set(3, "Advik");
		System.out.println("After Update : "+ names);
		
		//Remove Element
		names.remove("Piya");
		System.out.println("After Remove : "+ names);
		
		//Size of List
		System.out.println("Size : "+ names.size());

		
		//Loop through ArrayList
		System.out.println("Using For Loop : ");
		
		for(int i=0; i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
	}
}
