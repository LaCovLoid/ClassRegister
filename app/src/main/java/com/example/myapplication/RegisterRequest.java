package com.example.myapplication;

import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    final static private String URL = "http://ndb796android.cafe24.com/UserRegister.php";  //영상속주소 입력
    private Map<String, String> parameters;

    public RegisterRequest(String userID, String userPassword, String userGender, String userMajor, String userEmail, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword",userPassword);
        parameters.put("userGender",userGender);
        parameters.put("userMajor",userMajor);
        parameters.put("userEmail",userEmail);
    }
    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
