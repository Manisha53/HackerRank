import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=n;i>=1;i--){
		    
		    for(int j=i;j<=n;j++){
		        
		        System.out.print(j);
		    }
		    
		    for(int k=i;k>1;k--){
		         System.out.print(n);
		        
		    }
		    System.out.println();
		}
	}
}

/* 

input:
7
output:
7777777
6777777
5677777
4567777
3456777
2345677
1234567
*/
