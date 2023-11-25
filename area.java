class shape
{
    void area(double s)
    {
        System.out.println("area of square:"+s*s);
    }
    void area(int l,int b)
    {
        System.out.println("area of rectangle"+l*b);
    }
    void area(double b,double h)
    {
        System.out.println("area of triangle"+(b*h)/2);
    }
    void area(int x)
    {
        System.out.println("area of circle"+3.14*x*x);
    }
}
class area
{
 public static void main(String arr[])
 {
    shape s=new shape();
    s.area(5);
    s.area(5.0);
    s.area(5,6);
    s.area(5.0,6.0);
 }   
}