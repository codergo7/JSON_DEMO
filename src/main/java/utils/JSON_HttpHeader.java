package utils;

import org.json.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

public class JSON_HttpHeader {
    public static void main(String[] args) throws JSONException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Method", "POST");
        jsonObject.put("Request-URI", "http://www.tutorialspoint.com/");
        jsonObject.put("HTTP-Version", "HTTP/1.1");

        //Case 1: Converts JSONObject of Header to String
        String headerText = HTTP.toString(jsonObject);
        System.out.println(headerText);

        headerText = "POST \"http://www.tutorialspoint.com/\" HTTP/1.1";
        //Case 2: Converts Header String to JSONObject
        System.out.println(HTTP.toJSONObject(headerText));
    }   
}
