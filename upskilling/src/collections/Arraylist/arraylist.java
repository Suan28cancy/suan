package collections.Arraylist;
import java.util.*;

public class arraylist {
	public static void main(String args[]) {

	ArrayList<String> states = new ArrayList<String>();
	states.add("California");
	states.add("Maine");
	states.add("NH");
	states.add("Vermont");
	for(String obj:states)
		System.out.println(obj);
	}

}
