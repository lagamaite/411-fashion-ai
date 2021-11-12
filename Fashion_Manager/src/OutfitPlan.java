import java.util.ArrayList;

/**
 * outfit plan class, doesnt have much doing on, just a list of outfits, and the to string
 * @author Sophie
 *
 */
public class OutfitPlan {
	private ArrayList<Outfit> outfits;
	
	public OutfitPlan() {
		outfits = new ArrayList<Outfit>();
	}
	
	public String toString() {
		String output = new String();
		for(int i = 0; i < outfits.size(); i++) 
			output.concat(outfits.get(i).toString());
		return output;
	}
}
