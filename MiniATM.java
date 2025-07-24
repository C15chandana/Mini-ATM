import java.util.*;

public class MiniATM {
    public static void main(String[] args) {
        int balance = 1000;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                //System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
                    System.out.print("Enter amounts: ");
                    balance += sc.nextInt();
                    System.out.println("-------------");
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    int amt = sc.nextInt();
                    if (amt <= balance) balance -= amt;
                    else System.out.println("Insufficient Balance!");
                    System.out.println("-------------");
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    System.out.println("-------------");
                    break;
                case 4:
                    System.out.println("Thanks for using ATM!");
                    return;
            }
        }
    }
}
