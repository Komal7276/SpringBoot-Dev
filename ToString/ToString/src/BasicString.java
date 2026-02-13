
/* toString() :-
 * 
 * --toString() is a method of the Object class used to return a string representation of an object.
 * --By default, it prints ClassName@HashCode, which is not meaningful.
 * --When override it then it returns object data in readable form.
 * --It is automatically called when an object is printed directly or through collections like HashSet.
 * --Overriding toString() improves readability, debugging, and clean coding.
 */

import java.util.HashSet;
import java.util.Set;

public class BasicString {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Aarti");
		Customer customer2 = new Customer(2,"Radhika");
	
		
		Set<Customer> set = new HashSet<>();
		
		set.add(customer1);
		set.add(customer2);
		
		System.out.println(set);
		
		System.out.println(customer1.toString());
		System.out.println(customer2.toString());
		
		
		
	}
}

class Customer
{
	private int id;
	private String name;
	
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}
