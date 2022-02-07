class BusinessAccount extends BankAccount{
   

    BusinessAccount(){
        super();
    }
    BusinessAccount(int accountNumber, String accountName,double accountBalance,String branch){
        super(accountNumber,accountName,accountBalance,branch);

    }
   
     //withdrawing
   @Override
    public boolean withdraw(double amount) {
      
      if(withdraw(amount)){
         return true;
      }
      else{
         return false;
      }
    }
 //get blance
   @Override
   public double getAccountBalance(){
       return getAccountBalance() + 20000;
    }
}