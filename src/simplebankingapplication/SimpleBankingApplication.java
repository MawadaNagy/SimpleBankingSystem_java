
package simplebankingapplication;

import java.util.Scanner;


public class SimpleBankingApplication {
    static double balance = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while(!exit){
            System.out.println("\n\tWelcome to the Banking Application:");
            System.out.println("1. Deposit");
            System.out.println("2. Withraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose a number from 1 to 4: ");
            
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Please choose a number from 1 to 4.");
            }
        }
        System.out.println("Thank you for using the Banking Application.");
    }
    
    private static void deposit(){
        System.out.println("Enter the amount you want to deposit: ");
        double amount = sc.nextDouble();
        if(amount<=0){
            System.out.println("Invalid amount!, Please enter a valid amount greater than zero.");
        }else{
            balance+=amount;
            System.out.println("Successfull Deposit! \nCurrent Balance = "+ String.format("%.2f",balance));
        }
        
    }
    
    private static void withdraw(){
        System.out.println("Enter the amount you want to withdraw: ");
        double amount = sc.nextDouble();
        if(amount<=0){
            System.out.println("Invalid amount!, Please eneter a valid amount greater than zero.");
        }else if(amount>balance){
            System.out.println("Insufficient funds! Withdrawal failed. \nCurrent Balance = "+String.format("%.2f", balance));
        }else{
            balance-=amount;
            System.out.println("Successful withdrawal of the amount!, \nCurrent Balance = "+String.format("%.2f", balance));
        }
        
    }
    
    private static void checkBalance(){
        System.out.println("Current Balance = "+String.format("%.2f", balance));
        
    }
    
}
