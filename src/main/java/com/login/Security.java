package com.login;

import java.util.HashMap;

public class Security {

 HashMap<String,String> security = new HashMap<String,String>();

 // constructors 

 Security(){
    security.put("Vivek","meta");
    security.put("Rohit", "science");
 }

 // method //
 protected HashMap getLoginInfo(){
    return security; 
 }

}
