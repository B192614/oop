import java.util.*;
class a
{
    int s;
    void sets(int s)
    {
        this.s=s;
       System.out.println(s);
    }
    a()
    {
        System.out.println("hi");
    }
}
class b extends a
{
    b()
    {
        super();
    }
}
class test
{
    public static void main(String arr[])
    {
        a obj1=new a();
        obj1.sets(4);
        b obj=new b();
    }
}