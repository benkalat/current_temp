import org.json.JSONObject;
//import \Users\bentsi.kalat\Desktop\java_proj\jar_files\json-simple-2.1.2.jar.class .


public  class weather {
    http_request http_req = new http_request();
    public float[] convert_name(String name) throws Exception{

        String url_convert_name="http://api.positionstack.com/v1/forward?access_key=5ef735a6b3398aca0cc29daa7b654e28&query="+name ;

        String geolocation = http_req.sendGet(url_convert_name);
        JSONObject obj = new JSONObject(geolocation);
        JSONObject location_obj= (JSONObject) obj.getJSONArray("data").get(0);

        float latitude =  Float.parseFloat( location_obj.get("latitude").toString());
        float longitude = Float.parseFloat(location_obj.get("longitude").toString());
        float[] coordinates = new float[]{latitude, longitude};

        return coordinates;
    }
    public  String get_temperature_coor(float lat, float lon) throws Exception{

        String url= String.format("http://api.openweathermap.org/data/2.5/weather?units=metric&lat=%s&lon=%s&appid=9de243494c0b295cca9337e1e96b00e2", lat, lon);

        String json_obj = http_req.sendGet(url);
        JSONObject obj = new JSONObject(json_obj);
        String temp =  obj.getJSONObject("main").get("temp").toString();
//        System.out.println("temp:"+temp);
        return temp ;
    }
    public String get_temperature(String location) throws Exception{
        float[] coordinates = new float[2];
        if (location.contains(",")) {
            String[] coor = location.split(",") ;
            coordinates[0]= Float.parseFloat(coor[0]);
            coordinates[1]= Float.parseFloat(coor[1]);
        } else {
            coordinates = convert_name(location);
//            System.out.println(location+":"+coordinates[0]+","+coordinates[1]);

        }
        String temp = this.get_temperature_coor(coordinates[0],coordinates[1]);
//        System.out.println("tempp:"+temp);
        return temp ;
    }





}
