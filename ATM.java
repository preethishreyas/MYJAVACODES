import java.util.*;

public class ATM {
    public static void main(String[] args) {
        int balance = 1000000, withdraw, deposit;
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automated teller machine");
            System.out.println("choose for withdraw");
            System.out.println("choose for deposit");
            System.out.println("choose for check balance");
            System.out.println("choose for Exit");
            System.out.println("choose the operations");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdraw");
                    withdraw = sc.nextInt();
                    if (balance > withdraw) {
                        balance = balance - withdraw;
                        System.out.println("please collect your cash");
                    } else {
                        System.out.println("Insufficient balance");
                        System.out.println(" ");
                        break;

                    }
                case 2:
                    System.out.println("Enter money to deposit");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("your amount has been deposited successful");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("balance:" + balance);
                    System.out.println(" ");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
