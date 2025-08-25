public class employeeFinal {

     int Emp_id;
     final String Org="kiet";
    void details(){

        System.out.println(Org);
    }

     public static void main(String[] args) {
        //employeeFinal.Org="Kiet";//org is static hence acceessed using class name
        employeeFinal es= new employeeFinal();
        //es.Emp_id=101;

        es.details();

     }

    
}

class Faculty extends employeeFinal{
Faculty f= new Faculty();
f.details();
}
