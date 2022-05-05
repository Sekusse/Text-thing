import java.util.Scanner;

public class Scene_Grezil_Lands {
	//After Frest Forest
	// Should lead to a village and possible other path
	// More wolf i guess
	// Can't go back into forest for now
	
	static Scanner scan = new Scanner(System.in);
	public static String P_Action;
	public static int P_Move;
	public static int Screen_lock;
	public static double P_extra; //For extra action in scenes that appear once only
	public static String item;
	public static int Iitem;
	
	public static void GL() {
		P_extra=0;
		if(P_extra>0 && P_extra!=1) {
			P_extra=1;
		}
		Screen_lock=1;
		P_Move=1;
		while(Screen_lock==1) {
			if(P_Move==1/*&&P_extra==1*/) {
				System.out.println("You walk out and reach a plain,hilly grazeland with small groups of trees dotted around");
				System.out.println("the trail you were following leads to road that in one direction paves left while the other direction paths right");
				P_Action=scan.nextLine();
				
				if(P_Action.equals("Stats")) {
					charater_stats.display_chara();
				}
				if(P_Action.equals("Look Inventory")) {
					System.out.println("You LOOK into your inventory:");
					Inventory.Display_Inv();
				}
				if(P_Action.equals("Use Inventory")) {
					System.out.println("You are using your inventory:");
					Inventory.useInv();
				}
				if(P_Action.equals("Look")) {
					System.out.println("You take a good look around the land.");
					System.out.println("The hills are dominaed by wild flowers and tall grass that sway in the light breze");
					System.out.println("THe air feels clean and cool and the sky is clear with few clouds in sight");
					P_Action=scan.nextLine();
				}
				if(WordLib.MoveRight(P_Action)) {
					P_Move=2;
				}
				if(WordLib.MoveLeft(P_Action)) {
					P_Move=3;
				}
				if(WordLib.MoveBack(P_Action)) {
					System.out.println("As you travel back to the forest, a loose arrow flies from the forest trees and strikes you in the head");
					System.out.println(GameOver.DS_1());
					System.exit(0);
					//Joke
				}
			}
			//////////////////////////////////////////////////////////////////////////////
			if(P_Move==2) {
				//Toward the village (Add Pragress to story)
				System.out.println("You travel right, The road is long anf starait. You notice lots of animal and carrige tracks but non of those one the road ");
				System.out.println("The around the road clear with rolling hills and bunches of flowers and tall grass.");
				System.out.println("Then Suddenly, you spot something in the distance but can't make out");
				P_Action=scan.nextLine();
				
				if(P_Action.equals("Look")&&P_extra==1) {
					System.out.println("You take some time to look and see that the objects in the distance is a small village");
					System.out.println("But before you can notice the other beuties for this area, a snarling growl is heard from the left ");
					System.out.println("You turn and see a charching wolf leap rightm in front of you");
					//Battle Engage
					enemy_stats.Wolf();
					Battle_system.battle_engage();
					P_extra=2;
					System.out.println("With the wolf lying dead, you take time to catch you breath");
					P_Action=scan.nextLine();
				}
				if(P_Action.equals("Look")) {
					System.out.println("There is a dead wolf lying in the middle of the road");
					System.out.println("The Village in front of you has not moved");
					System.out.println("Other than that, The are is crisp clear feeling in the area with one less wolf around");
					P_Action=scan.nextLine();
				}
				if(P_Action.equals("Stats")) {
					charater_stats.display_chara();
				}
				if(P_Action.equals("Look Inventory")) {
					System.out.println("You LOOK into your inventory:");
					Inventory.Display_Inv();
				}
				if(P_Action.equals("Use Inventory")) {
					System.out.println("You are using your inventory:");
					Inventory.useInv();
				}
				if(WordLib.MoveForw(P_Action)) {
					P_extra=3;
					P_Move=4;
				}
				if(WordLib.MoveBack(P_Action)) {
					P_extra=3;
					P_Move=1;//WIP Goe back to scene one but change scene one a bit
				}
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(P_Move==4) {
				//In village center or entrance?
				System.out.println("You enter the village near the a building with a tall tower.");
				System.out.println("You take a good around the village and see people doing there day to day activities.Your best guess is that this is a small farming town.");
				System.out.println("While you are looking around an old man chuckles under his breath and you turn toward him.");
				System.out.println("You notice they are sitting in a chair next to the entrence of the building with the tall tower.");
				System.out.println("The old man is staring at with a slight smile on his face.");
				P_Action=scan.nextLine();
				
				if(P_Action.equals("Look")) {
					
				}
				
			}
		}
	}
}
