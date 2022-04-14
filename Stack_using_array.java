class Stack{
    int size,top;
    int stack[];
    public Stack(int size){
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }
    public boolean isFull() {
        if (this.top == this.size -1){
            return true;
        }
        else{
            return false;
        }   
    }
    public boolean isEmpty() {
        if (this.top == -1){
            return true;
        }
        else{
            return false;
        }   
    }
    public void push(int data){
        if (this.isFull()){
            System.out.println("Stack is Full!!!!!");
        }
        else{
            this.stack[++top] = data;
            System.out.println("Pushed Item : "+data); 
        }
    }
    public void pop() {
        if(this.isEmpty()){
            System.out.println("Stack is Empty!!!!!");
        }
        else{
            System.out.println("Poped Item : "+stack[top--]); 
        }
    }
    public int peek(){
        return stack[top];
    }
}
public class Stack_using_array{
    public static void main(String agrs[]) {
        Stack s = new Stack(20);
        //Pushing Element
        System.out.println("==========================");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        //Poping Element
        System.out.println("==========================");
        s.pop();
        s.pop();
        //Peek element
        System.out.println("==========================");
        System.out.println("Peek element of stack is "+s.peek());
    }
}
