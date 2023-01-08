package Encryption_Decription;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Encryption using CeaserCipher
public class Encryption {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        System.out.println("Enter any string");

        String str = br.readLine();
        System.out.println("\nEnter the key: ");
        int key = sc.nextInt();

        String encrypted = encrypt(str, key);
        System.out.println("\nEncrypted String s: " + encrypted);

        String decrypted = decrypt(encrypted, key);
        System.out.println("\nDecrypted String s: " + decrypted);
    }

    private static String encrypt(String str, int key) {

        String encrypted = "";

        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                c = c + (key % 26);

                if (c > 'Z') {
                    c = c - 26;
                }
            } else if (Character.isLowerCase(c)) {
                c = c + (key % 26);

                if (c > 'z') {
                    c = c - 26;
                }
            }

            encrypted += (char) c;
        }

        return encrypted;
    }

    private static String decrypt(String str, int key) {
        String decrypted = "";

        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                c = c - (key % 26);

                if (c < 'A') {
                    c = c + 26;
                }
            } else if (Character.isLowerCase(c)) {
                c = c - (key % 26);

                if (c < 'a') {
                    c = c + 26;
                }
            }

            decrypted += (char) c;
        }

        return decrypted;
    }
}

// output

/*
 * Enter any string
 * Hello world
 * 
 * Enter the key:
 * 4
 * 
 * Encrypted String s: Lipps asvph
 * 
 * Decrypted String s: Hello world
 */