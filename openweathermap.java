
public class openweathermap extends Thread {
    public  String location = "";
    public openweathermap(String location) {
        this.location = location;
    }

    public void run()  {
        try {
//            Thread.sleep(10_000);
            weather temp_api1=new weather();
            String temp =  temp_api1.get_temperature(location);
            System.out.println("temperature by openweathermap api : "+temp);
        } catch(Exception e) {
//            listener.notifyThatDarnedExceptionHappened(...);
        }
    }
}
