package com.example.myapplication;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ValidateRequest extends StringRequest {
    final static private String URL = "http://ndb796android.cafe24.com/UserValidate.php";  //주소 마지막에 유저name이 바뀜
    private Map<String, String> parameters;

    public ValidateRequest(String userID, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);

    }
    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
