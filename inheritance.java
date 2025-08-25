class employee{
    String name;
    String org;
    int id;

}

class faculty extends employee{
    String dept;
    String sub;

    void details()
    {
        System.out.println(dept + " "+ sub);
    }

}

public class inheritance{
    public static void main(String[] args) {
        faculty f1= new faculty();
        f1.name="akarshi";
        f1.org="Kiet";
        f1.id=101;
        f1.dept="ece";
        f1.sub="microelectronics";
    }

}