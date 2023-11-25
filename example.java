abstract class shape
{
    double r,s,side,radius;
    abstract void getarea();
    abstract void getvolume();
}
 class square extends shape
{
    double s;
    square(double s)
    {
        this.s=s;
    }
    void getarea()
    {
        System.out.println("area of square "+s*s);
    }
    void getvolume()
    {
         System.out.println("2d");
    }
}
class circle extends shape
{
    double r;
    circle(double r)
    {
        this.r=r;
    }
    void getarea()
    {
        System.out.println("area of circle "+3.14*r*r);
    }
    void getvolume()
    {
        System.out.println("2d");
     }
 }
class cube extends shape
{
    double area;
    double side;
     cube(double side)
     {
        this.side=side;
    }
    void getarea()
    {
        //area=6*side*side;
        System.out.println("area of cube "+6*side*side);
    }
    void getvolume()
    {
        System.out.println("volume of cube" +side*side*side);
    }
}
class sphere extends shape
{
    double radius;
    sphere(double radius)
    {
        this.radius=radius;
    }
    void getarea()
    {
        System.out.println("area of sphere "+4*3.14*radius*radius);
    }
    void getvolume()
    {
        System.out.println("volume of sphere" +(4/3)*3.14*radius*radius);
    }
}
class example
{
    public static void main(String arr[])
    {
        square sq=new square(4);
        circle ci=new circle(5);
        cube cu=new cube(4.5);
        sphere sp=new sphere(3.5);
        sq.getarea();
        sq.getvolume();
        ci.getarea();
        ci.getvolume();
        cu.getarea();
        cu.getvolume();
        sp.getarea();
        sp.getvolume();
    }
}

