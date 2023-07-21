
public class FootballDetails{
	
	public static void main(String[] args) {
//		Football f3 = new Football();
		Football f1 = new Football("Neymar");
//		Football f2 = new Football(10);
//		f1.setData("L.Messi", 700, 8, 10, 38, 400 );
//		f1.changeGoals(800);
//		f1.getData();
//		System.out.println("He is a " + f1.callMessage());
//		System.out.println("Average goals per day " + f1.averageGoals(800, 400));
		
		f1.sprint();
		f1.sprint(40);
		f1.stride(40, 1.5f);

	}
}

class Football{
	private String FN;
	private int goals;
	private int bdors;
	private int shoesz;
	private int age;
	private int matches;
	
	
//	Football(){
//		System.out.println("Hello Constructor");
//	}
	
//	Football (String lionelMessi, int goals, int x) {
//		this.lionelMessi=  lionelMessi;
//		this.goals = goals;
//		this.bdors = x;
//	}
	
//	Football (int y) {
//		this.shoesz = y;
//	}
	
	Football(String x){
		FN = x;
	}
	
	public void setData(String name, int goals, int bdors, int shoesz, int age, int matches) {
		this.FN = name;
		this.goals = goals;
		this.bdors = bdors;
		this.shoesz = shoesz;
		this.age = age;
		this.matches = matches;
		
	}
	
	public void changeGoals(int chgoals) {
		this.goals = chgoals;
	}
	
	String callMessage() {
		String mssg = "Great Footballer";
		return mssg;
	}
	
	int averageGoals(int goals, int matches) {
		return (((goals)/matches));
	}
	
	public void getData() {
		System.out.println("The name of the player is "+ FN);
		System.out.println("Goals " + goals);
		System.out.println("Ballon Dors " + bdors);
		System.out.println("Shoe size " + shoesz);
		System.out.println("Shoe age " + age);
		System.out.println("Matches " + matches);
	}
	
	void sprint() {
		System.out.println(FN + " is sprinting");
	}
	
	void sprint(int speed) {
		System.out.println(FN + " is sprinting at "+ speed + "km/hr");
	}
	
	void stride(int speed, float length) {
		System.out.println(FN + " is sprinting at "+ speed + "km/hr" +" taking a stride of "+ length +" m");
	}
}

