package singleton.pattern.demo;

public class MakeACaptain2 {

	//Eager initialization 
	//Early initialization, object is always instantiated 
	private static MakeACaptain2 _captain = new MakeACaptain2();
	//we make the constructor private to prevent the use of "new"
	
	private MakeACaptain2() {}
	
	//Global point of access 
	public static  MakeACaptain2 getCaptain() {
		return _captain;
	}
	
	
	
}
