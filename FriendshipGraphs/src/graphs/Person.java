package graphs;

import java.util.ArrayList;

/**
 * This is the person class.
 * @author Ramaseshan Parthasarathy
 * @author Nishanth Athreya
 */
public class Person {
	private String name, school;
	private ArrayList<Person> friends;
	
	/**
	 * A Person takes in a name and a college
	 * @param n
	 * @param college
	 */
	public Person(String n, String college)
	{
		this.name = n;
		this.school = college;
		friends = new ArrayList<Person>();
	}
	
	/**
	 * Adds a friend 
	 * @param p
	 */
	public void addFriend(Person p)
	{
		friends.add(p);
	}
	
	public String toString()
	{
		return name + " " + school;
	}
	
	public String getFriends()
	{
		String x = "";
		
		for(int i = 0;i < friends.size();i++)
		{
			x += friends.get(i) + "-->";
		}
		
		return x;
	}
}
