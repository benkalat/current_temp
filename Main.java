
//import com.company.*;

public class Main {



    public static void main(String[] args) throws Exception{

        api1 t1 = new api1(args[0]);
        t1.start();
        api2 t2 = new api2(args[0]);
        t2.start();

    }
}

