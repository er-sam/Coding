package Programs;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int balance = 1000000,widthrwal,deposite;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("WELCOME TO BANK OF INDIA ATM\n");
            System.out.println("1.Widthrawal\n 2.Deposite\n 3.Balance\n 4.Exit()");
            System.out.println("Select option no: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                System.out.println("Enter Amount: ");
                widthrwal = sc.nextInt();
                if (balance>=widthrwal){
                    balance=balance-widthrwal;
                    System.out.println("Please collect your money:");
                }
                else{
                    System.out.println("!!! Insufficient Balance:");
                }
                    break;


                case 2:
                System.out.println("Enter Money: ");
                deposite = sc.nextInt();
                balance = balance + deposite;
                System.out.println("Successfully deposited........");
                break;

                case 3:
                System.out.println("Balance: "+balance);
                System.out.println(".............................");
                
                break;

                case 4:
                System.exit(0);

                default:
                System.out.println("Invalid Input...............");
                    break;
            
            }
            // sc.close();
        }  
        // sc.close();
    }
    // sc.close();
}
