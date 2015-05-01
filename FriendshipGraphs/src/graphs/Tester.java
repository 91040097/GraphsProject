package graphs;

public class Tester {

	public static void main(String[] args) {
		Graph x = new Graph();
		
		x.build("friends.txt");
		
		x.printVertexStuff();
	}

}
