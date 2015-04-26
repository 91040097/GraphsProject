package graphs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * This is our Graph class.
 * @author Ramaseshan Parthasarathy
 * @author Nishanth Athreya
 */
public class Graph {

	/**
	 * HashMap of the people	
	 */
	private HashMap<String, Person> people;

	/**
	 * Build the graph from input file
	 * Create the people HashMap
	 * @param file the input file to be read in
	 */
	public Graph(){
		people = new HashMap<String, Person>();
		//build(file);
		//printPerson(people);
		//printFriends(people);
	}

	/**
	 * Builds a Graph
	 * @param file input file
	 */
	@SuppressWarnings("resource")
	public void build(String file){
		try {
			Scanner x = new Scanner(new File(file));
			String num = x.nextLine();

			int n = Integer.parseInt(num), i = 0;

			while(x.hasNextLine() && i < n)
			{
				String line = x.nextLine();

				int start = line.indexOf("|"), end = start + 2;

				String name = line.substring(0, start);
				String college = "";

				if(end < line.length())
				{
					college = line.substring(end + 1, line.length());
					people.put(name, new Person(name, college));
				}
				else
					people.put(name, new Person(name, null));

				i++;
			}

			while(x.hasNextLine())
			{
				String line = x.nextLine();

				int start = line.indexOf("|");

				String name = line.substring(0, start);

				if(start + 1 < line.length())
				{
					String friend = line.substring(start + 1, line.length());
					people.get(name).addFriend(people.get(friend));
					people.get(friend).addFriend(people.get(name));
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Find the people who go to the input school
	 * @param school
	 * @return Graph
	 */
	public Graph findCliques(String school){
		/*THIS LINE HAS BEEN ADDED TO MAKE THE METHOD COMPILE*/
		/*Ram*/
		Graph cliques = new Graph();
		return cliques;
	}
	
	/**
	 * 	
	 * @param school the input school
	 * @return subgraph containing the people who go to school	
	 */
	private Graph getSubgraph(String school){
		
		return null;
	}
	
	/**
	 * Finds the shortest path from a to b
	 * @param a Starting person (intro)
	 * @param b Ending person (other)
	 */
	public static void shortestPath(Person a, Person b){
		/*Nishanth*/
	}

	private static void dfs(){		
		/*To be filled in*/
	}
	
	/**
	 * Prints the graph
	 */
	public void print(){
		printPerson(people); //print person
		printFriends(people); //print that person's friend(s)
	}
	
	private static void printPerson(HashMap<String, Person> p){
		Iterator itr = p.keySet().iterator();
		while(itr.hasNext()){
			System.out.print(p.get(itr.next()) + "\n");
		}
	}
	
	private static void printFriends(HashMap<String, Person> p) {
		Iterator itr = p.keySet().iterator();
		while(itr.hasNext()){
			System.out.print(p.get(itr.next()).getFriends() + "\n");
		}
	}
		
		
}