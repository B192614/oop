import java.util.*;
class vowel
{
    public static void main(String arr[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    char[] c=str.toCharArray();
    int v=0;
    int co=0;
    for(int i=0;i<str.length();i++)
    {
        if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
        {
            System.out.println(c[i]);
            v++;
        }
        else
        {
            if(c[i]>='a' && c[i]<='z')
            {
            co++;
            }
        }
    }
    System.out.println(v);
    System.out.println(co);
    }
}