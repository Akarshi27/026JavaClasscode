public class methodCode {
    int id;          //instance variables
    String name;     //instance variable
    
    methodCode(){ //non parameterized
        // id=111;
        // name="pari";
        System.out.println("Details are: "+ id + " " + name+ " This is the default cons");
    }

     methodCode(int id, String name) //id,name are local var her
    { //parameterized cons
        this.id=id; //this.id  is refferencing to the instance variable
        this.name=name;
        
    }
    

    public void displayMethod()
    {
        System.out.println("Details are: "+ id + " " + name);
    }
    public static  void main(String[] args) {
        methodCode m1 = new methodCode();
         m1.id=101;
         m1.name="akarshi";
        m1.displayMethod();

        methodCode m2 = new methodCode(); //heap me iss object ke liye bhi memory allocate ho jaegi
        m2.id=102;
        m2.name="pari";
        m2.displayMethod();

        methodCode m3 = new methodCode(111,"Shree");
        m3.displayMethod();
    
    }
}