import java.util.Collections;  //SORTING THE ELEMENTS IN THE ARRAYLIST USING COLLECTIONS -SORT()
import java.util.ArrayList;
class ArrayLists{
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(2);
		arr.add(5);
		arr.add(3);
		Collections.sort(arr);
		for(int i:arr){
			System.out.println(i);      
		}
		System.out.println( arr.remove(0));  //2
		System.out.println(arr.get(0));      //3

	}
}
