package bankaccount;
import java.util.*;

import java.util.logging.*;

public class Bank {
    public static void main(String[] args) {
    	 List<Accountdetails> list = new ArrayList<Accountdetails>();
    	 Logger log=Logger.getLogger("hi");
         log.info("Enter Your Choice");
         int option = 0;
         int cardnumber = 0;
         double balance;
         Accountdetails obj =null;
         String name;
         do{
             log.info("\n 1.New Account\n 2.Old Account\n 3.Exit");
             Scanner scan = new Scanner(System.in);
             option = scan.nextInt();
             int choice=0;
		switch(option) {
             case 1:
            	 try {
                 scan.nextLine();
                 log.info("ENTER ACCOUNT HOLDERNAME");
                 name = scan.nextLine();
                 log.info("ENTER YOUR ACCOUNTNUMBER");
                 cardnumber = scan.nextInt();
                 log.info("Enter Initial amount:");
                 balance=scan.nextDouble();
                 obj = new Accountdetails(name, cardnumber, balance);
                 list.add(obj);
                 do
                 {
                 log.info("1.deposite 2.withdraw 3.balance 4.Exit");
                 choice=scan.nextInt();
                 if(choice==1) {
                 obj.deposite();
                 }
                 else if(choice==2) {
                 obj.withdraw();
                 }
                 else if(choice==3) {
                 obj.balance();
                 }
                 }while(choice<4);
            	 }
            	 catch(Exception e)
            	 {
            		 log.log(Level.INFO,()->" "+e);
            	 }
                 break;
            	 

             case 2:
            	 try {
            	 int i;
            	 log.info("ENTER YOUR NUMBER");
                 int number = scan.nextInt();
                 int choose=0;
                 for (i = 0; i < list.size(); i++) {

                     if (list.get(i).cardnumber == number) {
                    	 String holdername=list.get(i).name;
                         log.log(Level.INFO,()->"Account Holder Name:"+holdername);
                         int card=list.get(i).cardnumber;
                         log.log(Level.INFO,()->"Account CardNumber:"+card);
                         double balanc=list.get(i).balance;
                         log.log(Level.INFO,()->"Account Balance:"+balanc);
                         
                         
                         do{
                         System.out.println("1.deposite 2.withdraw 3.balance 4.Exit");
                         choose = scan.nextInt();
                         
                         if(choose==1) {
                         obj.deposite();
                         }
                         else if(choose==2) {
                         obj.withdraw();
                         }
                         else if(choose==3) {
                         obj.balance();
                         }
                     }while(choose<4);
                     }
                 }
                 if(cardnumber!=number) {
                	 log.info("Account is not found so create an account");
                 }
            	 }
            	 catch(Exception e)
            	 {
            		 log.log(Level.INFO,()->" "+e);
            	 }
                 break;
             }
         }while(option<3);
    }
}