public class CirculaLinked {
    private  Node head=null;
    private  Node tail=null;

    public  void insertatfirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.Link=node;
        node.Link=head;
        head=node;
    }
    public void display(){
        Node node=head;
        do{
            System.out.print(node.data+"---->");
            node=node.Link;
        }while (node!=head) ;
        System.out.println("starta");
    }
    public void ddaa(){
        System.out.println(tail.data+"   is first");
        System.out.println(tail.Link.data+"  is first");
        System.out.println(tail.Link.Link.data+"  is first");
        System.out.println(tail.Link.Link.Link.data+"  is first");
    }
    public  void deletelast(int data){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.data==data){
            head=head.Link;
            tail.Link=head;
            return;
        }
        do{
            Node no=node.Link;
            if(no.data==data){
                node.Link= no.Link;
                break;
            }
            node=node.Link;

        }while (node!=null);

    }
    private  class Node{
        int data;
        Node Link;
        Node(int data){
            this.data=data;
        }
    }
}
