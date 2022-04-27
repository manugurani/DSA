public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int top=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];

    }
    public boolean push(int item){
        if(isfull()){
            System.out.println("stack is full");
        }
        top++;
        data[top]=item;
        return true;

    }
    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("stack is empty");
        }
        return data[top--];
    }
    public int peek(){
        if(isempty()){
            System.out.println("stack is empty");
        }
        return data[top];
    }

    public boolean isfull(){
        return top==data.length;
    }
    public boolean isempty(){
        return top==-1;
    }
}
