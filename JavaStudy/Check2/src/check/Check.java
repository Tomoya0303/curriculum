package check;
import constants.Constants;

public class Check {
	private static String firstName = "小林" ;
	private static String lastName = "友哉";
	
	
	private static void printName(String f,String l){
	System.out.println("printNameメソッド → " + f + l );
	}
	
	public static void main(String[] args) {
	printName(firstName, lastName);
	
	
	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	pet.introduce();
	
	RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	robo.introduce();
	}
}