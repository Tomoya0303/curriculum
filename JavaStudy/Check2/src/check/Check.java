package check;
import constants.Constants;
public class Check {
	private static String firstName = "小林";
	private static String lastName = "友哉";
	private static String  name = Constants.CHECK_CLASS_JAVA;
	private static String masterName = Constants.CHECK_CLASS_HOGE;
	
	private static void printName() {
	System.out.println("printNameメソッド → " + firstName + lastName);
	}
	public static void main(String[] args) {
	printName();
	
	Pet pet = new Pet(name,masterName);
	pet.introduce();
	
	name = Constants.CHECK_CLASS_R2D2;
	masterName = Constants.CHECK_CLASS_LUKE;
	RobotPet robo = new RobotPet(name,masterName);
	robo.introduce();
	}

}
