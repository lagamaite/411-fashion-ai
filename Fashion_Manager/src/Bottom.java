import java.util.ArrayList;

/**
 * bottoms have a uses field, where jeans can used twice
 * This is both accurate, makes it look like we have to think about, and I did it so here we are oops
 * @author Sophie
 *
 */
public class Bottom extends Clothing{

	private int uses;
	
	/**
	 * Writing a comment because it sets the uses field in here, worth mentioning
	 * @param name
	 * @param category
	 * @param color
	 */
	public Bottom(String name, String category, ArrayList<Integer> color, int dressValue) {
		super(name, category, color, dressValue);
		if(category.equals("jeans")) {
			uses = 2;
		}
		else {
			uses = 1;
		}
		return;
	}
	
	/**
	 * making a new clean method so that it can clean clothing, and properly set the uses
	 */
	public void clean() {
		super.clean();
		
		if(this.getCategory().equals("jeans")) {
			uses = 2;
		}
		else {
			uses = 1;
		}
		return;
	}
	
	/**
	 * overriding the wear method for use with jeans that can be used more than 1 times
	 */
	public void wear() {
		uses--;
		if(uses == 0)
			super.makeDirty();
		return;
	}	
}
