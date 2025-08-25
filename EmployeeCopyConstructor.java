public class EmployeeCopyConstructor {

    int Emp_id;
    String Emp_name;

    public EmployeeCopyConstructor(int i, String name) {

        Emp_id=i;
        Emp_name=name;
    }

    public EmployeeCopyConstructor(EmployeeCopyConstructor s2){
        Emp_id=s2.Emp_id;
        Emp_name=s2.Emp_name;        
    }
    
    void details(){
        System.out.println( "Details of Employee are: " + Emp_id + " "+ Emp_name);

    }

    public static void main(String[] args) {
        EmployeeCopyConstructor ecc = new EmployeeCopyConstructor(101,  "Divya");
        ecc.details();
        //EmployeeCopyConstructor copy = new EmployeeCopyConstructor();
        EmployeeCopyConstructor copy;
        copy=ecc;
        copy.details();

        copy.Emp_id=2;
        copy.Emp_name="Shubhi";
        System.out.println("Details  after change by copy");
        copy.details();
        ecc.details();
        
        System.out.println("----------\n Actual Copying is not happening, Now actual happening is done by the foll. method.");
        EmployeeCopyConstructor cp = new EmployeeCopyConstructor(ecc);
        cp.details();
        ecc.details();
        cp.Emp_id=200;
        System.out.println("After changing");
        cp.details();
        ecc.details();

    }
}
