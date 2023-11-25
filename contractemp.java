import java.util.*;
class cemp
{
    String firstname;
    String lastname;
    String department;
    String designation;
    cemp(String firstname,String lastname,String department,String designation)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.department=department;
        this.designation=designation;
    }
    String getdes()
    {
        return designation;
    }
}
class hemp extends cemp
{
    double hours;
    double wagesphour;
    hemp(String firstname,String lastname,String department,double hours,double wagesphour)
    {
        super(firstname,lastname,department,"hourly");
        this.hours=hours;
        this.wagesphour=wagesphour;
    }
    String getdes()
    {
        return super.designation;
    }
    double calculatewages()
    {
        return hours*wagesphour*4;
    }
    void display()
    {
        System.out.println(firstname+lastname+department+designation);
    }
}
class wemp extends cemp
{
    double week;
    double wagespweek;
    wemp(String firstname,String lastname,String department,double week,double wagespweek)
    {
        super(firstname,lastname,department,"weekly");
        this.week=week;
        this.wagespweek=wagespweek;
    }
    String getdes()
    {
        return super.designation;
    }
    double calculatewages()
    {
        return week*wagespweek;
    }
    void display()
    {
        System.out.println(firstname+lastname+department+designation);
    }
}
class contractemp
{
    public static void main(String arr[])
    {
       // cemp c=new cemp("Deepthi","Siripuram","IT","promanager");
        hemp h=new hemp("Deepthi","Siripuram","IT",4,1000);
        wemp w=new wemp("Manasa","masthan","cse",2,10000);
        h.display();
        System.out.println(h.calculatewages());
        w.display();
       System.out.println(w.calculatewages());
    }
}