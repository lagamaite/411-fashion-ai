/**
 * Contains a collection of methods that convert things
 * There is no error checking, I could add that but we are the ones making the inputs, so lets just not handle that for now
 * @author Sophie
 *
 */
public class Converter {

	/**
	 * converts the string day to a numerical day, monday will be 1, only useful for like, converting things for shorthand
	 * @param s
	 * @return
	 */
	public static int dayToInt(String s) {
		if(s.equals("Monday)"))
			return 1;
		if(s.equals("Tuesday)"))
			return 2;
		if(s.equals("Wednesday)"))
			return 3;
		if(s.equals("Thursday)"))
			return 4;
		if(s.equals("Friday)"))
			return 5;
		if(s.equals("Saturday)"))
			return 6;
		return 7;	
	}
	
	/**
	 * Converts the numerical day back to a string for the toString
	 * @param i
	 * @return
	 */
	public static String intToDay(int i) {
		if(i == 1)
			return "Monday";
		if(i == 2)
			return "Tuesday";
		if(i == 3)
			return "Wednesday";
		if(i == 4)
			return "Thursday";
		if(i == 5)
			return "Friday";
		if(i == 6)
			return "Saturday";
		return "Sunday";
	}
	
	/**
	 * Okay, so I think the easiest was to do constraints with colors is to convert them to numbers
	 * This lets us use the color wheel, as it has 6 major parts. Complimentary will be off by 3, when mod 6, and tertiary with be off by 2
	 * Red is 1, Orange is 2, Yellow is 3, Green is 4, Blue is 5, Purple is 6, Pink is 7, Brown is 8, Black is 9, White is 10.
	 * Pink is 7 because 7 mod 6 is 1, which is red, and pink can be kinda used with red, or we can treat it seperately, honestly, probably should do that
	 * I should stop rambling in these comments. (I should also have just made this an enumeration)
	 * @param s
	 * @return
	 */
	public static int colorToInt(String s) {
		if(s.equals("Red"))
			return 1;
		if(s.equals("Orange"))
			return 2;
		if(s.equals("Yellow"))
			return 3;
		if(s.equals("Green"))
			return 4;
		if(s.equals("Blue"))
			return 5;
		if(s.equals("Purple"))
			return 6;
		if(s.equals("Pink"))
			return 7;
		if(s.equals("Brown"))
			return 8;
		if(s.equals("Black"))
			return 9;
		return 10;		
	}
	
	/**
	 * Explanation is earlier, just goes both ways for output
	 * @param s
	 * @return
	 */
	public static String intToColor(int i) {
		if(i == 1)
			return "Red";
		if(i == 2)
			return "Orange";
		if(i == 3)
			return "Yellow";
		if(i == 4)
			return "Green";
		if(i == 5)
			return "Blue";
		if(i == 6)
			return "Purple";
		if(i == 7)
			return "Pink";
		if(i == 8)
			return "Brown";
		if(i == 9)
			return "Black";
		return "White";
	}
}
