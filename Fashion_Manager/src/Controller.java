/**
 * This will be the base class that calls methods, and reads in inputs from the command line currently, may setup io later.
 * @author Sophie
 *
 */
public class Controller {

	static Catalog catalog;
	static OutfitPlan plan;
	static int start, wash, numDays;
	
	//This is the code that runs everything
	//I will try to keep most things in methods for readability sake
	public static void main(String[] args) {
		
		//runs setup
		setUp(args);
		
		//loop though days, starting on given day
		//washes when the washday is hit
		for(int i = start; i < numDays + start; i++) {
			generateOutfit();
			if(i % 7 == numDays)
				wash();
		}
		
		return;
	}

	/**
	 * This is the code that sets up the files, reads in from them, and initializes all of our objects
	 * @param args it is passed the command line arguments, this is what made the code look the cleanest
	 */
	private static void setUp(String[] args) {
		catalog = new Catalog();
		
		String settingsFile = args[0];
		String catalogFile = args[1];
		
		IO.settings(start, wash, numDays, settingsFile);
		IO.input(catalog, catalogFile);
		plan = new OutfitPlan();
	}
	
	//Recursive method to actually fill out, make sure to run wash when it needs to be washed, and honestly
	//I would say have it lock in once a wash is hit, and create maybe a new recursive call
	private static void plan() {
		
	}
	
	//Use this to generate an outfit using the needed constraints
	private static void generateOutfit() {
		
	}
	
	/**
	 * this method will reset all of the clothes dirty status to false
	 * I might not implement it yet
	 */
	private static void wash() {
		for(int i = 0; i < catalog.getTops().size(); i++) {
			catalog.getTops().get(i).clean();
		}
		for(int i = 0; i < catalog.getBottoms().size(); i++) {
			catalog.getBottoms().get(i).clean();
		}
		for(int i = 0; i < catalog.getShoes().size(); i++) {
			catalog.getShoes().get(i).clean();
		}
	}	
}
