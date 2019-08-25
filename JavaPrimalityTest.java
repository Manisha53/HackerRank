import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger b=new BigInteger(n); 
        
        String ans=(b.isProbablePrime(1)?"prime":"not prime");//we can use any number (1-100) as an argument in isProbablePrime()
        System.out.println(ans);
        scanner.close();
    }
}
