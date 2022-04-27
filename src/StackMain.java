public class StackMain {
    public static void main(String[] args) throws  Exception{
        CustomStack s=new CustomStack(2);
        DynamicStack sd=new DynamicStack();
        sd.push(2);
        sd.push(30);
        sd.push(356);
        sd.push(98);
        sd.push(21);
        sd.push(22);
        sd.push(245);

        System.out.println(sd.peek());
        System.out.println(sd.pop());
        System.out.println(sd.pop());

    }
}
