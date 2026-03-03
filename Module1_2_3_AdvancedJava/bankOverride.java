class Bank{
   double balance;
   void withdraw(int amt){
      balance-=amt;
   }
}
class SBI extends Bank{

    void withdraw(int amt){
      balance-=(amt+10);
    }
}

public class bankOverride {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.balance = 2000;
        sbi.withdraw(500);
        System.out.println("SBI Balance after withdrawal: " + sbi.balance);
    }
    
}
