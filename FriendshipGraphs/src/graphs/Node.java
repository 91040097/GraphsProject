package graphs;

public class Node<T> { //generic node class

	T data; Node<T> next;

	public Node(T data, Node<T> next){
		this.data = data;
		this.next = next;
	}

	public String toString(){

		return data + ""; //concatenate w/ empty String: data => String
	}
}

