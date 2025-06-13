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
        return rear == size - 1;
    }

    public boolean isEmpty()
    {
        return (front==-1 && rear==-1);
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
                System.out.print(queueArray[i] + " -> ");
            }
        }
        else
            System.out.println("QUEUE EMPTY!");
    }
}

public class queueDemo{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of Queue:");
            int a = sc.nextInt();
            Queue q = new Queue(a);
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
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter element to add:");
                        int ele = sc.nextInt();
                        q.enqueue(ele);
                    }
                    case 2 -> q.dequeue();
                    case 3 -> q.display();
                    case 4 -> System.out.println("EXITING!");
                    default -> System.out.println("INVALID CHOICE!");
                }
            } while (choice != 4);
        }
    }
}
