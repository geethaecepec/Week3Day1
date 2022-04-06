package Week3Day1Assignment;

public class Student {
	
 public void getStudentInfo(int ID, int deptCode) {
	System.out.println("23354, Dept1");
}
	public void getStudentInfo(String name, int id) {
		
		System.out.println("Geetha");
		System.out.println("Register number is 456");
		
	}
	
	public void getStudentInfo( long phonenumber,String email) {
	
		System.out.println("4566786");
		System.out.println("geetha.s@hcl34.com");
		
	}
	public static void main(String[] args) {
		Student info = new Student();
	info.getStudentInfo(0,0);
	info.getStudentInfo(null,0);
	info.getStudentInfo(0, null);
	
	
	
	}
		
		
		// TODO Auto-generated method stub

	}


