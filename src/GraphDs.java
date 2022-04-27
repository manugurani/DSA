import java.util.LinkedList;
import java.util.Scanner;

public class GraphDs {
    private LinkedList<Integer> adj[];
    public GraphDs(int v){
        adj=new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i]=new LinkedList<Integer>();

        }
    }
    public  void Addedge(int source,int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the edge and vertex for the graph implementation");
        int v=sc.nextInt();
        int e=sc.nextInt();
        GraphDs graph=new GraphDs(v);
        System.out.println("enter the "+e+"edge");
        for (int i = 0; i <e ; i++) {
            int source=sc.nextInt();
            int destination=sc.nextInt();
            graph.Addedge(source, destination);

        }

    }
}
