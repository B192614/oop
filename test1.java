class multi extends Thread{
    public void run()
    {
        System.out.println("Thread is running");
    }
}
public class test1 {
    public static void main(String args[])
    {
        multi m=new multi();
        m.start();
    }
}
