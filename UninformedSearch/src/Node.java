// Ava DiPietro, 6/10/18

import java.util.ArrayList;

public class Node {
	String name;
	private ArrayList<Node> children;
	
	public Node(String name) {
		this.name = name;
	}

	public ArrayList<Node> getChildren() { //should return a list of all connected nodes
		return this.children;
	}
	public void setChildren(ArrayList<Node> nChildren) { //used to set the children of a Node
		this.children = nChildren;
	}	
	public String toString() { //useful when we print the path found
		return this.name;
	}
}
