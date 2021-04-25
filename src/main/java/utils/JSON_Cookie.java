package utils;


import org.json.*;

public class JSON_Cookie {
    public static void main(String[] args) throws JSONException {

        String cookie = "username = Mark Den; expires = Thu, 15 Jun 2020 12:00:00 UTC; path = /";

        //Case 1: Converts Cookie String to JSONObject
        JSONObject jsonObject = Cookie.toJSONObject(cookie);
        System.out.println(jsonObject);

        //Case 2: Converts JSONObject to Cookie String
        System.out.println(Cookie.toString(jsonObject));
    }   
}
