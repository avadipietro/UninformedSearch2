// Ava DiPietro, 6/10/18

import java.util.ArrayList;
import java.util.Arrays;

public class BFSRunner {
	public static void main(String[] args) {

        Node NYC = new Node("New York City");
        Node CHI = new Node("Chicago");
        Node DEN = new Node("Denver");
        Node MIA = new Node("Miami");
        Node DAL = new Node("Dallas");
        Node SD = new Node("San Diego");
        Node LA = new Node("Los Angeles");
        Node SF = new Node("San Francisco");

        NYC.setChildren(new ArrayList<Node>(Arrays.asList(CHI,DEN,MIA,DAL)));
        CHI.setChildren(new ArrayList<Node>(Arrays.asList(NYC,SF,DEN)));
        DEN.setChildren(new ArrayList<Node>(Arrays.asList(CHI,NYC,LA,SF)));
        MIA.setChildren(new ArrayList<Node>(Arrays.asList(NYC,DAL)));
        DAL.setChildren(new ArrayList<Node>(Arrays.asList(NYC,SD,MIA,LA)));
        SD.setChildren(new ArrayList<Node>(Arrays.asList(LA,DAL)));
        LA.setChildren(new ArrayList<Node>(Arrays.asList(SD,SF,DEN,DAL)));
        SF.setChildren(new ArrayList<Node>(Arrays.asList(LA,DEN,CHI)));

        BreadthFirstSearch bfs = new BreadthFirstSearch(MIA, SD);

        if(bfs.search())
            System.out.print("Path Found!");
        else
        {
            System.out.print("No Path Found");
        }
	}
}
