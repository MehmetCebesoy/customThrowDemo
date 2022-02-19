public class AccountManager {
   private double balance;
   //balance:kişinin hesabındaki para miktarı
    //deposit:para yatırmak
    //withdraw:para çekmek

   public void deposit(double amoumt){
        balance = getBalance() + amoumt;
   }
   public void withdraw(double amount) throws Exception {
       if (balance>=amount){
       balance = getBalance() - amount;}
       else {
           throw new Exception("Bakiye yetersiz");
       }
   }

    public double getBalance() {
        return balance;
    }

}
