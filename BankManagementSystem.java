import java.util.Scanner;
public class BankManagementSystem{
    public static void main (String args []){

        Scanner object = new Scanner(System.in);

        int choice; int i;String accountN = "12345"; String exAccN = "34521"; int accountNumber=0;
    String key; String branch = ""; String accountname = ""; String regNum ="";
    double accountBalance = 0;
    boolean endProgram = false; 

    BankAccount[] acc = new BankAccount[100];
    for(i=0; i< acc.length; i++){
        acc[i]= new BankAccount();
    }
    


        System.out.println();
        System.out.println("             WELCOM TO BANK MANAGEMENT SYSTEM         ");
        System.out.println();

       System.out.println("      Selecting Operation Below");
       System.out.println();
       System.out.println();

       do{
        System.out.println(" 1. List All Accounts And Their Balance\n  2. Create A New Account\n 3. Deposite Money Into Account\n  4. Withdraw Money From An Account\n 5. Check Account Balance\n 6. Exit");

        System.out.println();
        System.out.println("Enter your choice here:");
        choice = object.nextInt();

        System.out.println();

        switch(choice){
             case 1: 
                //listing all Account details and their balances
               System.out.println("Account number   Account name    Type    branch       balance ");
               System.out.println("----------------------------------------------------------------");
               System.out.println(accountN +"    "  + "        " + accountname + "        Savings   "+"     "+branch+ "   "+ "   " +accountBalance);
               System.out.println();
               System.out.print("Press Any Key to Continue: <enter>");
               key = object.next();

               break;

               case 2:

               System.out.println();
               System.out.println("                Select The BankAccount Type");
               System.out.println(" 1. StudentAccount\n 2.BusinessAccount");
               System.out.println();

               System.out.println("Enter your choice here:");
               choice = object.nextInt();

               System.out.println();

               switch(choice){

                   case 1:
                   acc[0]= new StudentAccount (accountNumber,accountname,accountBalance,branch,regNum);
                   
                   System.out.println("      Creating new StudentAccount");
                   System.out.println();
                   System.out.println("Enter AcountNumber here"+ accountN);

                   System.out.println("Enter AccountName here:");
                   accountname = object.next();

                   System.out.println("Enter Student Regnumber here:");
                   regNum = object.next();

                   System.out.println("Enter Branch here:");
                   branch = object.next();

                   System.out.println("Enter balance here: in k");
                  accountBalance = object.nextDouble();

                   System.out.println();
                   System.out.println("Account successfully created");
                   break;

                     case 2:
                     acc[1]=new BusinessAccount(accountNumber,accountname,accountBalance,  branch);

                     System.out.println("      Creating new BusinessAccount");
                     System.out.println();
                     System.out.println("Enter AcountNumber" + exAccN);

                     System.out.println("Enter AccountName here:");
                     accountname = object.next();

                    System.out.println("Enter Branch here:");
                     branch = object.next();

                     System.out.println("Enter balance here: in k");
                     accountBalance = object.nextDouble();

                     System.out.println();
                     System.out.println("Account successfully created");

                     System.out.print("Press Any Key to Continue: <enter>");
                     key = object.next();

                     break;

                }
                break;
                 case 3: 
             System.out.println();
                //deposit money
                System.out.print("     Enter ammout to deposit: ");
                  accountBalance = object.nextDouble();
                break;

                 case 4:  
                  System.out.println();
                //withdraw mone from acccount
                System.out.print("      Enter amount to withdraw: ");
 
                double amount = object.nextDouble();
            if(amount >=200){
                accountBalance -=amount;
                  }
         else{
             System.out.println();
      }   
                break;

                
            case 5: 
             System.out.println();
                //check balnce
                System.out.println("Your balance is ");
               acc[i].getAccountBalance();
                break;
                 case 6:

                 System.exit(0);
                 break;



            }

       }
       while(choice !=6);

       
    }
}