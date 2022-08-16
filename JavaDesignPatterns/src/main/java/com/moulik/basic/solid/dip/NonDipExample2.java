package com.moulik.basic.solid.dip;

/**
 * Components should depend on abstractions, not on concretions.
 * 
 * We have a password service like the following:
 * We violated the principle since we tightly coupled the Base64Hasher and PasswordService. The password service should be
 * able to implement any hasher that is required.
 */
public class NonDipExample2 {

}
class PasswordService
{
    private Base64Hasher hasher = new Base64Hasher();
    void hashPassword(String password)
    {
        hasher.hashPassword(password);
    }
}
class Base64Hasher {
	public void hashPassword(String password) {
		
	}
}