package week3.day1.assignment;

public class Automation implements Language, TestTool, MultipleLanguage {
	
	public void Java() {
		System.out.println("Java installed");
	}
	
	public void Selenium() {
		System.out.println("Selenium initial setup done");
	}
	
	public void python() {
		System.out.println("Python installed");
	}
	
	public void ruby() {
		System.out.println("Ruby installed");
	}
	
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.Java();
		obj.Selenium();
		obj.python();
		obj.ruby();
		
	}

}
