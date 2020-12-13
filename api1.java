
public class api1 extends Thread {
    public  String location = "";
    public api1(String location) {
        this.location = location;
    }

    public void run()  {
        try {
            Thread.sleep(10_000);
            weather temp_api1=new weather();
            String temp =  temp_api1.get_temperature(location);
            System.out.println("temperature by first api : "+temp);
        } catch(Exception e) {
//            listener.notifyThatDarnedExceptionHappened(...);
        }
    }
}
