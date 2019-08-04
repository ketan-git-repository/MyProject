import java.util.HashSet;
import java.util.Set;

public class UnCommonString {

	public static void main(String args[]){
		String str1 = "ababcd";
		String str2 = "abcdef";
		System.out.println("uncommon string : " + getUncommonConcatString(str1, str2));
	}

	static String getUncommonConcatString(String str1, String str2) {
		Set<Character> mySet = new HashSet<>();
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		for (char c : charArray1) {
			mySet.add(c);
		}
		for (char c : charArray2) {
			if (mySet.contains(c)) {
				mySet.remove(c);
			} else
				mySet.add(c);
		}
		return mySet.toString();
		
		//MaxSumSubArray1
	}

}
