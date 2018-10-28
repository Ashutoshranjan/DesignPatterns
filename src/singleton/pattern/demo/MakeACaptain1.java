package singleton.pattern.demo;

public class MakeACaptain1 {
private static MakeACaptain1 _captain;

	private MakeACaptain1() {
	}
	
public static synchronized MakeACaptain1 getCaptain() {
	//Lazy initialization and thread safe.
			if(_captain == null) {
				_captain = new MakeACaptain1();
				System.out.println("New Captain selected for our team");
			}
			else
			{
				  System.out.print("You already have a Captain for your team."); 
				  System.out.println("Send him for the toss.");
			}
			return _captain;
	
}


}
