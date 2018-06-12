// Ava DiPietro, 6/10/18

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstSearch {
	
	private Node startNode;
	private Node goalNode;
	
	public BreadthFirstSearch(Node start, Node end) {
		this.startNode = start;
		this.goalNode = end;
	}
	
	public boolean search() {
		
		if(this.startNode.equals(goalNode)){
            return true;
        }

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Node> explored = new ArrayList<>();
        queue.add(this.startNode);
        explored.add(startNode);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current.equals(this.goalNode)) {
                System.out.println(explored);
                return true;
            }
            else{
                if(current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
            }
            explored.add(current);
        }

        return false;
	}
}
