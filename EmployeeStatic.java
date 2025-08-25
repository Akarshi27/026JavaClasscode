/*Sabse pehle static then constroctor then any other methods
 * Static methods can be called without the object creation
 * staticMethod ke andar we can only access directly static variables
 * 
 * FINAL KEYWORD----->>> 1. VARAIBLE, 2. METHOD 3. CLASS
 * finnal varaibles values cant be changed
 * final method me overriding is not allowed
 * final class cant be inherited...
 */


public class EmployeeStatic {

    int Emp_id;
    static String Org;
    void details(){

        System.out.println("ID: "+ Emp_id +" "+Org);
    }

    static{
        Org="Kiet";   //static block is used to initialise the static variables....instead of initialising it through the classname
    }

    static void staticMethod(){
        System.out.println("this is static method");
    }
     public static void main(String[] args) {
        EmployeeStatic.Org="Kiet";//org is static hence acceessed using class name
        EmployeeStatic es= new EmployeeStatic();
        es.Emp_id=101;

        es.details();
        staticMethod();


     }
}
