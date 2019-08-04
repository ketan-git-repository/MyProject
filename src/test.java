public class test{
	public static void main(String args[]){
		
		
		test tes = new test();
		String str = tes.reverse("APPLE");
		System.out.println(str);
	}
		
	public String reverse(String word){
	    char ch[] = word.toCharArray();
	    String str = String.valueOf(ch); 
	    String newString = "";
	    StringBuffer sb =  new StringBuffer();
	    char printCharacter ;
	    boolean flag = true;
	    int count = 1;
	    int len = word.length();
	    for(int i = len-1; i> 0 ;i --){
	        printCharacter = ch[i];
	        if(count <= 2){
	            count++;
	            newString = String.valueOf(printCharacter); 
	            sb.append(newString);
	            System.out.println("print string "+sb);
	        }
	            
	        }
		return sb.toString();
	    }
		
}