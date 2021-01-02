package tech.developingdeveloper.java;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordSecurity {

    public static void main(String[] args) {
        String str = "HellowWorld" /*new Scanner(System.in).next()*/;
        String pass = encrypt(encrypt(str));
        System.out.println(encrypt(str).equals(encrypt("HelloWorld")));
        System.out.println(pass);
    }

    private static String encrypt(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            MessageDigest md1 = MessageDigest.getInstance("MD5");
            byte[] bt = md.digest(str.getBytes(StandardCharsets.UTF_8));
            byte[] bt1 = md1.digest(str.getBytes(StandardCharsets.UTF_8));
            for (byte b : bt)
                System.out.printf("%02x", b);
            System.out.println();
            for (byte b : bt) {
                sb.append(String.format("%02x", b));
            }
            for (byte b : bt1) {
                sb1.append(String.format("%02x", b));
            }
            System.out.println("SHA-256: " + sb.toString());
            System.out.println("MD5: " + sb1.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
