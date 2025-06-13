class atm
{
    private  double balance=452.67;
    public  double getBalance()
    {
        return balance;
    }
    public  void setBalance(double balance)
    {
        this.balance=balance;
    }
}
public class encap
{
    public static void main(String[] args)
    {
            atm ref=new atm();
            System.out.println(ref.getBalance());
            ref.setBalance(5678.87);
            System.out.println(ref.getBalance());
    }
}