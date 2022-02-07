class StudentAccount extends BankAccount{
    private String Regnumber;
     
     StudentAccount(){
       super();
     }
     
     StudentAccount(int accountNumber, String accountName,double accountBalance,String branch,String Regnumber){
         super(accountNumber,accountName,accountBalance,branch);
         this.Regnumber = Regnumber;

     }
     public String getRegnumber(){
         return this.Regnumber;
     }
     public void setRegnumber(String Regnumber){
         this.Regnumber = Regnumber;
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
       return getAccountBalance() + 200;
    }
}
