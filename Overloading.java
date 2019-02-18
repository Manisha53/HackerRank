import java.lang.*;
import java.util.*;
class shape{
	int area(int a,int b){                   //OVERLOADING OF area()
		return a*b;
	}
	int area(int x){
		return x*x;
	}
}

class Cat{
	void vocal(){
		System.out.println("meows!");
	}
}											//OVERRIDDING OF vocal()
class Dog {
	void vocal(){
		System.out.println("barks!");
	}
}

class Overloading{							//class having main()
	public static void main(String[] args) {
		shape s=new shape();
		//Scanner scan=new Scanner(System.in);

		System.out.println(s.area(2));
		System.out.println(s.area(2,3));

		Cat c=new Cat();
		Dog d=new Dog();
		c.vocal();
		d.vocal();

	}
}