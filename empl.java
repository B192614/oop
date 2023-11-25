import java.util.*;
abstract class employee
{
    abstract void getamount();
}
class hourlyemp extends employee
{
    int hours;
    int wagesphour;
    hourlyemp(int hours,int wagesphour)
    {
        this.hours=hours;
        this.wagesphour=wagesphour;
    }
    void getamount()
    {
        System.out.println("total amount for hours"+hours*wagesphour);
    }
}
class weeklyemp extends employee
{
    int weeks;
    int wagespweek;
    weeklyemp(int weeks,int wagespweek)
    {
        this.weeks=weeks;
        this.wagespweek=wagespweek;
    }
    void getamount()
    {
        System.out.println("total amount for weeks"+weeks*wagespweek);
    }
}
class empl
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int weeks=sc.nextInt();
        int wagespweek=sc.nextInt();
        weeklyemp w=new weeklyemp(weeks,wagespweek);
    w.getamount();
        int hours=sc.nextInt();
        int wagesphour=sc.nextInt();
        hourlyemp h=new hourlyemp(hours,wagesphour);
        h.getamount();
    }
}
