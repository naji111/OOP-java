package com.school.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtils {

    // Hash a password using SHA-256
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }

    // Verify if the input password matches the hashed password
    public static boolean verifyPassword(String password, String hashedPassword) {
        return hashPassword(password).equals(hashedPassword);
    }

    public static void main(String[] args) {
        // Example usage
        String password = "mySecurePassword123";
        String hashedPassword = hashPassword(password);

        System.out.println("Password: " + password);
        System.out.println("Hashed Password: " + hashedPassword);

        boolean isMatch = verifyPassword("mySecurePassword123", hashedPassword);
        System.out.println("Password match: " + isMatch);
    }
}
