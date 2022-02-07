    class BankAccount{
    private int accountNumber; 
    private String accountName;
    private double accountBalance=0;
    private String branch;
    private java.util.Date dateCreated;


    BankAccount(int accountNumber, String accountName,double accountBalance,String branch){
        this.accountNumber= accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        this.branch = branch;

    }
    BankAccount(){
        dateCreated =new java.util.Date();
    }

    public String getAccountName(){
        return this.accountName;
    }
    public void setAccountName(String accountName){
         this.accountName = accountName;
    }

     public double getAccountBalance(){
        return this.accountBalance;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(int accountNumber){
      this.accountNumber =accountNumber;       
     }
    public String getBranch(){
        return this.branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public boolean deposit(double amount){
       if(amount > 0){
         accountBalance +=amount;
         return true;
    } 
    else{
        return false;
    }
   }

    public boolean withdraw(double amount){
        if(amount > accountBalance){
        return false;
       }
       else{
      accountBalance -=amount;
      return true;
       }
    }
    public String getToString(){
         return getAccountName() + getAccountNumber() + getBranch() + getDateCreated() + getAccountBalance();
    }
    
    
}