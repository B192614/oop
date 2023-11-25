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
    String type;
    String name;
    void set(String type,String name)
    {
        this.type=type;
        this.name=name;
    }
    String gettype()
    {
        return type;
    }
    String getname()
    {
        return name;
    }
    void maintenance()
    {
        System.out.println("regular checkup and oil change");
    }
    void average()
    {
        System.out.println("40km/h");
    }
}
class geared extends twowheeler
{
    void average()
    {
        System.out.println("40");
    }
}
class nongeared extends twowheeler
{
    void average()
    {
        System.out.println("50");
    }
}
class twh
{
    public static void main(String arr[])
    {
    geared g=new geared();
    g.setall("TS5262","hus7392","black");
    g.getconsumption(5);
    g.display();
    g.displayconsumption();
    g.maintenance();
    g.average();
    g.set("gdiugd","hero");
    System.out.println(g.gettype());
    System.out.println(g.getname());
    //g.average();
    nongeared ng=new nongeared();
    ng.setall("TS8372","jh08398","purple");
    ng.getconsumption(15);
    ng.display();
    ng.displayconsumption();
    ng.maintenance();
    ng.average();
    ng.set("vhujf","honda");
    System.out.println(ng.gettype());
    System.out.println(ng.getname());
    //ng.average();
    }
}