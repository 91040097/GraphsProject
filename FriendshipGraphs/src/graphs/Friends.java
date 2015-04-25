package graphs;
import java.util.*;

public class Friends {

	/**
	 * HashMap of the people	
	 */
	private HashMap<String, Person> people;
	
	/**
	 * Build the graph from input file
	 * Create the people HashMap
	 * @param file the input file to be read in
	 */
	public Friends(String file){
		people = new HashMap<String, Person>();
		build(file);
	}
	
	/**
	 * Builds a Graph
	 * @param file input file
	 */
	private static void build(String file){
		
	}
}
