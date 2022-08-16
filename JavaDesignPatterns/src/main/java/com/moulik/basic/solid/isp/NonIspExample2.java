package com.moulik.basic.solid.isp;

/**
 * Interfaces should not force classes to implement what they can’t do. Large interfaces should be divided into small ones.
 * 
 * Consider we add decoding feature to the PasswordHasher interface since a hasher can also have functionality to decode
 * Password from hash.
 * However, it would break this principle since if some class just wants to have the hashPassword functionality, they would
 * unnecessarily need to implement this extra method as well. Furthermore, some hashing algorithms like SHA256 is not
 * decryptable.
 * Instead, we can add another interface to the applicable classes to implement their decoding algorithm.
 */
public class NonIspExample2 {

}
interface PasswordHasher
{
    String hashPassword(String password);
    String decodePasswordFromHash(String hash);
}