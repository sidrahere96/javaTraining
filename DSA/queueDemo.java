import java.util.Scanner;

class Queue {
    int front;
    int rear;
    int[] queueArray;
    int size;

    public Queue(int maxSize)
    {
        front=-1;
        rear=-1;
        size=maxSize;
        queueArray=new int [maxSize];
    }

    public boolean isFull()
    {
        if(rear==size-1)
            return true;
        else
            return false;
    }

    public boolean isEmpty()
    {
        if(front==-1 && rear==-1)
            return true;
        else 
            return false;
    }

    public void enqueue(int a){
        if(!isFull()){
            if(front==-1){
                queueArray[++front]=a;
                rear++;
                System.out.println(a+" is Added to QUEUE!");
            }
            else{
                queueArray[++rear]=a;
                System.out.println(a+" is Added to QUEUE!");
            }
        }

        else
            System.out.println("QUEUE is FULL!");
    }

    public void dequeue(){
        if(!isEmpty()){
            if(front==rear){
                front=-1;
                rear=-1;
                System.out.println("ELEMENT DELETED!");
            }
            else{
                front++;
                System.out.println("ELEMENT DELETED!");
            }
        }
        else
            System.out.println("QUEUE EMPTY!");
    }

    public void display(){
        if(!isEmpty())
        {
            System.out.print("QUEUE ELEMENTS: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + "  ");
            }
        }
        else
            System.out.println("QUEUE EMPTY!");
    }
}

public class queueDemo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of Queue:");
        int a=sc.nextInt();
        Queue q =new Queue(a);
        int choice;
        do {
            System.out.println(" ");
            System.out.println("           *********************");
            System.out.println("                   MENU");
            System.out.println("           *********************");
            System.out.println("            1.ADD ELEMENT");
            System.out.println("            2.DELETE ELEMENT");
            System.out.println("            3.DISPLAY QUEUE");
            System.out.println("            4.EXIT");
            System.out.println("           *********************");
            System.out.print("YOUR CHOICE?:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter element to add:");
                    int ele=sc.nextInt();
                    q.enqueue(ele);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("EXITING!");
                    break;

                default:
                    System.out.println("INVALID CHOICE!");
            }
        } while (choice!=4);
    }
}
