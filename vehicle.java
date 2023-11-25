import java.util.*;
class veh
{
    String vnum;
    String inum;
    String color;
    int consumption;
    void setall(String vnum,String inum,String color)
    {
        this.vnum=vnum;
        this.inum=inum;
        this.color=color;
    }
    void getconsumption(int consumption)
    {
        this.consumption=consumption;
    }
    void displayconsumption()
    {
        System.out.println(consumption);
    }
    void display()
    {
        System.out.println(vnum);
        System.out.println(inum);
        System.out.println(color);
    }
}
class twowheeler extends veh
{
    void maintenance()
    {
        System.out.println("regular checkup and oil change");
    }
    void average()
    {
        System.out.println("40km/h");
    }
}
class fourwheeler extends veh
{
    void maintenance()
    {
        System.out.println("regular servicing and tire rotation");
    }
    void average()
    {
        System.out.println("15km/h");
    }
}
class vehicle
{
    public static void main(String arr[])
    {
        twowheeler tw=new twowheeler();
        tw.setall("TS5262","hus7392","black");
        tw.getconsumption(5);
        tw.display();
        tw.displayconsumption();
        tw.maintenance();
        tw.average();
        fourwheeler fw=new fourwheeler();
        fw.setall("TS9382","hdhf848","purple");
        fw.getconsumption(10);
        fw.display();
        fw.displayconsumption();
        fw.maintenance();
        fw.average();
    }
}