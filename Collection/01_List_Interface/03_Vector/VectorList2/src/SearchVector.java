import java.util.Vector;

public class SearchVector {

	public static void main(String[] args) {
		
		Vector<String> cities = new Vector<>();
		
		cities.add("Latur");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Delhi");
		
		String searchcity = "Latur";
		
		if(cities.contains(searchcity))
		{
			System.out.println(searchcity +" is Present in the Vector");
		}
		else
		{
			System.out.println(searchcity + " is not Present");
		}
	}
}
