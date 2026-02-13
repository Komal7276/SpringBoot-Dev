public class Basic {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Komal");
													
		System.out.println(e1); 	
		//Without overriding of toString() method  output:- Employee@4517d9a3
		//With overriding of toString() output:- Employee [id=101, name=Komal]
		
		System.out.println(e1.toString()); 		
		//Without overriding of toString() method  output:- Employee@4517d9a3
		//With overriding of toString() output:- Employee [id=101, name=Komal]	
	}
}

class Employee
{
	private int id;
	private String name;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
}
