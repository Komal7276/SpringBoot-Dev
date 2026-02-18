import java.util.Vector;

public class UpdateVector {

	public static void main(String[] args) {
		
		Vector<Integer> marks = new Vector<>();
		
		marks.add(35);
		marks.add(20);
		marks.add(88);
		marks.add(70);
		marks.add(99);
		
		System.out.println("Before Update : "+ marks);
		
		marks.set(1, 65); //Update Index 1
		
		System.out.println("After Update : "+ marks);
	}
}
