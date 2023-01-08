package Encryption_Decription;

import java.io.*;
import java.util.*;

// Encryption using substitution Cipher
public class Encrption1 {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zyxwvutsrqponmlkjihgfedcba";

        System.out.println("Enter any string: ");
        String str = br.readLine();
        String decrypt = "";

        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            int j = a.indexOf(c);
            decrypt = decrypt + b.charAt(j);
        }

        System.out.println("The encrypted data is: " + decrypt);
    }
}
