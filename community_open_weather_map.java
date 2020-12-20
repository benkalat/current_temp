
public class community_open_weather_map extends Thread {
    public  String location ;
    public community_open_weather_map(String location) {
        this.location = location;
    }

    public void run()  {
        try {
            weather temp_api=new weather_child();
            String temp =  temp_api.get_temperature(location);
            System.out.println("temperature by  community_open_weather_map api : "+temp);
        } catch(Exception e) {
//            listener.notifyThatDarnedExceptionHappened(...);
        }
    }
}
