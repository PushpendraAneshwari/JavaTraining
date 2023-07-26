
public class WashingMachineTest2{
	public static void main(String[] args) {
		
		WashingPowder washPowder = new WashingPowder(1000,"Nirma","Top Load", true, 10.0f);
		
		Water water = new Water("Soft",25,"40C");
		
		Electricity elect = new Electricity("ac",210f,18,5,"Adani");
		
		Cloth cloth[] = new Cloth[3];
		cloth[0] = new Cloth("Silk","Red",1600,"Kurti", false);
		cloth[1] = new Cloth("Polyster","Blue",400,"T Shirt", false);
		cloth[2] = new Cloth("Cotton","White",900,"Shirt",false);
		
		WashingMachine washingMachine1  = new WashingMachine();
		WashingMachine washingMachine2  = new WashingMachine();
		WashingMachine washingMachine3  = new WashingMachine();
		
		washingMachine1.start();
		washingMachine2.start();
		washingMachine3.start();
		
		try {
			washingMachine1.join();
			washingMachine2.join();
			washingMachine3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Laundry laundry = washingMachine1.wash(washPowder, water, elect, cloth);
		
		System.out.println(laundry.toString());
	}
}

class Machine{
	
}

class WashingMachine extends Thread{
	
	public void run() {
		System.out.println("Washing machine is runnig...");
	}
	
	static Laundry wash(WashingPowder washPowder, Water water, Electricity elect, Cloth cloth[]) {
		Laundry laundry = new Laundry();
		laundry.setNumberOfCloths(cloth.length);
		laundry.setTimeRequired(4.9f);
		laundry.setWaterUsed(water.getQuantity());
		laundry.setElectricityUsed(elect.getUnitUsed());
		laundry.setCostOfWashingPowder(washPowder.getPrice());
		float cost = washPowder.getPrice() + elect.getUnitUsed()*elect.getCostPerUnit();
		laundry.setTotalCost(cost);
		
		return laundry;
	}
	
}

class Laundry{
	private int numberOfCloths; //cloth.length
	private float timeRequired;
	private float totalCost ;// cloth.length * price per cloth
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder; //
	
	public Laundry() {
		
	}
	
	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}
	
	

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder + "]";
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}
	
}

class Tub{
	
}

class WashingTub extends Tub{
	private int capacity;
	private String type;
	
	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

class Powder{
	
}

class ElectricityNotFoundEx extends Runtime{
	
}

class WashingPowder extends Powder{
	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;
	
	
	public WashingPowder(int quantity, String brand, String type, boolean scented,float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

class WaterNotFoundEx extends Exception{
	WaterNotFoundEx(String msg){
		super(msg);
	}
}

class Water {
	private String type;
	private int quantity;
	private String temperature;
	double val = Math.random()%10;
	
	if(val >0.98) {
		WaterNotFoundEx wt = new WaterNotFoundEx("No water");
		throw wt;
	}
	
	public Water throws Exception(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
}

class ElectricityNotFoundEx extends Runtimeexception{
	ElectricityNotFoundEx(String msg){
		super(msg);
	}
}
class Electricity{
	private String type;
	private float voltage;
	private int costPerUnit;
	private int unitUsed;
	private String supplier;
	double val = Math.random()%10;
	
	if(val > 0.96) {
		System.out.println("Electricity not found...");
		ElectricityNotFoundEx ex = new ElectricityNotFoundEx();
		throw ex;
	}
	
	public Electricity(String type, float voltage, int costPerUnit, int unitUsed, String supplier) {
		super();
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}

	public int getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	public int getUnitUsed() {
		return unitUsed;
	}

	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
}

class Cloth{
	private String material;
	private String color;
	private float cost;
	private String type;
	private boolean clean;
	
	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}
	
}
