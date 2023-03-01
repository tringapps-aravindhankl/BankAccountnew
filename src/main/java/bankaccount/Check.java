package bankaccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Check {
	List<Accountdetails> list = new ArrayList<Accountdetails>();
	Logger log=Logger.getLogger("hi");
    int option = 0;
    int cardnumber = 0;
    double balance;
    Accountdetails obj =null;
    String name;
    public void check() {
    	
    	while(option<3){
    	log.info("Enter Your Choice");
        log.info("\n 1.New Account\n 2.Old Account\n 3.Exit");
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        
	  switch(option) {
        case 1:
       	 
            scan.nextLine();
            log.info("ENTER ACCOUNT HOLDERNAME");
            name = scan.nextLine();
            log.info("ENTER YOUR ACCOUNTNUMBER");
            cardnumber = scan.nextInt();
            log.info("Enter Initial amount:");
            balance=scan.nextDouble();
            
            obj = new Accountdetails(name, cardnumber, balance);
            
            log.info("Bank Account created:");
            
            
            list.add(obj);
            
         break;
       	 

        case 2:
       	 
       	 int i;
       	    log.info("ENTER YOUR NUMBER");
            int number = scan.nextInt();
           
            for (i = 0; i < list.size(); i++) {

                if (list.get(i).cardnumber == number) {
               	 String holdername=list.get(i).name;
                    log.log(Level.INFO,()->"Account Holder Name:"+holdername);
                    int card=list.get(i).cardnumber;
                    log.log(Level.INFO,()->"Account CardNumber:"+card);
                    double balanc=list.get(i).balance;
                    log.log(Level.INFO,() -> "Account Balance:"+balanc);
                    
                    
                    obj.operation();
                }
                
            }
            if(cardnumber!=number) {
           	 log.info("Account is not found so create an account");
            }
         break;
            
        default:
           	 log.info("Thank You");
           }
    }
}
}
