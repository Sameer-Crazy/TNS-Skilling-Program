public class BankAccount {
    private long accno;
    private String accHolderName;
    private double accBalance;

    public BankAccount(long accno) {
        this.accno = accno;
    }
    public BankAccount(long accno, String accHolderName) {
        this.accno = accno;
        this.accHolderName = accHolderName;
    }
    public BankAccount(long accno, String accHolderName, double accBalance) {
        this.accno = accno;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }
    public String toString(){
        String str = String.format("Account no: %s \nAccount Holder Name: %s\nAccount Balance: %s\n",accno,accHolderName,accBalance);
        return str;
    }
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1234567890);
        BankAccount a2 = new BankAccount(1987654321,"Sameer");
        BankAccount a3 = new BankAccount(1987619876,"Sai Kasthuri",50000);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }

}