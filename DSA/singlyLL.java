import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

// Singly Linked List class
class SinglyLinkedList {
    private Node head;

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        System.out.println("Inserted at beginning: " + value);
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        System.out.println("Inserted at end: " + value);
    }

    public void insertAtPosition(int value, int pos) {
        Node newNode = new Node(value);

        if (pos <= 0) {
            System.out.println("Invalid position.");
        } else if (pos == 1) {
            insertAtBeginning(value);
        } else {
            Node temp = head;
            int i = 1;
            while (temp != null && i < pos - 1) {
                temp = temp.next;
                i++;
            }

            if (temp == null) {
                System.out.println("Position out of range.");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
                System.out.println("Inserted " + value + " at position " + pos);
            }
        }
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Deleted from beginning: " + head.data);
            head = head.next;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            System.out.println("Deleted from end: " + head.data);
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            System.out.println("Deleted from end: " + temp.next.data);
            temp.next = null;
        }
    }

    public void deleteFromPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (pos <= 0) {
            System.out.println("Invalid position.");
        } else if (pos == 1) {
            deleteFromBeginning();
        } else {
            Node temp = head;
            int i = 1;

            while (temp != null && i < pos - 1) {
                temp = temp.next;
                i++;
            }

            if (temp == null || temp.next == null) {
                System.out.println("Position out of range.");
            } else {
                System.out.println("Deleted from position " + pos + ": " + temp.next.data);
                temp.next = temp.next.next;
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = head;
            System.out.print("Linked List: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}

public class singlyLL {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            SinglyLinkedList s = new SinglyLinkedList();
            int choice;
            do {
                System.out.println(" ");
                System.out.println("           **********************************");
                System.out.println("                        MENU");
                System.out.println("           **********************************");
                System.out.println("            1.ADD ELEMENT AT START");
                System.out.println("            2.ADD ELEMENT AT END");
                System.out.println("            3.ADD ELEMENT AT A POSITION");
                System.out.println("            4.DELETE ELEMENT FROM START");
                System.out.println("            5.DELETE ELEMENT FROM END");
                System.out.println("            6.DELETE ELEMENT FROM A POSITION");
                System.out.println("            7.DISPLAY LINKED LIST");
                System.out.println("            8.EXIT");
                System.out.println("           **********************************");
                System.out.print("YOUR CHOICE?:");
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter element to add:");
                        int ele = sc.nextInt();
                        s.insertAtBeginning(ele);
                    }
                    case 2 -> {
                        System.out.print("Enter element to add:");
                        int ele = sc.nextInt();
                        s.insertAtEnd(ele);
                    }
                    case 3 -> {
                        System.out.print("Enter element to add:");
                        int ele = sc.nextInt();
                        System.out.print("Enter Position to add:");
                        int position = sc.nextInt();
                        s.insertAtPosition(ele,position);
                    }
                    case 4 -> s.deleteFromBeginning();
                    case 5 -> s.deleteFromEnd();
                    case 6 -> {
                        System.out.print("Enter Position to delete from:");
                        int position = sc.nextInt();
                        s.deleteFromPosition(position);
                    }
                    case 7 -> s.display();
                    default -> System.out.println("INVALID CHOICE!");
                }
            } while (choice != 8);
        }
    }
}
