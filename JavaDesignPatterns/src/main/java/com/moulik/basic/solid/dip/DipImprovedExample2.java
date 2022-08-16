package com.moulik.basic.solid.dip;

/**
 * Much better. We can easily change the hashing algorithm. Our service does not care about the algorithm, it's up to the
 * client to choose it. 
 * We don’t depend on the concrete implementation, but the abstraction.
 *
 */
public class DipImprovedExample2 {

}
class PasswordService
{
    private PasswordHasher passwordHasher;
    
    public PasswordService(PasswordHasher passwordHasher)
    {
        this.passwordHasher = passwordHasher;
    }
    
    void hashPassword(String password)
    {
        this.passwordHasher.hashPassword(password);
    }
}
class PasswordHasher {
	public void hashPassword(String password) {
		
	}
}