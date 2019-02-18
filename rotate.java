import java.util.*;
class rotate{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num[]=new int[20];
		//int count[]=new int[20];
		int x;
		int n,temp;
		System.out.println("Enter the number of terms:");
		n=sc.nextInt();
		System.out.println("Required array is:");
		for(int i=1;i<=n;i++){
			num[i]=i;
			System.out.println(num[i]);
		}
		System.out.print("\n");
		System.out.println("Enter the term from where you want to reverse the string");
		x=sc.nextInt();
		System.out.println("\n");
		for(int i=x+1;i<=n;i++){
			System.out.println(num[i]);
		}
		for(int i=1;i<=x;i++){
			System.out.println(num[i]);
		}
	}


}