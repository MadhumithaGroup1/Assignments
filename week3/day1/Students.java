package week3.day1.assignment;

public class Students {
	
	//overloading the same method
	public void getStudentInfo(int id) {
		System.out.println("Student Id: "+id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Name: "+name);
		System.out.println("Student Id: "+id);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Email Id: "+email);
		System.out.println("Student Phone "+phoneNumber);
	}
	
	public static void main(String[] args) {
		
		Students obj=new Students();
		
		//calling the overloaded methods using  the object created, by passing respective arguments
		obj.getStudentInfo(054);
		System.out.println("--------------------------");
		obj.getStudentInfo(054, "Madhumitha");
		System.out.println("--------------------------");
		obj.getStudentInfo("xyz@abc.com", 8769421303l);
		
	}

}
