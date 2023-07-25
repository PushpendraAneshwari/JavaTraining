
public class MyFinal {
	public static void main(String[] args) {
		virtualReality virObj = new virtualReality();
		virObj.touchingObjects();
	}
}

final class Reality{
	
	void touchingObjects() {
		System.out.println("Touching the objects physically...");
	}
}

class virtualReality extends Reality{
	
	void touchingObjects() {
		super.touchingObjects();
		System.out.println(" +Touching objects virtually");
	}
}
