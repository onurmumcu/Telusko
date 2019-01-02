package stringHandling;

public class Student {

	int rollno;
	String sname;
	
	public Student(int rollno, String sname) {
		this.rollno = rollno;
		this.sname= sname;
		
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}
	
	
	
	
	
	
//	@Override
//	public String toString() {
//		
//		return rollno+sname;
//	}
	
}
