package utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONML;
import org.json.JSONObject;

public class JSON_XML {
    public static void main(String[] args) throws JSONException {

        JSONArray list = new JSONArray();
        list.put("name");
        list.put("Robert");

        System.out.println("XML from a JSONArray: ");
        String xml = JSONML.toString(list);
        System.out.println(xml);

        System.out.println("\nJSONArray from a XML: ");
        list = JSONML.toJSONArray(xml);
        System.out.println(list);

        System.out.println("\nJSONObject from a XML: ");
        JSONObject object = JSONML.toJSONObject(xml);
        System.out.println(object);

        System.out.println("\nXML from a JSONObject: ");
        xml = JSONML.toString(object);
        System.out.println(xml);
    }   
}
