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
	
	public Person(String n, String college)
	{
		this.name = n;
		this.school = college;
		friends = new ArrayList<Person>();
	}
	
	public void addFriend(Person p)
	{
		friends.add(p);
	}
	
	public String toString()
	{
		if(school != null)
			return "(" + name + "," + school +")";
		else
			return "(" + name + ")";
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
