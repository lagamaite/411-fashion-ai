import java.util.ArrayList;

/**
 * catalog contains a list for each type of clothing
 * @author Sophie
 *
 */
public class Catalog {
	private ArrayList<Top> tops;
	private ArrayList<Bottom> bottoms;
	private ArrayList<Shoes> shoes;
	
	/**
	 * constructor makes the arraylists so the program runs
	 */
	public Catalog() {
		tops = new ArrayList<Top>();
		bottoms = new ArrayList<Bottom>();
		shoes = new ArrayList<Shoes>();
	}
	
	/**
	 * returns the list of tops
	 * @return
	 */
	public ArrayList<Top> getTops(){
		return tops;
	}
	
	/**
	 * returns the list of bottoms
	 * @return
	 */
	public ArrayList<Bottom> getBottoms(){
		return bottoms;
	}
	
	/**
	 * returns the list of shoes
	 * @return
	 */
	public ArrayList<Shoes> getShoes(){
		return shoes;
	}
}
