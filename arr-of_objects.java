class Student
{
	public String name;
	public int roll;
	Student(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
}
class arr_of_objects{
	public static void main(String args[]){
		Student s[]=new Student[4];
		s[0]=new Student(1,"akash");
		s[1]=new Student(2,"asmita");
		s[2]=new Student(3,"mita");
		s[3]=new Student(4,"asmi");
		for(int i=0;i<s.length;i++){
			System.out.println("Student "+i+" :"+s.roll[i]+s.name[i]);
		}

	}
}
