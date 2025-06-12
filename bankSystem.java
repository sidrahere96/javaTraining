import java.util.Scanner;

public class bankSystem {
    private String nam;
    private int balance;
    @SuppressWarnings("unused")
    private String addr;
    @SuppressWarnings("unused")
    private int age;
    @SuppressWarnings("unused")
    private int dob;
    public int passw;
    public int myaccN;

    bankSystem() {}

    bankSystem(String name, int ag, int db, String add, int pass, int accN, int amm) {
        this.nam = name;
        this.age = ag;
        this.dob = db;
        this.addr = add;
        this.passw = pass;
        this.myaccN = accN;
        this.balance = amm;
    }

    int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
        return balance;
    }

    int deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful.");
        return balance;
    }

    int checkBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }

    int checkMember(int pass, int accounN, bankSystem arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i].passw == pass && arr[i].myaccN == accounN) {
                System.out.println("WELCOME " + arr[i].nam);
                return i;
            }
        }
        System.out.println("Account not found or incorrect password.");
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        bankSystem arr[] = new bankSystem[10];
        int count = 0;
        int accGen = 20031200;
        int a;

        do {
            System.out.println("********************");
            System.out.println("WELCOME TO PVG BANK");
            System.out.println("********************");
            System.out.println("1.CREATE ACCOUNT");
            System.out.println("2.WITHDRAW CASH");
            System.out.println("3.DEPOSIT CASH");
            System.out.println("4.CHECK BALANCE");
            System.out.println("5.EXIT");
            System.out.println("YOUR CHOICE?:");
            a = s.nextInt();

            switch (a) {
                case 1:
                    System.out.println("ENTER YOUR NAME:");
                    String name = s.next();
                    System.out.println("ENTER YOUR AGE:");
                    int age = s.nextInt();
                    System.out.println("ENTER YOUR DOB:");
                    int dob = s.nextInt();
                    s.nextLine();
                    System.out.println("ENTER YOUR ADDRESS:");
                    String add = s.nextLine();
                    System.out.println("ENTER YOUR Password:");
                    int pass = s.nextInt();
                    int amount = 0;
                    arr[count] = new bankSystem(name, age, dob, add, pass, accGen, amount);
                    System.out.println("ACCOUNT CREATED SUCCESSFULLY!!!");
                    System.out.println("ACCOUNT NUMBER IS: " + accGen);
                    accGen++;
                    count++;
                    break;

                case 2:
                    System.out.println("Enter your Account Number:");
                    int aN = s.nextInt();
                    System.out.println("Enter your Password:");
                    int pas = s.nextInt();
                    int indexW = new bankSystem().checkMember(pas, aN, arr, count);
                    if (indexW != -1) {
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawAmount = s.nextInt();
                        arr[indexW].withdraw(withdrawAmount);
                    }
                    break;

                case 3:
                    System.out.println("Enter your Account Number:");
                    aN = s.nextInt();
                    System.out.println("Enter your Password:");
                    pas = s.nextInt();
                    int indexD = new bankSystem().checkMember(pas, aN, arr, count);
                    if (indexD != -1) {
                        System.out.print("Enter amount to deposit: ");
                        int depositAmount = s.nextInt();
                        arr[indexD].deposit(depositAmount);
                    }
                    break;

                case 4:
                    System.out.println("Enter your Account Number:");
                    aN = s.nextInt();
                    System.out.println("Enter your Password:");
                    pas = s.nextInt();
                    int indexC = new bankSystem().checkMember(pas, aN, arr, count);
                    if (indexC != -1) {
                        arr[indexC].checkBalance();
                    }
                    break;

                case 5:
                    System.out.println("EXITING!");
                    break;

                default:
                    System.out.println("INVALID CHOICE!");
            }
        } while (a != 5);
    }
}
