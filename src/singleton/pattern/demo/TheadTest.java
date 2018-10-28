package singleton.pattern.demo;

public class TheadTest implements Runnable {

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Obect creation starts  ====>>> "+Thread.currentThread().getName());	
		MakeACaptain1 c1 = MakeACaptain1.getCaptain();
	System.out.println("Obect creation completed  ====>>> "+Thread.currentThread().getName());
	System.out.println(c1);
		
	}

	
}
