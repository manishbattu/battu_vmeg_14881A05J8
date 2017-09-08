import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
	
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		students[0]=student;
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int i=students.length;
		students[i-1]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		students[index]=students[index+1];
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	 int n=students.length;
	 for(int i=0;i<n;i++)
	 {
		 if(students[i]==student)
		 {
			 students[i]=students[i+1];
		 }
	 }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		int n=students.length;
		for(int i=0;i<n;i++)
		{
			if(students[i]==students[index])
			{
			students[i]=students[i+1];
			}
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int n=students.length;
		Student temp;
		for(int i=0;i<n;i++)
		{
			temp=students[i];
			students[i]=students[i+1];
			students[i+1]=temp;
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int n=students.length;
		Student temp=student;
		for(int i=0;i<n;i++)
		{
			if(students[i]==student)
			{
				temp=students[i+1];
			}
		}
		return temp;
	}
}
