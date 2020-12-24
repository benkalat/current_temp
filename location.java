import org.json.JSONObject;

public class location  {

    httpRequest httpReq = new httpRequest();
    public float[] convertName(String name) throws Exception{
        String url_convert_name="http://api.positionstack.com/v1/forward?access_key=5ef735a6b3398aca0cc29daa7b654e28&query="+name ;
        String geolocation = httpReq.sendGet(url_convert_name);
        JSONObject obj = new JSONObject(geolocation);
        JSONObject location_obj= (JSONObject) obj.getJSONArray("data").get(0);
        float latitude =  Float.parseFloat( location_obj.get("latitude").toString());
        float longitude = Float.parseFloat(location_obj.get("longitude").toString());
        float[] coordinates = new float[]{latitude, longitude};
        return coordinates;
    }

    public  float[] get_coordinates(String location) throws Exception{
        if (location.contains(",")) {
            String[] coor = location.split(",") ;
            float[] coordinates =new  float[2];
            coordinates[0]= Float.parseFloat(coor[0]);
            coordinates[1]= Float.parseFloat(coor[1]);
            return coordinates;
        } else {
            float[] coordinates =new  float[2];
            coordinates = convertName(location);
            return coordinates;
        }
    }

}
