import java.util.Scanner;

public class Battle_system {
	static Scanner scan= new Scanner(System.in);
	// p:player e"enemy
	public static int C_battle;
	public static String cb_choice;
	public static int atk;
	public static int dmg;
	
	//Future Plans:Status effects/Multiple enemies/Dropped loot/Inventory system/Flee system/Guard system/MAgic system/Random enemy choices
	
	
	public static void battle_engage() {
		System.out.println("You engaged a(n) "+enemy_stats.get_e_name()+"."+enemy_stats.get_e_desc());
		C_battle=1;
		 while(C_battle==1){
			System.out.println("You engaged a(n) "+enemy_stats.get_e_name()+".What do you do? Attack[A]/Inventory[I](not working)/Flee[F]");
			cb_choice=scan.nextLine();
		// Add in battle calculation for damage
				//Player turn
				if(cb_choice.equals("A")) {
					
					double tempatk= (Math.random()*(charater_stats.get_p_Str()+2)+(charater_stats.get_p_Str()-2)+charater_stats.getdambus());
					atk=(int)tempatk;
					atk = Math.max(atk,1 );
					atk=atk-enemy_stats.get_e_ac();
					atk=Math.max(atk,0);
					
					System.out.println("You did "+ atk+ " damage");
					//Current Enemy HP=Current Enemy-(atk-Enemy_AC)
					dmg=enemy_stats.get_ec_hp()-atk;
					enemy_stats.set_ec_hp(dmg);
					
				// other choices
				}else if(cb_choice.equals("Inventory")) {
					Inventory.useInv();
					//Create libary for item damage but later
					atk=2;
					System.out.println("You did "+ atk+ " damage");
					//Current Enemy HP=Current Enemy-(atk-Enemy_AC)
					dmg=enemy_stats.get_ec_hp()-atk;
					enemy_stats.set_ec_hp(dmg);
				}else if (cb_choice.equals("Flee")) {
					if(charater_stats.get_p_Dex()>enemy_stats.get_e_Dex()) {
						return;
					}else {
						System.out.println("You can not flee");
					}
					
				}else {
					
				}
				
				if(enemy_stats.get_ec_hp()<=0) {
					System.out.println("You Won the Battle.You have gained "+enemy_stats.get_e_exp()+" Exp.");
					charater_stats.add_exp(enemy_stats.get_e_exp());
					C_battle=0;
					return;
				}
				
				
				//Enemy Turn add in future if statements
				if(enemy_stats.get_atk_type().equals("C")) {
				double tempatk= (Math.random()*(enemy_stats.get_e_Str()+2)+(enemy_stats.get_e_Str()-2));
				atk=(int)tempatk;
				atk = Math.max(atk,1 );
				atk=atk-charater_stats.get_p_ac();
				atk=Math.max(atk,0);
				
				System.out.println("The enemy did "+atk+" damage");
				
				dmg=charater_stats.get_p_hp()-(atk);
				charater_stats.set_p_hp(dmg);
				}
				//Health CHecker
				if(charater_stats.get_p_hp()<=0) {
					System.out.println(GameOver.DS_1());
					System.exit(0);
				}
				
		}
		//Add if statement to check for level up
		//return to area
		 return;
	}

}
