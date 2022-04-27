public class Linkedl {
    Node head;
    Node tail;
    int size=0;
    public void insert(int data)
    {
        Node n1=new Node(data);
        n1.link=head;
        head=n1;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    public void Display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print("["+temp.data+"|LINK]"+"-->");
            temp=temp.link;
        }
        System.out.print("NULL");
        System.out.println(size);
    }
//    public void inertRec(int val,int index){
//        head=inertRec(val,index,head);
//
//    }
//    private  Node inertRec(int val,int index,Node node){
//        if(index==0){
//            Node n=new Node(val,node);
//            size++;
//            return  n;
//        }
//        node.link=inertRec(val,index--,node.link);
//        return node;
//    }
    public void  InsertLast(int data)
    {
        if (tail==null)
        {
            insert(data);
            return;
        }
       Node node=new Node(data);
       tail.link=node;
       tail=node;
       size++;

    }
    public  void insertAtIndex(int data,int index){
        if(index==0)
        {
            insert(data);
        }
        if(index==size)
        {
            InsertLast(data);
        }
        if(index>size)
        {
            InsertLast(data);
        }
        Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.link;

        }
        Node node=new Node(data, temp.link);
        temp.link=node;
        size++;
    }
    public int deleteFirst(){
        int val= head.data;
        head=head.link;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public Node get(int index)
    {
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.link;


        }
        return node;
    }
    public int DeleteLast()
    {
        int val=tail.data;
       Node Second=get(size-2);

       Second.link=null;
        tail=Second;
       size--;
        return val ;
    }
    public  int DeleAtspecified(int index){
        Node dele=get(index-1);
        int val=dele.link.data;
        dele.link=dele.link.link;
        size--;
        return val;
    }
    public Node find(int valu){
        Node node=head;
        while(node!=null){
            if(node.data==valu){
                return node;

            }
            node=node.link;
        }
        return null ;
    }

    private class Node {
        int data;
        private Node link;
        private Node(int data) {
            this.data = data;
        }
        private  Node(int data,Node link)
        {
            this.data=data;
            this.link=link;
        }
    }
}









