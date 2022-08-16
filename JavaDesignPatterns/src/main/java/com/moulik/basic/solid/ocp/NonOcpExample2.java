package com.moulik.basic.solid.ocp;

public class NonOcpExample2 {

}
class PasswordHasher {
	
	public String hashPassword(String password, HashingType hashingType) {
		
		String hashedPassword = "";
	    if(HashingType.BASE64.equals(hashingType))
	    {
	        hashedPassword="hashed with Base64";
	    }
	    else if(HashingType.MD5.equals(hashingType))
	    {
	        hashedPassword="hashed with MD5";
    	}

    	return hashedPassword;
	}
}
enum HashingType {
	
	BASE64, MD5
}