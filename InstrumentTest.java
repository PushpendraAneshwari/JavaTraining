

public class InstrumentTest {
	public static void main(String[] args) {
		
	/*	Guitar guitar = new Guitar();
		guitar.use();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		
		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bow();
		*/
		
//		Instrument sbmi = new Violin();
//		sbmi.use();
//		sbmi.play();
//		sbmi.tuneStrings();
//		sbmi.bow();
//The method pluck() is undefined for the 
		//type StringBasedMusicalInstrument		
		
	}
}

interface Instrument
{
	void use(); //by default method is public and abstract
}
abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Guitar...");
	}
	void play() {
		System.out.println("Playing Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");

	}
}


class Violin extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Violin...");
	}
	void play() {
		System.out.println("Playing Violin...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");

	}
	void bow() {
		System.out.println("Bowing Strings of Violin...");

	}
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument{
	abstract void blowAir();
}

class Flute extends AirBasedMusicalInstrument{
	public void use() {
		System.out.println("Using Flute...");
	}
	void play() {
		System.out.println("Playing Flute...");
	}
	void blowAir() {
		System.out.println("Blowing air in flute..");
	}
	void pressingHoles() {
		System.out.println("Holes are being pressed..");
	}
	
}

class Harmonium extends AirBasedMusicalInstrument{
	public void use() {
		System.out.println("Using Harmonium...");
	}
	void play() {
		System.out.println("Playing Harm...");
	}
	void blowAir() {
		System.out.println("Blowing air in Harm..");
	}
	void pressingBoxPlates() {
		System.out.println("Box plates are being pressed");
	}
	
}

abstract class DrumBasedMusicalInstrument{
	abstract void tuneSurface();
}

class Tabla extends DrumBasedMusicalInstrument{
	public void use() {
		System.out.println("Using Tabla...");
	}
	void play() {
		System.out.println("Playing Tabla...");
	}
	void tuneSurface() {
		System.out.println("Tuning surface of tabla....");
	}
	void tightenBolts() {
		System.out.println("tightening bolts of tabla...");
	}
}

class Dhol extends DrumBasedMusicalInstrument{
	public void use() {
		System.out.println("Using Dhol...");
	}
	void play() {
		System.out.println("Playing Dhol...");
	}
	void tuneSurface() {
		System.out.println("Tuning surface of Dhol....");
	}
	void tightenDholBolts() {
		System.out.println("tightening bolts of Dhol...");
	}
}


abstract class MedicalInstrument implements Instrument{
	abstract void operate();
}

abstract class SurgicalInstrument extends MedicalInstrument{
	abstract void sterile();
}

class SurgicalCutter extends SurgicalInstrument{ 
	
	public void use() {
		System.out.println("using cutter");
	}
	
	 void operate(){
		System.out.println("operating surgical cutter");
	}
	void sterile() {
		System.out.println("Sterilizing surgical cutter");
	}
	void cuttingStitches() {
		System.out.println("Cutting stitches..");
	}
}

class SurgicalNeedle extends SurgicalInstrument{ 
	
	public void use() {
		System.out.println("using needle");
	}
	void operate(){
		System.out.println("operating surgical needle");
	}
	void sterile() {
		System.out.println("Sterilizing surgical needle");
	}
	void putPin() {
		System.out.println("Putting pin..");
	}
}

abstract class PathologicalInstrument extends MedicalInstrument{
	abstract void reader();
}


class Glucometer extends PathologicalInstrument{ 
	
	public void use() {
		System.out.println("using cGlucometer");
	}
	
	 void operate(){
		System.out.println("operating Glucometer");
	}
	void reader() {
		System.out.println("Reading Glucometer");
	}
	void calcGlu() {
		System.out.println("calc glucose.");
	}
}

class ECGMachine extends PathologicalInstrument{ 
	
	public void use() {
		System.out.println("using ECGMachine");
	}
	
	 void operate(){
		System.out.println("operating ECGMachine");
	}
	void reader() {
		System.out.println("Reading ECGMachine");
	}
	void calcHR() {
		System.out.println("calc heart rate.");
	}
}

