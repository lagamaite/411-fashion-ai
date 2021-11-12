
/**
 * an outfit contains a top, bottom, and shoes. This is just a package to store them essentially
 * @author Sophie
 *
 */
public class Outfit {
	private Top top;
	private Bottom bottom;
	private Shoes shoes;
	
	public Outfit(Top top, Bottom bottom, Shoes shoes) {
		this.top = top;
		this.bottom = bottom;
		this.shoes = shoes;
	}
	
	public Top getTop() {
		return top;
	}
	
	public Bottom getBottom() {
		return bottom;
	}
	
	public Shoes getShoes() {
		return shoes;
	}
	
	public String toString() {
		if(top.getDressValue() != 0) {
			return new String (top.getName() + " (" + top.colorString()
					+ ")\n"  + shoes.getName() + " (" + shoes.colorString() + ")\n\n\n");
		}
		else {
			return new String (top.getName() + " (" + top.colorString()
			+ ")\n"  + bottom.getName() + " (" + bottom.colorString() 
			+ ")\n" + shoes.getName() + " (" + shoes.colorString() + ")\n\n\n");
		}
	}
}
