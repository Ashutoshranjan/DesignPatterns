package singleton.pattern.demo;

public class MakeACaptain3 {

	private static MakeACaptain3 _captain;
	
	private MakeACaptain3() {}
	
	//Best solution
	//Bill Pugh solution
	//using inner class
	private static class SingletonHelper{
		//Nested class is referenced after getCaptain() is called
		private static final MakeACaptain3 _captain = new MakeACaptain3();
		
	}
	
	public static MakeACaptain3 getCaptain() {
		return SingletonHelper._captain;
	}
	
}
