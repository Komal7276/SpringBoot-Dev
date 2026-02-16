import java.util.ArrayList;

public class StudentResult {

	public static void main(String[] args) {
		
		ArrayList<Integer> totalMarks = new ArrayList<>();
		
		totalMarks.add(240);
		totalMarks.add(270);
		totalMarks.add(210);
		totalMarks.add(270);
		
		System.out.println("Student Results  : ");
		
		for(int i=0; i<totalMarks.size(); i++)
		{
			int marks = totalMarks.get(i);
			
			double percentage = (marks / 300.0) * 100;
			
			System.out.println("\nStudent : "+ (i+1));
			System.out.println("Total Marks : "+ marks);
			System.out.println("Percentage : "+percentage+ "%");
			
			
			if(percentage >= 75)
			{
				System.out.println("Grade: Distinction");
			}
			
			else if(percentage >=60)
			{
				System.out.println("Grade: First Class");
			}
			
			else if(percentage >= 50)
			{
				System.out.println("Grade: Second Class");
			}
			else
			{
				System.out.println("Grade: Fail");
			}
			
			System.out.println("---------------------");
			
		}
	}
}
