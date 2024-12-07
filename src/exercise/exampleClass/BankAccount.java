package exercise.exampleClass;
import java.util.Scanner;
public class BankAccount {
    private double balance;

    public BankAccount(String accountNumber,String accountName,double balance){
        this.balance = 0.00;
    }

    public void deposit(){
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please input the amount of deposit: ");
            double deposit = scan.nextDouble();
            scan.close();
            if(deposit >= 0){
                this.balance = deposit+this.balance;
                break;
            }
            else{
                System.out.println("Invalid deposit amount");
            }
        }
    }

    public void withdraw(){
        while(true){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Please input the amount of withdraw: ");
            double withdraw = scan2.nextDouble();
            scan2.close();
            if (withdraw <= this.balance){
                this.balance -= withdraw; 
                break;
            }
            else if (withdraw <= 0 || withdraw > this.balance){
                System.out.println("Invalid withdraw amount");
            }
        }
    }

    public int getBalance(){
        return (int)balance;
    }


}