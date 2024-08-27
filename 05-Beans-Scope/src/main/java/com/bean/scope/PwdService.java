package com.bean.scope;

import java.beans.Encoder;
import java.util.Base64;


public class PwdService {
	

    public PwdService() {
		//super();
		// TODO Auto-generated constructor stub
    	System.out.println("PwdService :: Constructor");
	}

	public String encodePwd(String pwd) {
        // Create a Base64 encoder instance
        Base64.Encoder encoder = Base64.getEncoder();
        
        // Encode the password
        byte[] encodedPwd = encoder.encode(pwd.getBytes());
        
        // Convert the encoded bytes back to a String and return it
        return new String(encodedPwd);
    }
}
