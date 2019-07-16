import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
        LinkedList<Integer> L=new LinkedList<>();
       
        for(int i=0;i<n;i++){
            L.add(in.nextInt());
        }
        int q=in.nextInt();
        while(q-->0){
            String s=in.next();
            if(s.equals("Insert")){
                int index=in.nextInt();
                int num= in.nextInt();
                L.add(index,num);
 
            }
            else{
                int index=in.nextInt();
                L.remove(index);
            }
        }

        for(Integer i:L){
            System.out.print(i+" ");
        }
    }
}

