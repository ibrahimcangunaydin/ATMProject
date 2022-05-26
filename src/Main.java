import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        int right = 3, process, withdrawal, balance = 20000, deposit;
        boolean isExit = false;

        Scanner inp = new Scanner(System.in);


        while (right > 0) {
            System.out.print("Username: ");
            userName = inp.nextLine();
            System.out.print("Password: ");
            password = inp.nextLine();

            if (userName.equals("Can") && password.equals("123456")) {
                System.out.println("Hello, Welcome to our bank");

                while (!isExit) {
                    System.out.print("1-Withdrawal\n2-Deposit\n3-Balance Inquiry" + "\n4-Cancel\n" +
                            "select transaction you want to do: ");
                    process = inp.nextInt();
                    switch (process) {
                        case 1:
                            System.out.print("withdrawal amount: ");
                            withdrawal = inp.nextInt();
                            if (withdrawal <= balance) {
                                balance -= withdrawal;
                            } else {
                                System.out.println("Insufficient balance!");
                            }
                            break;
                        case 2:
                            System.out.print("Deposit amount: ");
                            deposit = inp.nextInt();
                            balance += deposit;
                            break;
                        case 3:
                            System.out.println("Balance: " + balance);
                            break;
                        case 4:
                            isExit = true;
                            System.out.println("Have a nice day...");
                            break;
                    }
                }
                break;
            } else {
                right--;
                if (right > 0) {
                    System.out.println("You Entered Incorrectly!, your remaining login rights: " + right);
                } else {
                    System.out.print("Your account has been locked due to incorrect logins!");
                    break;
                }
            }
        }
    }
}
