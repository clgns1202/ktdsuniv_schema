package common.util;

public class StringUtil {

	public static Enum BEHAVIOR_LEFT, BEHAVIOR_RIGHT;
	
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
	
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	public static String replaceNullToBlank(String str) {
		return str == null ? "" : str;
	}
	
	public static String fillLeftString(String str, String fillString, int length) {
		return fillString(str, fillString, length, BEHAVIOR_LEFT);
	}
	
	public static String fillRightString(String str, String fillString, int length) {
		return fillString(str, fillString, length, BEHAVIOR_RIGHT);
	}
	
	private static String fillString(String str, String fillString, int length, Enum behavior) {
		str = replaceNullToBlank(str);
		
		if ( str.length() == length  ) {
			return str;
		}
		else {
			int fillLength = length - str.length();
			String tempString = "";
			for (int i = 0; i < fillLength; i++) {
				tempString += fillString;
			}
			
			if(behavior == BEHAVIOR_LEFT) {
				str = tempString + str;
			}
			else if(behavior == BEHAVIOR_RIGHT) {
				str = str + tempString;
			}
			return str;
		}
	}
	
}
