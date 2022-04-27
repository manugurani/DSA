public class Cqueuemain {
    public static void main(String[] args) {
        CustomQueue queue=new CustomQueue(5);
        queue.insert(20);
        queue.insert(40);
        queue.insert(23);
        queue.insert(78);
        System.out.println(queue.front());
        queue.dispplay();
        queue.delete();
        System.out.println(queue.front());
        queue.dispplay();




    }
}
