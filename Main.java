import java.util.Scanner;



public class Main {
	static Scanner scan= new Scanner(System.in);
	
	public static void main (String [] args) {		
		
		System.out.println("*****************");
		System.out.println("*               *");
		System.out.println("*    Working    *");
		System.out.println("*     Title     *");
		System.out.println("*               *");
		System.out.println("*               *");
		System.out.println("*****************");
		System.out.println("Join?        Y/N (Warning: Game is case sensitive)");
		String enter =scan.nextLine();
		
		
		String Stemp="Clothing (e)";
		int Itemp=0;
		Inventory.addArmor(Stemp,Itemp);
		
		Stemp="Fists (e)";
		Itemp=0;
		Inventory.addWeapon(Stemp,Itemp);
		
		charater_stats.create_charater();
		charater_stats.fina();
		charater_stats.display_chara();
		
		//Scene_Frest_Forest.FF();
		Scene_Grezil_Lands.GL();

		System.out.println("Test Complete");
		
		
	}
}
