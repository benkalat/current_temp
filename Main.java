
//import com.company.*;

public class Main {



    public static void main(String[] args) throws Exception{
        location loc = new location();
        float[] coordinates = loc.get_coordinates(args[0]);
        System.out.println("coordinates :"+coordinates[0]+coordinates[1]);
        weatherByCommunityOpenWeatherMap  temperature1= new weatherByCommunityOpenWeatherMap();
        temperature1.runThread(coordinates);
        weatherByOpenwetherMap temperature2 = new weatherByOpenwetherMap();
        temperature2.runThread(coordinates);


    }
}

