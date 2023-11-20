import java.util.*;
import java.lang.*;
class occ1{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String theString = "The other day I went over there.";
    theString = theString.toLowerCase();
    System.out.println("input");
        String s=sc.nextLine();
    int index = -1;
    int count = 0;

    while (true) {
        index = theString.indexOf(s, index + 1);
        if (index == -1) {
            break;
        } else {
            count += 1;
        }
    }

    System.out.printf("The string %s was found %d times.\n",s, count);

    // Output:
    // The string 'the' was found 3 times.
}
}
