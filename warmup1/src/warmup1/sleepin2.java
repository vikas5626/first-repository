package warmup1;

public class sleepin2 {
public static void main(String[] args) {
	sleepIn(false, false);
	}
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
		return true;
		} else {
		return false;
		}
		}
}

