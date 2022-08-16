package com.moulik.basic.solid.ocp;

/**
 * Class PasswordHasher should be replaced with an interface which has a hashPassword(String pw)
 *
 */
public class OcpImprovedExample2 {
	
}
interface PasswordHasher
{
    String hashPassword(String password);
}
class Base64Hasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with 64";
    }
}
class MD5Hasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with SHA256";
    }
}