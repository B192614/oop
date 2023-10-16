class employee
{
    String firstname,lastname;
    employee(String firstname,String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
    }
    String getfirstname()
    {
        return firstname;
    }
    String getlastname()
    {
        return lastname;
    }

}
class cemployee extends employee
{
    String department,designation;
    int salary;
    cemployee(String firstname,String lastname,String department,String designation,int salary)
    {
        super(firstname,lastname);
        this.department=department;
        this.designation=designation;
        this.salary=salary;
        
    }
    String fullname()
    {
        return getfirstname()+" "+getlastname();
    }
    String getdepartment()
    {
        return department;
    }
    String getdesignation()
    {
        return designation;
    }
    int getsalary()
    {
        return salary;
    }
    void setdepartment(String department)
    {
        this.department=department;
    }
    void setdesignation(String designation)
    {
        this.designation=designation;
    }   
}
class remployee extends employee
{
    String department,designation;
    int salary;
    remployee(String firstname,String lastname,String department,String designation,int salary)
    {
        super(firstname,lastname);
        this.department=department;
        this.designation=designation;
        this.salary=salary;
        
    }
    String fullname()
    {
        return getfirstname()+" "+getlastname();
    }
    String getdepartment()
    {
        return department;
    }
    String getdesignation()
    {
        return designation;
    }
    int getsalary()
    {
        return salary;
    }
    void setdepartment(String department)
    {
        this.department=department;
    }
    void setdesignation(String designation)
    {
        this.designation=designation;
    }   
}
public class test2
{
    public static void main(String arr[])
    {
        cemployee c=new cemployee("deepthi","siripuram","cse","professor",50000);
        remployee r=new remployee("latha","manikonda","ece","teacher",40000);
        System.out.println("name:"+c.fullname()+"department:"+c.getdepartment()+"designation:"+c.getdesignation()+"salary:"+c.getsalary());
        System.out.println("name:"+r.fullname()+"department:"+r.getdepartment()+"designation:"+r.getdesignation()+"salary:"+r.getsalary());
        c.setdepartment("eee");
        c.setdesignation("teacher");
        r.setdepartment("cse");
        c.setdesignation("lab assisant");
        System.out.println("name:"+c.fullname()+"department:"+c.getdepartment()+"designation:"+c.getdesignation()+"salary:"+c.getsalary());
        System.out.println("name:"+r.fullname()+"department:"+r.getdepartment()+"designation:"+r.getdesignation()+"salary:"+r.getsalary());

    }
}
