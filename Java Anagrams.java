import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function0

        char[] s1=a.toLowerCase().toCharArray();
        char[] s2=b.toLowerCase().toCharArray();
        int la=a.length();
        int lb=b.length();
        int flag=1;
        if(la!=lb){
            return false;
        }

        else{
             for(int i=0;i<la-1;i++){
                for(int j=i+1;j<la;j++){
                     if(s1[i]>s1[j]){       //sort
                char temp=s1[i];
                s1[i]=s1[j];
                s1[j]=temp;
            }
            if(s2[i]>s2[j]){
                char temp=s2[i];
                s2[i]=s2[j];
                s2[j]=temp;
            }

                }
           
        }
    //      for(int i=0;i<la;i++){
    //         System.out.print(s1[i]);
    //     }
    //     System.out.println();
    //     for(int i=0;i<lb;i++){
    //         System.out.print(s2[i]);
    //     }

    //  System.out.println();
        for(int i=0;i<la;i++){
            if(s1[i]!=s2[i]){
                flag=0; 
                break;
            }
        }
       

        }
        if(flag==0){
            return false;
        }
        else{
         return true;   
        }
        
    }


  public static void main(String[] args) {
