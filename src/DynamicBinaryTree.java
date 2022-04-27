import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class DynamicBinaryTree {
    static Scanner sc=null;
    static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data=data;
        }
    }
    public static class create {
        public Node CreateTree() {
            Node root = null;
            System.out.println("enter root :");
            int data = sc.nextInt();
            if (data == -1) {
                return null;

            }
            root = new Node(data);
            System.out.println("enter the left data for the " + data);
            root.left = CreateTree();
            System.out.println("enter the right data for the " + data);
            root.right = CreateTree();
            return root;
        }
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.right);
        inorder(root.right.left);
        System.out.print(root.data + " ");
        //inorder(root.right);

    }
//    public static void preorder(Node root){
//        if(root==null){
//            return;
//        }
//        System.out.print(root.data+" ");
//        preorder(root.left);
//        preorder(root.right);
//
//    }
//    public static void postorder(Node root){
//        if(root==null){
//            return;
//        }
//        postorder(root.left);
//        postorder(root.right);
//        System.out.print(root.data+" ");
//
//    }
    public static void level(Node root)
    {
        if(root==null){
            return ;

        }
        Queue<Node> y=new LinkedList<>();
        y.add(root);
        y.add(null);
        while(!y.isEmpty()){
            Node currNode=y.remove();
            if(currNode==null) {
                System.out.println();
                if (y.isEmpty()) {
                    break;
                } else {
                    y.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    y.add(currNode.left);
                }
                if(currNode.right!=null){
                    y.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        create c=new create();
        Node root=c.CreateTree();
        inorder(root);
        //preorder(root);
        //postorder(root);
       //level(root);

    }
}
