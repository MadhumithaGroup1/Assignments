package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop size: 18inch*10inch");
	}
	
	public static void main(String[] args) {
		
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();
		
	}

}
