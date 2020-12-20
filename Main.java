
//import com.company.*;

public class Main {



    public static void main(String[] args) throws Exception{


        openweathermap thread_openweathermap = new openweathermap(args[0]);
        thread_openweathermap.start();
        community_open_weather_map thread_community_open_weather_map = new community_open_weather_map(args[0]);
        thread_community_open_weather_map.start();

    }
}

