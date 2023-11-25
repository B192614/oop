import java.util.*;
class lengths
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
      // char[] c=str.toCharArray();
       int co=0;
       for(char c:str.toCharArray())
       {
        co++;
       }
    System.out.println(co);
    }
}