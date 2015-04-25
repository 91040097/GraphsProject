package graphs;
import java.io.File;
import java.io.FileNotFoundException;
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
	private void build(String file){
		try {
			@SuppressWarnings("resource")
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}