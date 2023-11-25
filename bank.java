import java.util.*;
class bankacc
{
    long accno;
    String name;
    double balance;
    bankacc(long accno,String name,double balance)
    {
        this.accno=accno;
        this.name=name;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("balance: "+balance);
    }
    void withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println("balance: "+balance);
        }
        else
        {
            System.out.println("insufficient");
        }
    }
    void display()
    {
        System.out.println("accountno: "+accno);
        System.out.println("holder_name: "+name);
        System.out.println("balance: "+balance);
    }
}
class savacc extends bankacc
{
    double interest;
    savacc(long accno,String name,double balance,double interest)
    {
        super(accno,name,balance);
        this.interest=interest;
    }
    void deposit(double amount)
    {
        interest=amount*interest/100;
        balance=amount+balance+interest;
        System.out.println("balance: "+balance);
    }
}
class checkacc extends bankacc
{
    double limit;
    checkacc(long accno,String name,double balance,double limit)
    {
        super(accno,name,balance);
        this.limit=limit;
    }
    void withdraw(double amount)
    {
        if(amount<=limit && amount<=balance)
        {
            balance=balance-amount;
            System.out.println("balance: "+balance);
        }
        else
        {
            System.out.println("overdraft");
        }
    }
}
class bank
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account details");
        long accno=sc.nextLong();
        String name=sc.next();
        double balance=sc.nextDouble();
        System.out.println("before transactions");
        bankacc ba=new bankacc(accno,name,balance);
        ba.display();
        System.out.println("enter interest");
        double interest=sc.nextDouble();
        savacc sa=new savacc(accno,name,balance,interest);
        System.out.println("amount for deposit");
        double amount=sc.nextDouble();
        sa.deposit(amount);
        System.out.println("after deposit");
        sa.display();
        System.out.println("enter limit");
        double limit=sc.nextDouble();
        checkacc ca=new checkacc(accno,name,balance,limit);
        System.out.println("amount for withdraw");
        double amount1=sc.nextDouble();
        ca.withdraw(amount1);
        System.out.println("after deposit");
        ca.display();
    }
}