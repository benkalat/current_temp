import org.json.JSONObject;

public class weatherByOpenwetherMap implements weather {
    httpRequest httpReq = new httpRequest();


    public String getTemperature(float[] coordinates) throws Exception {
//        float[] coordinates = loc.get_coordinates(location);
        String url= String.format("http://api.openweathermap.org/data/2.5/weather?units=metric&lat=%s&lon=%s&appid=9de243494c0b295cca9337e1e96b00e2", coordinates[0], coordinates[1]);
        String json_obj = httpReq.sendGet(url);
        JSONObject obj = new JSONObject(json_obj);
        String temp =  obj.getJSONObject("main").get("temp").toString();
        return temp;
    }

    public void runThread(float[] coordinates) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    String temp =  getTemperature(coordinates);
                    System.out.println("temperature by openweathermap api : "+temp);
                } catch(Exception e) {

                }
            }
        });
        t.start();

    }

}
