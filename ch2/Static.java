package ch2;

public class Static implements Inter {
	public static void main(String[] args) {
		System.out.println(Inter.getNumber());
		
		// compiler error: System.out.println(getNumber());
		// compiler error: System.out.println(new Static().getNumber());
		
		Static st = new Static();
		st.work();
		
		StaticChild ch = new StaticChild();
		ch.work();
		
		Static staticTypeMatters = new StaticChild();
		staticTypeMatters.work(); // this is because of the syntax trick
	}
	
	static void work() {
		System.out.println("Static::work()");
	}
}

class StaticChild extends Static {
	static void work() {
		System.out.println("StaticChild::work() redefined");
	}
	
	
}

interface Inter {
	static int getNumber() {
		return -1;
	}
}
