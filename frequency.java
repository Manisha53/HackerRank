//count the number of frequency of each element in an array of digits.
import java.util.*;
class frequency{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num[]=new int[20];
		int count[]=new int[20];
		int x;
		int n,temp;
		System.out.println("Enter the number of terms:");
		n=sc.nextInt();
	    System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
		}
		System.out.println("sorted array :");
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}count[i]=num[i];
				System.out.println(count[i]);
			}
			
			for(int i=0;i<n;){
				x=1;
				for(int j=i+1;j<n;j++){
					if(count[i]==count[j]){
						x++;
					}
				}
				System.out.println("Frequency of : "+count[i]+" is "+x);
				i=i+x;
			}
		}
			
	}
	
	