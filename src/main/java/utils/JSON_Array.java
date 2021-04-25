package utils;

import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSON_Array {
    public static void main(String[] args) throws JSONException {

        JSONArray list = new JSONArray();

        list.put("foo");
        list.put(new Integer(100));
        list.put(new Double(1000.21));
        list.put(new Boolean(true));
        list.put(JSONObject.NULL);

        System.out.println("JSONArray: ");
        System.out.println(list);
    }   
}
