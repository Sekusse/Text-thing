public class WordLib {
	public static String pmove="";
	public static String paction="";
	public static String [] move_action= {"Go","Move","Head"};
	public static String [] move_fwd= {"Forward","North","Ahead"};
 	public static String [] move_back= {"Back","Backward","South"};
 	public static String [] move_left= {"Left","West"};
 	public static String [] move_right= {"Right","East"}; 
 	
	
	public static boolean MoveForw(String i) {
		String [] parts=i.split(" ");
		for(int j=0;j<move_action.length;j++) {
			if(parts[0].equals(move_action[j])) {
				for(int o=0;o<move_fwd.length;o++) {
					if(parts[1].equals(move_fwd[o])) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static boolean MoveBack(String i) {
		String [] parts=i.split(" ");
		for(int j=0;j<move_action.length;j++) {
			if(parts[0].equals(move_action[j])) {
				for(int o=0;o<move_back.length;o++) {
					if(parts[1].equals(move_back[o])) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static boolean MoveLeft(String i) {
		String [] parts=i.split(" ");
		for(int j=0;j<move_action.length;j++) {
			if(parts[0].equals(move_action[j])) {
				for(int o=0;o<move_left.length;o++) {
					if(parts[1].equals(move_left[o])) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static boolean MoveRight(String i) {
		String [] parts=i.split(" ");
		for(int j=0;j<move_action.length;j++) {
			if(parts[0].equals(move_action[j])) {
				for(int o=0;o<move_right.length;o++) {
					if(parts[1].equals(move_right[o])) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
}
