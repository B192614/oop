import java.util.Scanner;

class occ
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String sen = sc.nextLine();
        System.out.println("input");
        String s=sc.nextLine();
        int count=0;
        int index=sen.indexOf(s);
        while (index>0)
        {
            index=sen.index(s,index+1);
            count++;
        }


        System.out.printf("The characters 'the' were found %d times", count);
        System.out.println();

        System.out.println("This was programmed by -----");
    }
}