package ch2;

public class Init extends BaseInit {
	{
		System.out.println("init block");
	}
	
	static {
		System.out.println("static init block");
	}
	
	public Init() {
		System.out.println("Init constructor");
		
	}
	
	public static void main(String[] args) {
		new Init();
	}

}

class BaseInit {
	static {
		System.out.println("static init in BaseInit");
	}
	{
		System.out.println("init in BaseInit");
	}
	BaseInit() {
		System.out.println("BaseInit constructor");
	}
}
