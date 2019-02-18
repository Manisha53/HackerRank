import java.util.*;
class findmissing{
	public static void main(String[] args) {
		int a[]=new int[10];
		int b[]=new int[10];
		int sum1=0;
		int sum2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array:");
		for(int i=0;i<9;i++){
			a[i]=sc.nextInt();
			sum1=sum1+a[i];
		}
		
		for(int i=0;i<10;i++){
			b[i]=i+1;
			sum2=sum2+b[i];
		}
		if(sum1<sum2){
			System.out.println("missing element is: "+(sum2-sum1));
		}
	}
}