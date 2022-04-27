import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        static class Binc {
            static int inde = -1;

            public static Node Build(int[] nodes) {
                inde++;
                if (nodes[inde] == -1) {
                    return null;
                }
                Node n = new Node(nodes[inde]);
                n.left = Build(nodes);
                n.right = Build(nodes);

                return n;

            }
        }
        public static  void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }

        public static void postorder(Node root){
              if(root==null){
            return;
        }
              postorder(root.left);
            postorder(root.right);

            System.out.println(root.data+" ");
    }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);

        }
        public static void level(Node root)
        {
            if(root==null){
                return ;

            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }
                    else{
                        System.out.print(currNode.data+" ");
                        if(currNode.left!=null){
                            q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static  int  countNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftcount=countNodes(root.left);
            int rightcount=countNodes(root.right);

            return  leftcount+rightcount+1;

        }
        static ArrayList <Integer> levelOrder(Node node)
        {
            ArrayList<Integer> a=new ArrayList<>();
            a.add(node.data);
            while(node!=null){
                if(node.left!=null)
                {
                    a.add(node.left.data);
                    levelOrder(node.left);
                }
                if(node.right!=null)
                {
                    a.add(node.right.data);
                    levelOrder(node.right);
                }
            }


            return a;
        }

        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt()
            int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Binc b = new Binc();
            Node root=b.Build(nodes);
//            preorder(root);
//            postorder(root);
//            inorder(root);
           // level(root);
            System.out.println(levelOrder(root));
           // System.out.println(countNodes(root));

        }
    }
}
