package bankaccount;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.LinkedList;

class Accountdetails {
	   String name;
	    int cardnumber;
	    double balance;
	    Scanner scan = new Scanner(System.in);
	    Logger log=Logger.getLogger("hi");
	    Accountdetails(String name, int cardnumber, double balance) {
	        this.name = name;
	        this.cardnumber = cardnumber;
	        this.balance = balance;
	    }
	    
	    
	public void deposite() {
        try {
            log.info("enter your deposite amount");
            double deposite = scan.nextDouble();
            balance = balance + deposite;
        } catch (InputMismatchException e) {
            log.log(Level.INFO,()->" "+e);
        }
    }

    public void withdraw() {
        try {
            log.info("enter withdraw amount");
            double withdraw = scan.nextDouble();
            if (withdraw < balance) {
                balance = balance - withdraw;
            } else {
                log.info("your balance is low");
            }
        } catch (InputMismatchException e) {
        	log.log(Level.INFO,()->" "+e);
        }
    }

    public void balance() {
        log.log(Level.INFO,()->"balance:" + balance);
    }
    
    public void operation()
    {
    	 int choose=0;
    	 do{
             System.out.println("1.deposite 2.withdraw 3.balance 4.Exit");
             choose = scan.nextInt();
             
             switch(choose) {
             
             case 1:
             deposite();
             break;
             
             case 2:
             withdraw();
             break;
             
             case 3:
             balance();
             break;
             
             default:
             log.info("----");
             }
         }while(choose<4);
    }
}



