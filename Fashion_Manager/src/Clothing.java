import java.util.ArrayList;

/**
 * All clothes will have a name, category, and color
 * They will also have a boolean for dirty, though note shoes will never use this, I just dont wanna make *another* class
 * Dresses will be implemented as a set of top and bottom, each with a matching dressvalue
 * This value will be 0 if it is not a dress, allowing for easy access to it being like a boolean, but with a match
 * @author Sophie
 *
 */
public abstract class Clothing {
	private String name, category;
	private int dressValue;
	private ArrayList<Integer> colors;
	private boolean dirty;
	
	//constructor, takes in an array of size 2 of colors, a name string, and a category string
	public Clothing(String name, String category, ArrayList<Integer> colors, int dressValue) {
		this.name = name;
		this.category = category;
		this.colors = colors;
	    this.dirty = false;
	    this.dressValue = dressValue;
	}
	
	/**
	 * returns the name
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * returns the category
	 * @return
	 */
	public String getCategory() {
		return this.category;
	}
	
	/**
	 * returns the colors in array form
	 * @return
	 */
	public ArrayList<Integer> getColors() {
		return colors;
	}
	
	/**
	 * returns the dress value, 0 if not a dress
	 * @return
	 */
	public int getDressValue() {
		return dressValue;
	}
	
	/**
	 * returns the dirty status, true if dirty
	 * @return
	 */
	public boolean isDirty() {
		return dirty;
	}
	
	/**
	 * makes the item dirty (sets to true)
	 */
	public void makeDirty() {
		this.dirty = true;
	}
	
	/**
	 * cleans the item (sets to false)
	 */
	public void clean() {
		this.dirty = false;
	}
	
	public void wear() {
		this.makeDirty();
	}
	
	/**
	 * for the output, converts color list to color or color1/color2 if 2 colors
	 * @return
	 */
	public String colorString() {
		String colorString = Converter.intToColor(colors.get(0));
		for(int i = 1; i < colors.size(); i++)
			colorString.concat("/" + Converter.intToColor(colors.get(i)));
		return colorString;
	}
}
