import org.json.JSONObject;

public class weatherByCommunityOpenWeatherMap implements  weather{
    httpRequest httpReq = new httpRequest();

    public String getTemperature(float[] coordinates) throws Exception {
//            float[] coordinates = loc.get_coordinates(location);
            String url= String.format("https://community-open-weather-map.p.rapidapi.com/weather?lat=%s&lon=%s&id=2172797&lang=null&units=metric&mode=xml%%2C%%20html", coordinates[0], coordinates[1]);
            String[] headers=new String[]{"X-Rapidapi-Key"," c3c0ff385amsheb7052b2848f9d1p18c7e0jsnf22404a88363","X-Rapidapi-Host"," community-open-weather-map.p.rapidapi.com" };
            String json_obj = httpReq.sendGet(url,headers);
            JSONObject obj = new JSONObject(json_obj);
            String temp =  obj.getJSONObject("main").get("temp").toString();

            return temp ;

    }



    public void runThread(float[] coordinates) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    String temp =  getTemperature(coordinates);
                    System.out.println("temperature by CommunityOpenWeatherMap api : "+temp);
                } catch(Exception e) {

                }
            }
        });
        t.start();

    }

}
