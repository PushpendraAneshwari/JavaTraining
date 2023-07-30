
public class ClassTest {
	public static void main(String[] args) {
		
		Student stud1 = new Student("Atul", 78);
		Student stud2 = new Student("Aman", 20);
		Teacher teacherRef = new Teacher();
		PerformanceSheet pfSheetRef1 = teacherRef.performance(stud1);
		pfSheetRef1.displayResult(stud1);
		System.out.println("==================");
		PerformanceSheet pfSheetRef2 = teacherRef.performance(stud2);
		pfSheetRef2.displayResult(stud2);
		
	}
}


class Student{
	String name;
	int marks;
	
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		if(marks > 100) {
			throw new RuntimeException("Marks can't be greater than 100");
		}else {
			this.marks = marks;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
		
	void displayStudent() {
		System.out.println("Name of the Student "+ name);
		System.out.println("Marks of the Student "+ marks);
	}
}

class PerformanceSheet{
	String result;
	char section;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	
	void displayResult(Student x) {
		System.out.println("The result of student "+x.name+" is " + result  );
		if(result == "pass") {
			this.section = 'A';
			System.out.println("The student named "+x.name+ "has been assigned section "+ section);
		}
		else if(result == "fail") {
			this.section = 'B';
			System.out.println("The student named "+x.name+ " has been assigned section "+ section);
		}
	}
	
	
}

class Teacher{
	PerformanceSheet performance(Student sRef) {
		System.out.println("The name of the student is " + sRef.name);
		System.out.println("The marks of the student is " + sRef.marks);
		
		PerformanceSheet psRef = new PerformanceSheet();
		
		
		if(sRef.marks > 33) {
			psRef.result = "pass";
		}else {
			psRef.result = "fail";
		}
		
		return psRef;
	}
	
}




