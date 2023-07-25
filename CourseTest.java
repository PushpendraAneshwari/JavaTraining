
public class CourseTest {
	public static void main(String[] args) {
		MBBS mbbsObj = new MBBS();
		mbbsObj.chooseCourse();
		mbbsObj.chooseBioCourse();
		mbbsObj.diagnose();
	}
}

interface Course{
	void chooseCourse();
}

abstract class MathCourse implements Course{
	abstract void chooseMathCourse();
}

class BTech extends MathCourse{
	public void chooseCourse() {
		System.out.println("Choosing course...");
	}
	
	void chooseMathCourse() {
		System.out.println("Choosing Math Course...");
	}
	void makingRobots() {
		System.out.println("B.Tech students creating robots...");
	}
}

abstract class CommerceCourse implements Course{
	abstract void chooseCommerceCourse();
}

class BCom extends CommerceCourse{
	public void chooseCourse() {
		System.out.println("Choosing course...");
	}
	
	void chooseCommerceCourse() {
		System.out.println("Choosing Commerce Course...");
	}
	
	void managingAcoounts() {
		System.out.println("Managing accounts...");
	}
}

abstract class BioCourse implements Course{
	abstract void chooseBioCourse();
}

class MBBS extends BioCourse{
	public void chooseCourse() {
		System.out.println("Choosing course...");
	}
	
	void chooseBioCourse() {
		System.out.println("Choosing Bio Course...");
	}
	
	void diagnose() {
		System.out.println("Diagnosing patients...");
	}
}





