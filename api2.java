
public class api2 extends Thread {
    public  String location ;
    public api2(String location) {
        this.location = location;
    }

    public void run()  {
        try {
            weather temp_api=new weather_child();
            String temp =  temp_api.get_temperature(location);
            System.out.println("temperature by second api : "+temp);
        } catch(Exception e) {
//            listener.notifyThatDarnedExceptionHappened(...);
        }
    }
}
