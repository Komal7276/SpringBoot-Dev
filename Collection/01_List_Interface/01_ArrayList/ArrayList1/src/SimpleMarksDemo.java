import java.util.ArrayList;

public class SimpleMarksDemo {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> marks = new ArrayList<>();

		marks.add(88);
		marks.add(90);
		marks.add(80);
		
		System.out.println("Marks : "+ marks);
		
		int sum = 0;
		
		for(int i = 0; i<marks.size(); i++)
		{
			sum = sum + marks.get(i);
		}
		
		System.out.println("Total Merks : "+ sum);
		
		double average = sum / marks.size();
		
		System.out.println("Average : "+ average);

	}
	
}
