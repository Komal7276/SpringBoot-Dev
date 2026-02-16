import java.util.List;

public class ArrayList {
	
	public static void main(String[] args) {
		
		List<String> student = new java.util.ArrayList<>();
		
		
		//Elements Added using add(value)
		student.add("Komal");
		student.add("Pratiksha");
		student.add("Mohini");
		student.add("Prachi");
		
		System.out.println(student); //All Added Elements
		
		//Added by using add(index,value)	
		student.add(2,"Sakshi");
		student.add(5,"Aditi");
		
		System.out.println(student);
		//Access element by using index with get(index) method
		System.out.println("Element at Index 1 = " + student.get(1)); 
		System.out.println("Element at Index 2 = " + student.get(2)); 
		System.out.println("All updated Array List =" + student); 
				
		//student updated using set(index,value)
		student.set(1,"Radhika");
		System.out.println("Updated at index 1 : " + student);
		
		student.set(3,"Aarti");
		System.out.println("Updated at index 3 : "+ student);
		
		//remove using remove(value)
		student.remove("Aarti");
		System.out.println("Removed Aarti" + student);
		
		//remove using remove(index)
		student.remove(4);
		System.out.println("Removed using index" + student);
		
		//Added duplicate elements
		student.add("Pratiksha");
		student.add("Prachi");
		
		System.out.println("Added the duplicate elements : "+ student);
		
		//Add null value
		student.add(null);
		student.add(1, null);
		
		System.out.println("Added null values"+ student);
		
	
	
	}
}
