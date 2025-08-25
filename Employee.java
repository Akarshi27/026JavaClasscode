
import java.util.*;
public class Employee
{
    String name;
    int sal;
    public void getDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        name= sc.nextLine();
        System.out.println("Enter salary ");
        sal = sc.nextInt();
    }
    public static void main(String args[])
    {
           Employee ob = new Employee();
            ob.getDetails();
            System.out.println( ob.name + " " +ob.sal);
            
    }
}