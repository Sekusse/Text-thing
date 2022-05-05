import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	static Scanner scan= new Scanner (System.in);
	// Things to do:
	//Here all items will be stored
	//Weapons (adds bouns damage,silver/magical will do dame to ghosts)
	// Armor (Includes: Helm and Suit(adds AC), Magical Pendents and rings(Adds buffs and can boost stats)
	// Support items(Food,potions,Arrows(if Bows are implamented),one use tricks / spells)
	//Key / Unique items(special objects,keys,quest items,)
	public static String itmuse;
	public static int acadd;
	public static int atkbonus;
	
	public static ArrayList<String> Weapons_name= new ArrayList<String>();
	public static ArrayList<Integer> Weapons_atk= new ArrayList<Integer>();
	public static ArrayList<String>Armor_name=new ArrayList<String>();
	public static ArrayList<Integer> Armor_ac= new ArrayList<Integer>();
	public static ArrayList<String> Items_name= new ArrayList<String>();
	public static ArrayList<Integer> Items_amt=new ArrayList<Integer>();
	public static ArrayList<String> Key_items_name= new ArrayList<String>();
	
	public static void Display_Inv() {//Could be used with text but think on it
		for(int i=0;i<Weapons_name.size();i++) {
			System.out.println("| "+Weapons_name.get(i)+": "+"+"+Weapons_atk.get(i)+  " atk" +" |");
		}
		for(int i=0;i<Armor_name.size();i++) {
			System.out.println("! "+Armor_name.get(i)+": "+"+"+Armor_ac.get(i)+  " ac" +" !");
		}
		for(int i=0;i<Items_name.size();i++) {
			System.out.println("? "+Items_name.get(i)+": "+Items_amt.get(i)+" ?");
		}
		for(int i=0;i<Key_items_name.size();i++) {
			System.out.println("% "+Key_items_name.get(i)+" %");
		}
	}
	
	
	//Here:add Item metodes to add Items and checker so dubs will not happen
	public static void addWeapon(String i,int j) {
		Weapons_name.add(i);
		Weapons_atk.add(j);
	}
	public static void addArmor(String i,int j) {
		Armor_name.add(i);
		Armor_ac.add(j);
	}
	public static void addItem(String i,int j) {
		for(int o=0;0<Items_name.size();o++) {
			if(i.equals(Items_name.get(o))) {
				Items_amt.set(o,j+Items_amt.get(o));
				return;
			}
		}	
		Items_name.add(i);
		Items_amt.add(j);
	}
	public static void addWeapon(String i/*,int j*/) {
		Key_items_name.add(i);
		//Weapons_atk.add(j);
	}
	public static void useInv() {//called by the term OPEN inventory
		Inventory.Display_Inv();
		itmuse=scan.nextLine();
		
		if(itmuse.substring(0,5).equals("Equip")) {
			
			for(int i=0;i<Armor_name.size();i++) {
				if(itmuse.substring(6,itmuse.length()).equals(Armor_name.get(i))) {
					for(int j=0;i<Armor_name.size();i++) {
						if(Armor_name.get(j).substring(Armor_name.get(j).length()-3,Armor_name.get(j).length()).equals("(e)") ) {
							Armor_name.set(j,Armor_name.get(j).substring(0,Armor_name.get(j).length()-3));
						}
					}
					Armor_name.set(i,Armor_name.get(i)+" (e)");
					charater_stats.set_p_ac(Armor_ac.get(i));
				}
			}
			for(int i=0;i<=Weapons_name.size()-1;i++) {
				if(itmuse.substring(6,itmuse.length()).equals(Weapons_name.get(i))) {
					for(int j=0;j<Weapons_name.size();j++) {
						if(Weapons_name.get(j).substring(Weapons_name.get(j).length()-3,Weapons_name.get(j).length()).equals("(e)") ) {
							Weapons_name.set(j,Weapons_name.get(j).substring(0,Weapons_name.get(j).length()-3));
						}
					}
					Weapons_name.set(i,Weapons_name.get(i)+" (e)");
					charater_stats.setdambus(Weapons_atk.get(i));
				}
			}
		}
		if(itmuse.substring(0,3).equals("Use")) {
			for(int i=0;i<Items_name.size();i++) {
				if(itmuse.substring(4,itmuse.length()).equals(Items_name.get(i))/*add other cheacker so to cheak if item is a consumable one*/) {
					// add healing value / other things but not right now
				}
			}
		}
		if(itmuse.substring(0,5).equals("Throw")) {
			for (int i=0;i<Items_name.size();i++) {
				if(itmuse.substring(6,itmuse.length()).equals(Items_name.get(i))&&Items_amt.get(i)>0) {
					Items_amt.set(i,Items_amt.get(i)-1);
					System.out.println("You threw a(n) "+ itmuse.substring(6,itmuse.length())+"." );
					
				}
			}
		}
	}
}