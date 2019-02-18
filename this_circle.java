
class hey{
	int x,y;
}
class this_circle{
	public static void main(String args[]) {
		hey h1=new hey();
		hey h2=new hey();
		h1.x=2;
		h1.y=3;
		h2=h1;

			System.out.println(h2.y);
		}
	
}