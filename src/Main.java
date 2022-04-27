public class Main {
    public static void main(String[] args) {
        Linkedl L=new Linkedl();
        L.insert(20);
        L.insert(30);
        L.insert(40);
        L.insert(50);
        L.Display();
        L.InsertLast(1);
        L.InsertLast(2);
        L.InsertLast(3);
        L.InsertLast(4);
        L.InsertLast(5);
        L.InsertLast(6);
        L.insertAtIndex(60,2);
        L.insertAtIndex(8000,10);
        L.Display();
        System.out.println();
        int k=L.deleteFirst();
        System.out.println(k);
        L.Display();
        int ki=L.DeleteLast();
        System.out.println(ki);
        L.Display();
        System.out.println(L.DeleAtspecified(L.size-1));
        L.Display();
       // System.out.println(L.find(4))
        L.Display();



    }
}
