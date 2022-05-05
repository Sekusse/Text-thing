import java.util.Scanner;

public class Scene_Frest_Forest {
	//Game Starts in this area
	//This area has six screens
	static Scanner scan = new Scanner(System.in);
	public static String P_Action;
	public static int P_Move;
	public static int Screen_lock;
	public static double P_extra; //For extra action in scenes that appear once only
	public static String item;
	public static int Iitem;
	
		public static void FF() {
			if(P_extra==0) {
				P_extra=1;
			}
			Screen_lock=1;
			P_Move=1;
			while(Screen_lock==1) {
				if(P_Move==1&&P_extra==1) {	
					item= "Rock(s)";
					Iitem=5;
					Inventory.addItem(item,Iitem);
					System.out.println("You awake from a deep slumber with five stons andd claothing on your back, find yourself");
					System.out.println("in a forest. The forest is filled with rows of thick oak");
					System.out.println("trees that seem almost endless. You stand on what seems like a trail that points");
					System.out.println("North");
					String P_Action = scan.nextLine();
					
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
						System.out.println("You take a good look around your enviroment");
						System.out.println("A thin layer of leaves cover the floor bed only broken up by the ocational weed or mushroom");
						System.out.println("small amount of sbrubry and saplins gather around pokets of bright lidht");
						System.out.println("other than trees, nothing else strikes out as intersting");
						String for_path = scan.nextLine();
						P_Action=for_path;
					}
					if(WordLib.MoveForw(P_Action)&&P_extra==1) {
						P_Move=2;
						P_extra=2;
						
					}
					if(WordLib.MoveForw(P_Action)) {
						P_Move=2;
					}
				}else if(P_Move==1) {
					System.out.println("You walk but arive at a dead end ");
					System.out.println("in the forest. The forest is filled with rows of thick oak");
					System.out.println("trees that seem almost endless. You stand on what seems like a trail that points");
					System.out.println("North");
					String P_Action = scan.nextLine();
					
					
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
						System.out.println("You take a good look around your enviroment");
						System.out.println("A thin layer of leaves cover the floor bed only broken up by the ocational weed or mushroom");
						System.out.println("small amount of sbrubry and saplins gather around pokets of bright lidht");
						System.out.println("other than trees, nothing else strikes out as intersting");
						String for_path = scan.nextLine();
						P_Action=for_path;
					}
					if(WordLib.MoveForw(P_Action)&&P_extra==1) {
						P_Move=2;
						P_extra=2;
						
					}
					if(WordLib.MoveForw(P_Action)) {
						P_Move=2;
						P_extra=2;
					}
				}
			
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
			if(P_Move==2) {
				if(P_extra==2) {
					System.out.println("Oh no, Thug jumps out and Blocks your path");
					enemy_stats.Thug();
					Battle_system.battle_engage();
					P_extra=3;
				}
				
				System.out.println("The body of a nameless Thug lays still as a rock");
				//System.out.println("The forest is quiet and much of the secerny has not changed");
				System.out.println("You look forward and the path splits left and right with a sign pointing in either direction");
				System.out.println("There is no marker, but left is clearly used more");
				String P_Action=scan.nextLine();
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
					System.out.println("Trees still flank you from every side");
					System.out.println("Other than recently dead thug, nothing has changed");
					System.out.println("Though there is something off obout the right path, best to advoid it");
					String for_path=scan.nextLine();
					P_Action=for_path;
				}
				if(WordLib.MoveLeft(P_Action)) {
					P_Move=4;
					P_extra=3;
				}
				if(WordLib.MoveRight(P_Action)) {
					P_Move=3;
					P_extra=3;
				}
				if(WordLib.MoveBack(P_Action)) {
					P_Move=P_Move-1;
					P_extra=3;
				}
			}
				/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(P_Move==3) {
					System.out.println("Defining your own gut, you travel down the right path way.");
					System.out.println("You are stopped short by tangle of weeds and thrones ");//BOI
					System.out.println("Going around it or though it would be impossible");
					System.out.println("The only option is heading back");
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
						System.out.println("Nothing but thick bushes and thorns surround your and local forest");
						System.out.println("Visability though the brush is low and the trail non existant");
						System.out.println("You fear that if you wander from this are without turning back you might be lost forever");
						System.out.println("You ponder over area with no avil and nothing left but to turn back but something catches your eye");
						P_Action= scan.nextLine();
					}
					if(P_Action.equals("Pickup Item")||P_Action.equals("Investigate Item")) {
						System.out.println("You bend over to the Thing 'that caught your eye' and find a dead man entombe by the thorny vines");
						System.out.println("You try to pry him away from the vines but fail as if the vines claim the dead man for themselves");
						System.out.println("You thoughly search over him, but found nothing useful on him and his armor is in near taters making it useless");
						System.out.println("Leaving the man alone, you get one good look and suprise, A short sword in near perfect condition and place it in your pack");
						System.out.println("You Found A ShortSword");
						item="ShortSword";
						Iitem=2;
						Inventory.addWeapon(item,Iitem);
						P_Action=scan.nextLine();
					}
					if(WordLib.MoveBack(P_Action)) {
						P_Move=P_Move-1;
					}
				}
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				if(P_Move==4) {
					System.out.println("Heading left, you travel down the path hoping to find a way out"
							         + "of forest. Similer looking trees surround you as you walk making a uneasy"
							         + "feeling appear in your stomach. As almost if someone is watching you"
							         + "You stop to get your bearing about you");
					P_Action= scan.nextLine();
				    
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
						System.out.println("The air is still,yet you can't help to think that something is wrong."
								+ "You Camly look around but nothing out the ordany stands out");
						P_Action= scan.nextLine();
					}
					if(WordLib.MoveForw(P_Action)) {
						P_Move=5;
					}
					if(WordLib.MoveBack(P_Action)) {
						P_Move=P_Move-2;
					}
				}
				///////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(P_Move==5) {
					if(P_extra==3) {
						System.out.println("A wolf appears");
						enemy_stats.Wolf();
						Battle_system.battle_engage();
						P_extra=4;
					}
					System.out.println("The Wolf is dead. and so the forest goes quiet again."
							+ "Not even a bird can heard in the distance "
							+ "You think you are nearing the end of this forest.");
					P_Action= scan.nextLine();
					
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
						System.out.println("There is a dead wolf but nothing new to report");
						P_Action= scan.nextLine();
					}
					if(WordLib.MoveForw(P_Action)) {
						P_Move=6;
					}
					if(WordLib.MoveBack(P_Action)) {
						P_Move=P_Move-1;
					}
				}
				/////////////////////////////////////////////////////////////////////////////////////////////////////
				if(P_Move==6) {
					System.out.println("You make it to the edge of the forest and stare into a open clearing with one single path."
							+ "Looking no where else to go, you travel down the path in hopes you find something along the way");
					Screen_lock=0;
					//Return to main and boot up new scene
				}
			}
		}
	}
