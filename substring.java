import java.util.*;
class substring
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("susbstring"+str.substring(start,end));

    }
}