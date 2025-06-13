class Stack{
    int maxSize;
    int top;
    int[] stackArray;

    public Stack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.stackArray = new int[maxSize];
    }

    public boolean isFull() {
        return (top==maxSize-1);
    }

    public boolean isEmpty() {
        return (top==-1);
    }

    public void push(int a) {
        if(!isFull()) {
            stackArray[++top]=a;
            System.out.println(a+ "PUSHED");
        }
        else 
            System.out.println("STACK IS FULL!");
    }

    public int pop()
    {
        if(!isEmpty()) {
            System.out.print("Value POPPED is: ");
            return (stackArray[top--]);   
        }
        else{
            System.out.println("STACK EMPTY!");
            return -1;
        }
    }
}

class stack{
    public static void main(String[] args) {
        
    }
}