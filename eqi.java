import java.util.*;
class eqi
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter str1");
        String str1=sc.nextLine();
        System.out.println("enter str2");
        String str2=sc.nextLine();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

    }
}