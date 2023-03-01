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
        System.out.println("balance:" + balance);
    }
}

