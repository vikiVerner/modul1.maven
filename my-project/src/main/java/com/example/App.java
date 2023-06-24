//java -jar target/myname.jar
package com.example;

import com.google.gson.Gson;

import java.util.LinkedHashMap;

public class App
{
    public static void main( String[] args )
    {

        LinkedHashMap<String, String> name = new LinkedHashMap<>();
        name.put("name","Viktoriia");
        name.put("lastName","Verner");

        String json = new Gson().toJson(name);
        System.out.println("json = " + json);
    }
}
