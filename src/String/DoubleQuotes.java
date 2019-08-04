package String;

import java.util.StringTokenizer;

public class DoubleQuotes {
	
	public static void main(String args[]){
		
		
		String a = "ketan";
		String an = new String ("ketan");
		String am = new String ("ketan");
		
		char ch[] = {'a','n'};
		char ch1[] = {'a','n'};
		
		
		
		System.out.println(ch[0]==ch1[0]);
		
		//System.out.println(a.equals(am));
		//System.out.println(an == am);
		
		/*String word = "Which one is better, StringTokenizer vs Split?";
		StringTokenizer tokenizer = new StringTokenizer(word);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }*/
        
        
        /*String msg = "http://192.173.15.36:8084/";
        StringTokenizer st = new StringTokenizer(msg, ".");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }*/
		
		
		String records = "one,two,three,four,five,six,seven";
        StringTokenizer breaker = new StringTokenizer(records, ",");
      //  System.out.println("Total number of tokens : " + breaker.countTokens());
	}

}
