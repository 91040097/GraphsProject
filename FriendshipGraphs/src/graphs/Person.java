package graphs;

import java.util.ArrayList;

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

