import java.util.*;
interface fa
{
    void getamount();
}
class bus implements fa
{
    int distance;
    int amount;
    bus(int distance,int amount)
    {
        this.distance=distance;
        this.amount=amount;
    }
    public void getamount()
    {
        System.out.println("total amount: "+distance*amount);
    }
}
class train implements fa
{
    int distance;
    int amount;
    train(int distance,int amount)
    {
        this.distance=distance;
        this.amount=amount;
    }
    public void getamount()
    {
        System.out.println("total amount: "+distance*amount);
    }
}
class fare
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bus travelling");
        int distance=sc.nextInt();
        int amount=sc.nextInt();
        bus b=new bus(distance,amount);
        b.getamount();
         System.out.println("enter train travelling");
        int distance1=sc.nextInt();
        int amount1=sc.nextInt();
        train t=new train(distance1,amount1);
        t.getamount();
    }
}