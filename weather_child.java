
import org.json.JSONObject;
//
public class weather_child extends weather {

    public  String get_temperature_coor(float lat, float lon) throws Exception{

        String url= String.format("https://community-open-weather-map.p.rapidapi.com/weather?lat=%s&lon=%s&id=2172797&lang=null&units=metric&mode=xml%%2C%%20html", lat, lon);
        String[] headers=new String[]{"X-Rapidapi-Key"," c3c0ff385amsheb7052b2848f9d1p18c7e0jsnf22404a88363","X-Rapidapi-Host"," community-open-weather-map.p.rapidapi.com" };

        String json_obj = http_req.sendGet(url,headers);
//        System.out.println(json_obj);
        JSONObject obj = new JSONObject(json_obj);
        String temp =  obj.getJSONObject("main").get("temp").toString();

//        System.out.println("child");
        return temp ;
    }
}
