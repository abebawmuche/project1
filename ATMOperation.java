
package bancktransaction;
import java.util.Scanner;
class Account{
    int accountNumber;
    int pinnumber;
    double balance;
    public Account(int acountNum,int pin,double balance){
        this.accountNum=acountNum;
        this.pin=pin;
        this.balance=balance;
    }
    public double checkBalance(){
        return balance;
    }
    public void deposit(double depositAmout){
        balance=balance+depositAmout;
    }
    public void withdraw(double withdrawAmount){
        if(balance<withdrawAmount){
            System.out.println("you have insuffient balance");
        }
        else{
            balance=balance-withdrawAmount;
        }
    }
}

public class ATMOperation {
    public Account ac;
    public ATMOperation(Account ac){
        this.ac=ac;
    }
    public void displayMenu(){
        Scanner scan=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n ATM menu");
            System.out.println("1: check balance");
            System.out.println("2: deposit");
            System.out.println("3: withdraw");
            System.out.println("4: exit");
            System.out.println("enter your  choice");
            choice=scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("your balance is="+ac.checkBalance());
                    break;
                case 2:
                    System.out.println("enter your deposit");
                    double depositAmount=scan.nextDouble();
                    ac.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("enter your withdraw amount");
                    double withdrawAmount=scan.nextDouble();
                    ac.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("thans for using ATM");
                    break;
                default:
                    System.out.println("you have entered invalid entery");
            }
            
        }while(choice!=4);
    }

   
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("enter your account number");
     int a=s.nextInt();
     
     System.out.println("enter your pin");
     int p=s.nextInt();
     System.out.println("enter your intial balance");
     double b=s.nextDouble();
     Account acount=new Account(a,p,b);
     ATMOperation  atm=new ATMOperation (acount);
     atm.displayMenu();
     
    }
    
}
