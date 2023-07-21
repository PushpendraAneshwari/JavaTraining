
public class ClassExtensionTest {

	public static void main(String[] args) {
		Surgeon x = new Surgeon();
		x.diagnose();
		x.prescribe();
		x.charge();
		x.cut();
		x.stitch();
		
		if(x instanceof Doctor) {
			System.out.println("Its a Doctor's instance");
		}
		else {
			System.out.println("Its not a Doctor's instance");
		}
		
		System.out.println("--------------------------");
		
		if(x instanceof Surgeon) {
			System.out.println("Its a Surgeons's instance");
		}
		else {
			System.out.println("Its not a Surgeons's instance");
		}
		
		System.out.println("--------------------------");
		
		if(x instanceof HeartSurgeon) {
			System.out.println("Its a HeartSurgeon's instance");
		}
		else {
			System.out.println("Its not a HeartSurgeon's instance");
		}
	}

}

class Doctor{
	void diagnose() {
		System.out.println("Doctor is Diagnosing");
	}
	void prescribe() {
		System.out.println("Doctor is prescibing RGB pills");
	}
	void charge() {
		System.out.println("charge : 300");
	}
}
class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("Surgeon is Diagnosing");
	}
	void prescribe() {
		System.out.println("Surgeon is prescribing expensive pills");
	}
	void charge() {
		System.out.println("charge : 1000");
	}
	void cut() {
		System.out.println("Surgeon is cutting");
	}
	void stitch() {
		System.out.println("Surgeon is stiching");
	}
	
}
class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("HeartSurgeon is Diagnosing");
	}
	void prescribe() {
		System.out.println("HeartSurgeon is exercise");
	}
	void charge() {
		System.out.println("charge : 3000");
	}
}
