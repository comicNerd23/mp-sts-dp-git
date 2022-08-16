package com.moulik.basic.solid;

public class NonSrpExample2 {

}
class PasswordHasher
{
    public void hashAndSavePassword(String password)
    {
        hashPassword();
        savePassword();
    }

    public void hashPassword()
    {
        //hashing implementation
    }
    public void savePassword()
    {
        //save to the db
    }
}