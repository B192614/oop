import java.util.*;
interface payable
{
    void getamount();
}
class invoice implements payable
{
    int m,n;
    invoice(int m,int n)
    {
        this.m=m;
        this.n=n;
    }
   public void getamount()
    {
        System.out.println((m*100)+n);
    }
}
class employee implements payable
{
    int s;
    employee(int s)
    {
        this.s=s;
    }
    public void getamount()
    {
        System.out.println(s*100);
    }
}
class pay
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int s=sc.nextInt();
    invoice in=new invoice(m,n);
    in.getamount();
    employee em=new employee(s);
    em.getamount();
    }
}