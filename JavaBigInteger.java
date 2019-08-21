import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        BigInteger a=new BigInteger(in.next());
        BigInteger b=new BigInteger(in.next());
        BigInteger c,d;
        c=a.add(b);
        d=a.multiply(b);
        System.out.println(c);
        System.out.println(d);
    }
}

