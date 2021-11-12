import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is an IO class, need input form files for fashion catalog
 * @author Sophie
 *
 */
public class IO {

	/**
	 * reads in the fashion catalog, is has the following format
	 * type, name, category (like jeans vs sweats), color(s) (read in colors until endline)
	 * 1 Thing per line.
	 */
	public static void input(Catalog c, String filePath) {
		
		//setting up file path
		File f = new File(filePath);
		Scanner sc = null;
		try {
			sc = new Scanner(f);		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//definining variables to add to the catalog
		String type, name, category;
		int dressValue = 1;
		
		//scans each line, and gets the type, then the name, then the category
		while(sc.hasNextLine()) {
			type = sc.next();
			name = sc.next();
			category = sc.next();
			
			//This whole section is to add the colors. If it sees a "/" it will add both colors, and break it down
			//if it doesn't it adds 1 color and then adds none (yes I should have done this with a list probably).
			//it cuts off colors in the string including the "/" until there isn't one, then it adds the final color
			ArrayList<Integer> colors = new ArrayList<Integer>();
			String colorString = sc.next();
			while(colorString.contains("/")) {
				int index = colorString.indexOf("/");
				String color1 = colorString.substring(0, index);
				colors.add(Converter.colorToInt(color1));
				colorString = colorString.substring(index + 1);
			}
			
			colors.add(Converter.colorToInt(colorString));
			
			//sees the type and then adds that type of garment to the catalog
			//Dresses set both a top and a bottom, with a matching dress value, the rest get a 0 for that field
			if(type.equals("Dress")) {
				Top top = new Top(name, category, colors, dressValue);
				c.getTops().add(top);
				Bottom bottom = new Bottom(name, category, colors, dressValue);
				c.getBottoms().add(bottom);
				dressValue++;
			}
			if(type.equals("Top")) {
				Top top = new Top(name, category, colors, 0);
				c.getTops().add(top);
			}
			if(type.equals("Bottom")) {
				Bottom bottom = new Bottom(name, category, colors, 0);
				c.getBottoms().add(bottom);			
			}
			if(type.equals("Shoes")) {
				Shoes shoes = new Shoes(name, category, colors, 0);
				c.getShoes().add(shoes);
			}
		}
		
		sc.close();
		return;
	}
	
	/**
	 * input is given in the following way
	 * Start day, wash day, number of days to generate outfits for. String, String, int
	 * @param i
	 */
	public static void settings(int start, int wash, int days, String filePath) {
		
		//setting up file path
		File f = new File(filePath);
		Scanner sc = null;
		try {
			sc = new Scanner(f);		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//reads in and sets everything, uses converter methods
		//very straightforward
		String startString = sc.next();
		String washString = sc.next();
		start = Converter.dayToInt(startString);
		wash = Converter.dayToInt(washString);
		days = sc.nextInt();
				
		sc.close();
		return;
	}
	
	/**
	 * this will output the outfit plan that has been made
	 * just call the toString method that will be implemented in OutfitPlan
	 * @param o
	 */
	public static void output(OutfitPlan o, String filePath) {	
		System.out.println(o.toString());		
		return;
	}
}
