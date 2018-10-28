package singleton.pattern.demo;

public class SingletonPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		System.out.println("***Singleton Pattern Demo***\n");
		System.out.println("Trying to make a captain for our team.");
		MakeACaptain c1 = MakeACaptain.getCaptain();
		System.out.println("Trying to make another captain for our team.");
		MakeACaptain c2 = MakeACaptain.getCaptain();
		if(c1==c2)
		{
			System.out.println("c1 and c2 are same instance");
		}*/
		

	/*	System.out.println("***Singleton Pattern Demo***\n");
		System.out.println("Trying to make a captain for our team.");
		MakeACaptain2 c1 = MakeACaptain2.getCaptain();
		System.out.println("Trying to make another captain for our team.");
		MakeACaptain2 c2 = MakeACaptain2.getCaptain();
		if(c1==c2)
		{
			System.out.println("c1 and c2 are same instance");
		}*/
		System.out.println("***Singleton Pattern Demo***\n");
		System.out.println("Trying to make a captain for our team.");
		MakeACaptain3 c1 = MakeACaptain3.getCaptain();
		System.out.println("Trying to make another captain for our team.");
		MakeACaptain3 c2 = MakeACaptain3.getCaptain();
		if(c1==c2)
		{
			System.out.println("c1 and c2 are same instance");
		}
		
		/*Thread t1 = new Thread(new TheadTest());
		Thread t2 = new Thread(new TheadTest());
		
		t1.start();
		
		t2.start();*/
		
	}

}
