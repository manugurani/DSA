import java.util.LinkedList;
import java.util.Scanner;

public class PracticeGraph {
    private LinkedList<Integer> adj[];
    public PracticeGraph(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();

        }
    }
    public void addedge(int source ,int destination){
        adj[source].add(destination);
        adj[destination].add(source);

    }
    public void printgraph() {
        for (int i = 0; i < adj.length; i++) {
            System.out.print(adj[i]);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of vertex and edges");
        int v=sc.nextInt();
        int e=sc.nextInt();
        PracticeGraph g=new PracticeGraph(v);
        System.out.println("enter the  "+e+" edges");
        for (int i = 0; i <e ; i++) {
            int source=sc.nextInt();
            int destination=sc.nextInt();
            g.addedge(source,destination);

        }
        g.printgraph();

    }
}
