import java.util.*;
interface sf
{
    void getfirstname();
    void getlastname();
    void getaddress();
    void getamount();
    void getcontact();
}
class hosteler implements sf
{
    String firstname;
    String lastname,address;
    int clgfee;
    long contact;
    hosteler(String firstname,String lastname,String address,int clgfee,long contact)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.clgfee=clgfee;
        this.contact=contact;
    }
    public void getfirstname()
    {
        System.out.println("firstname: "+firstname);
    }
    public void getlastname()
    {
        System.out.println("lastname: "+lastname);
    }
    public void getaddress()
    {
        System.out.println("address: "+address);
    }
    public void getamount()
    {
        int hstlfee=3000;
        System.out.println("total fee: "+(clgfee+hstlfee));
    }
    public void getcontact()
    {
        System.out.println("contact: "+contact);
    }
}
class nonhosteler implements sf
{
    String firstname;
    String lastname,address;
    int clgfee;
    long contact;
    nonhosteler(String firstname,String lastname,String address,int clgfee,long contact)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.clgfee=clgfee;
        this.contact=contact;
    }
    public void getfirstname()
    {
        System.out.println("firstname: "+firstname);
    }
    public void getlastname()
    {
        System.out.println("lastname: "+lastname);
    }
    public void getaddress()
    {
        System.out.println("address: "+address);
    }
    public void getamount()
    {
        System.out.println("total fee: "+clgfee);
    }
    public void getcontact()
    {
        System.out.println("contact: "+contact);
    }
}
class studentfee
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hosteler details");
        String firstname=sc.next();
        String lastname=sc.next();
        String address=sc.next();
        int clgfee=sc.nextInt();
        long contact=sc.nextLong();
        hosteler ho=new hosteler(firstname,lastname,address,clgfee,contact);
        ho.getfirstname();
        ho.getlastname();
        ho.getaddress();
        ho.getamount();
        ho.getcontact();
         System.out.println("enter nonhosteler details");
        String firstname1=sc.next();
        String lastname1=sc.next();
        String address1=sc.next();
        int clgfee1=sc.nextInt();
        long contact1=sc.nextLong();
       nonhosteler nh=new nonhosteler(firstname1,lastname1,address1,clgfee1,contact1);
        nh.getfirstname();
        nh.getlastname();
        nh.getaddress();
        nh.getamount();
        nh.getcontact();
    }
}
