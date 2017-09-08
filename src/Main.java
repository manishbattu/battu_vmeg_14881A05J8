public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Student[] student=new Student[5];
		StudentGroup sg=new StudentGroup(5);
		sg.setStudents(student);
		sg.getStudents();
		sg.bubbleSort();
		sg.removeFromIndex(3);
		sg.remove(student[0]);
		sg.remove(2);
		sg.addLast(student[0]);
		sg.add(student[3],3);
		sg.addFirst(student[0]);

		
	}

}
