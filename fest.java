import java.util.*;
class house
{
    String glance;
    house()
    {
        glance="notseen";
    }
    void scream()
    {
        glance="seen";
    }
    void calm()
    {
        glance="notseen";
    }
    void showreaction()
    {
        System.out.println(glance);
    }
}
class fest
{
    public static void main(String arr[])
    {
        house g1=new house();
        house g2=new house();
        house g3=new house();
        house g4=new house();
        house g5=new house();
        g1.scream();
        g2.scream();
        // g3.calm();
        // g4.calm();
        // g5.calm();
        g1.showreaction();
        g2.showreaction();
        g3.showreaction();
        g4.showreaction();
        g5.showreaction();
   }
}