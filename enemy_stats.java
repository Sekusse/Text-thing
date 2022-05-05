
public class enemy_stats {
	public static String name;
	public static String desc;
	//Atk_type determins how enemy attacks:C for close range/R for ranged(non-magic)/M for magic(ranged and buffs)
	public static String atk_type;
	public static int em_hp;
	public static int ec_hp;
	//public static int c_lvl;
	public static int e_ac;
	public static int ec_exp;
	
	public static String get_e_name() {
		return name;
	}
	public static String get_e_desc() {
		return desc;
	}

	// these are Enemy Stat
	
	public static int stat_e_str;
	public static int stat_e_dex;
	public static int stat_e_lck;
	public static int stat_e_int;
	public static int stat_e_vit;
	public static int stat_e_fai;
	
	public static String get_atk_type() {
		return atk_type;
	}
	public static int get_e_Str() {
		return stat_e_str;
	}
	public static int get_e_Dex() {
		return stat_e_dex;
	}
	public static int get_ec_hp() {
		return ec_hp;
	}
	public static void set_ec_hp(int i) {
		 ec_hp=i;
	}
	public static int get_e_ac() {
		return e_ac;
	}
	public static int get_e_exp() {
		return ec_exp;
	}
	
	public static void test_enemy(){
		name="Test Dummy";
		desc="SHOULD NOT BE IN FINAL GAME. ONLY TEST";
		em_hp=10;
		ec_hp=em_hp;
		ec_exp=1;
		e_ac=1;
		stat_e_str=1;
		stat_e_dex=1;
		stat_e_lck=1;
		stat_e_int=1;
		stat_e_vit=1;
		stat_e_fai=1;
		// add dropple loot: Gold
		
	}
	public static void Thug(){
		name="Thug";
		desc="A man armed little mare than a dull knife and some pants.";
		atk_type="C";
		em_hp=5;
		ec_hp=em_hp;
		ec_exp=25;
		e_ac=2;
		stat_e_str=2;
		stat_e_dex=3;
		stat_e_lck=1;
		stat_e_int=2;
		stat_e_vit=1;
		stat_e_fai=1;
		//Add dropple loot: Gold,Knife, and Small Food
	}
	public static void Wolf(){
		name="Wolf";
		desc="A cammon predetor, mainly found in cold wooded areas.";
		atk_type="C";
		em_hp=3;
		ec_hp=em_hp;
		ec_exp=20;
		e_ac=1;
		stat_e_str=3;
		stat_e_dex=3;
		stat_e_lck=1;
		stat_e_int=1;
		stat_e_vit=1;
		stat_e_fai=1;
		//add dropple loot: Wolf pelt,and Wolf meat
	}
	public static void Bear(){
		name="Bear";
		desc="A large predator that sleeps though winter,found near streams hunting fish";
		atk_type="C";
		em_hp=10;
		ec_hp=em_hp;
		ec_exp=50;
		e_ac=2;
		stat_e_str=5;
		stat_e_dex=1;
		stat_e_lck=1;
		stat_e_int=1;
		stat_e_vit=4;
		stat_e_fai=1;
		// add dropple loot Bear Pelt,Bear Meat, Honey
	}

}
