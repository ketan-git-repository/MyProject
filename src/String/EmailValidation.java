package String;

public class EmailValidation {

	
	
	public static void main(String args[]){
	String vEmails = "kebhardwaj@deloitte.com,kumara@deloitte.com";
	
	if(vEmails != null && vEmails.length() >0){
		//String vEmails = pRs.getString("PARAM01");
		if(vEmails.contains(",")){
			String vEmailIDList [] = vEmails.split(",");
			for(int i =0; i< vEmailIDList.length;i++ ){
				String vEmail = vEmailIDList[i];
				System.out.println("email id : " +vEmail);
				if(vEmail.contains("@") && vEmail.contains(".") && !vEmail.contains(" ")){
					continue;
				}else{
					System.out.println("Invalid EmailId");
				}
			}
		}else{
			if(vEmails.contains("@") && vEmails.contains(".") && !vEmails.contains(" ")){
				System.out.println("Valid EmailId");
			}else{
				System.out.println("Invalid EmailId");
			}
		}
	}
	}
	
	
}
