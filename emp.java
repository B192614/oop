import java.util.*;
class employee
{
    static String fn;
    static String ln;
    void setall(String fn,String ln)
    {
        this.fn=fn;
        this.ln=ln;
    }
    // employee()
    // {
    //     System.out.println(fn+" "+ln);
    // }
    String getfn()
    {
        return fn;
    }
    String getln()
    {
        return ln;
    }
    // void display()
    // {
    //     System.out.println(fn+" "+ln);
    // }
}
class cemp extends employee
{
    String dep,des;
    int sal;
    void setall(String dep,String des,int sal)
    {
        this.dep=dep;
        this.des=des;
        this.sal=sal;
    }
    void display()
    {
        System.out.println(super.fn+super.ln);
    }
    // cemp()
    // {
    //     super();
    // }
    String getdep()
    {
        return dep;
    }
    String getdes()
    {
        return des;
    }
    int getsal()
    {
        return sal;
    }
}
class remp extends employee
{
    String dep,des;
    int sal;
    void setall(String dep,String des,int sal)
    {
        this.dep=dep;
        this.des=des;
        this.sal=sal;
    }
    // void display()
    // {
    //     super.display();
    // }
     void display()
    {
        System.out.println(super.fn+super.ln);
    }
    String getdep()
    {
        return dep;
    }
    String getdes()
    {
        return des;
    }
    int getsal()
    {
        return sal;
    }
}
class ex extends employee
{
    ex()
    {
    System.out.println("enter 0 or 1");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0)
        {
            c.display();
            System.out.println(c.getdep()+c.getdes()+c.getsal());
        }
        else
        {
            r.display();
            System.out.println(r.getdep()+r.getdes()+r.getsal());
        }
    }
}
class emp
{
    public static void main(String arr[])
    {
        employee e1=new employee();
        e1.setall("Deepthi","Siripuram");
        cemp c=new cemp();
        c.setall("CSE","Professor",30000);
        remp r=new remp();
        r.setall("ECE","teacher",10000);
        ex ee=new ex();
        
        // System.out.println("enter 0 or 1");
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // if(num==0)
        // {
        //     c.display();
        //     System.out.println(c.getdep()+c.getdes()+c.getsal());
        // }
        // else
        // {
        //     r.display();
        //     System.out.println(r.getdep()+r.getdes()+r.getsal());
        // }
        employee e2=new employee();
        e2.setall("masthan","manasa");
    }

}