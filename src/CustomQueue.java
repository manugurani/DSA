public class CustomQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE=10;

    int end=0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isfull(){
        return end==data.length;
    }

    public boolean isempty(){
        return end==0;
    }

    public boolean insert(int item){
        if(isfull()){
            System.out.println("stack is  full");
        }
        data[end++]=item;
        return  true;
    }
    public int delete(){
        if(isempty()){
            System.out.println("queue is empty");
        }
        int ele=data[0];
        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];

        }
        end--;



        return ele;
    }
    public int front(){
        if(isempty()){
            System.out.println("queue is full");
        }
        return data[0];
    }
    public void dispplay(){
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i]+"<--");

        }
        System.out.println("END");
    }
}
