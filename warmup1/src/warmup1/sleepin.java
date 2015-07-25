package warmup1;

public class sleepin {
static Boolean weekday;
	static Boolean vacation;
	public static void main(String[] args) {
		sleep();
	}
	public static Boolean sleep(){
		if (!weekday) {
			return true;
		}
		if (vacation) {
			return true;
			}
			else {
				return false;
			}
			
		}
	}
	
	

