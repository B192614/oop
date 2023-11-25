import java.util.*;
class conc
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=sc.nextLine();
        System.out.println("enter string 2");
        String str2=sc.nextLine();
        System.out.println(str1.concat(str2));
    }
}