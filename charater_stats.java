import java.util.Scanner;

public class charater_stats {
	static Scanner scan= new Scanner (System.in);
	// charater stat p: player c:current m: max
	public static int pm_hp;
	public static int pc_hp;
	public static int c_lvl;
	//Armor stat: defence, removes damage
	public static int p_ac;
	public static int pc_exp;
	public static int pm_exp;
	
	public static int get_p_hp() {
		return pc_hp;
	}
	public static void set_p_hp(int i) {
		 pc_hp=i;
	}
	public static void set_p_ac(int i) {
		p_ac=2;
		p_ac=p_ac+i;
	}
	public static int get_p_ac() {
		return p_ac;
	}
	
	// these are charter stat and incresse after level up
	
	// Str is for strength manages melee damage output and skill checks of the same name
	public static int stat_str;
	// Dex is dextarity and manages the speed of a charter and accuracy plus skill checks
	public static int stat_dex;
	// Lck is luck and adds a chance of succes in actions
	public static int stat_lck;
	// Int is intelligence and manages checks of the same name(possible magic)
	public static int stat_int;
	// Vit is Vitality and manages the max health of player
	public static int stat_vit;
	// Fai is faith and manages checks of the same name, and add resistence to monsters (possible magic)
	public static int stat_fai;
	
	
	public static int get_p_Str() {
		return stat_str;
	}
	public static int get_p_Dex() {
		return stat_dex;
	}

	
	public static void create_charater() {
		stat_str=(int) (Math.random()*5+1)+2;
		stat_dex=(int) (Math.random()*3+1)+1;
		stat_lck=(int) (Math.random()*3+1);
		stat_int=(int) (Math.random()*5+1)+1;
		stat_vit=(int) (Math.random()*5+1);
		stat_fai=(int) (Math.random()*3+1+1);
	}
	public static void display_chara() {
		System.out.println("Strength:"+stat_str);
		System.out.println("Dextarity:"+stat_dex);
		System.out.println("Intelligence:"+stat_int);
		System.out.println("Luck:"+stat_lck);
		System.out.println("Faith:"+stat_fai);
		System.out.println("Vitality:"+stat_vit);
		System.out.println("Health:"+pc_hp);
	}
	
	
	public static void fina() {
		p_ac=2;
		pm_hp= (int)(stat_vit/2+5);
		pc_hp= pm_hp;
		pc_exp=0;
		pm_exp=100;
	}
	public static void lvl_up() {
		while(pc_exp>0) {
			System.out.println("You leveled up! Pick a stat to increase by 1: Str/Dex/Int/Lck/Fai/Vit");
			String lvl=scan.nextLine();
			if(lvl.equals("Str")) {
				stat_str=stat_str+1;
				pc_exp=0;
			}else if(lvl.equals("Dex")) {
				stat_dex=stat_dex+1;
				pc_exp=0;
			}else if(lvl.equals("Int")) {
				stat_int=stat_int+1;
				pc_exp=0;
			}else if(lvl.equals("Fai")) {
				stat_fai=stat_fai+1;
				pc_exp=0;
			}else if(lvl.equals("Vit")) {
				stat_vit=stat_vit+1;
				pc_exp=0;
			}else if(lvl.equals("Lck")) {
				stat_lck=stat_lck+1;
				pc_exp=0;
			}else {}
			}
		pc_hp=pm_hp;
		pm_exp=pm_exp+50;
	}
	public static void add_exp(int i) {
		pc_exp=i+pc_exp;
		if(pc_exp==pm_exp) {
			charater_stats.lvl_up();
		}
	}
	
	//////////
	
	public static int dambonus=0;
	
	public static void setdambus(int i) {
		dambonus=i;
	}
	public static int getdambus() {
		return dambonus;
	}
	
}
