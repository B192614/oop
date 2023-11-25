import java.util.*;
class index
{
    public static void main(String arr[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println("enter alphabet");
    char al=sc.next().charAt(0);
    int count=0;
    int ind=str.indexOf(al);
    while(ind>=0)
    {
        ind=str.indexOf(al,ind+1);
        count++;
    }
    System.out.println(count);

}
}