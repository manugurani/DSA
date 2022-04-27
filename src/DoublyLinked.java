public class DoublyLinked {
    Node head;
    Node tail;
    int size=0;
    public void  insertzFir(int data){
        Node node=new Node(data);
        node.Link=head;
        node.Prev=null;
        if(head!=null){                                                                                                               //h
            head.Prev= node;

        }
        if(tail==null)
        {
            tail=head;
        }
        size++;
        head=node;
        size++;
    }
    public void InsertAtEnd(int data){

        if (tail==null)
        {
            insertzFir(data);
            return;
        }
        Node node=new Node(data);
        tail.Link=node;
        node.Prev=tail;
        tail=node;
        size++;
//        Node node=new Node(data);
//        Node last=head;
//        node.Link=null;
//        if(head==null)
//        {
//            node.Prev=null;
//            head=node;
//            return;
//        }
//        while(last.Link!=null)
//        {
//            last=last.Link;
//        }
//        last.Link=node;
//        node.Prev=last;
//        size++;
 }
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp;
            System.out.print("["+temp.data+"|"+"LINK"+"]"+" --> ");
            temp=temp.Link;
        }
        System.out.println("NULL");
        while (last!=null)
        {
            System.out.print("["+last.data+"|"+"LINK"+"]"+" <-- ");
            last=last.Prev;
        }
        System.out.println("START");


    }
    public  Node get(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return  temp;
            }
            temp=temp.Link;
        }
        return  null;
    }
    public  void insertAtvalu(int afeter,int value){
        Node  preve=get(afeter);
        Node node=new Node(value);


        node.Link=preve.Link;
        preve.Link=node;
        node.Prev=preve;
        if(node.Link!=null) {
            node.Link.Prev = node;
        }
    }

    class Node{
        int data;
        Node Link;
        Node Prev;
        public Node(int data){
            this.data=data;

        }
        public  Node(int data,Node Link,Node Prev){
            this.data=data;
            this.Link=Link;
            this.Prev=Prev;
        }
    }
}
