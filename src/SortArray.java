import java.util.Arrays;

public class SortArray {
	
	public static void main(String args[]){
		
		int arr[] = {-8,6,4,-1,-5,9}; //6,4,-8
		int temp = 0;
		int temp1 = 0;
		int i = 0;
		int p = 0;
		
//		Arrays a2 = new Arrays
		 Arrays.sort(arr);
		 
		 System.out.println(arr.toString());
		 
			for(int k = 0 ; k< arr.length ; k++){
				System.out.println(i);
				if(arr[i] < 0){
					//System.out.println(" "+i+"   " +arr[i]);
					temp = (-1) * arr[i]; //8
				}
				else {
					//System.out.println(" "+i+"   " +arr[i]);
					temp  = arr[i];
				}
				if(arr[k] <  0){
					//System.out.println(" "+i+"   " +arr[i]);
					temp1 = (-1) * arr[k];
				}
				else{
					//System.out.println(" "+i+"   " +arr[i]);
					temp1 = arr[k]; //4
				}
				
				if(temp > temp1){
					temp = arr[i];
					
					arr[i] = arr[k];
					arr[k] = temp;
					i = i+1;
					
				}	
				/*if(i+1 <= (arr.length + 1)){
					i+=1;
					//System.out.println("i "+i);
					
				}
				*/
				
			}
		
		
		System.out.println("******************************");
		
		for(int l = 0 ;l < arr.length ;l++){
		System.out.println(arr[l]);
		}
	}

}
