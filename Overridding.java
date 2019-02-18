import java.util.*;
import java.lang.*;
class Cat{
	void vocal(){
		System.out.println("meows!");
	}
}
class Dog {
	void vocal(){
		System.out.println("barks!");
	}
}

class Overridding{
	public static void main(String[] args) {
		Cat c=new Cat();
		Dog d=new Dog();
		c.vocal();
		d.vocal();
	}

}