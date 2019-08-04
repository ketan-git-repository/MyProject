import java.util.ArrayList;
import java.util.List;

public class SortingClass {
	
	public static void main(String args[]){
		
		int arr[] = {-5,-3,1,2,6,9};
		int negativeArray[] = new int[2];
		int positiveArray[] = new int[4];
		int swap[] = new int[1];
		int[] finalArry = new int[6];
		
		
		
		int negCounter = 0;
		int posCounter = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] < 0){
				negativeArray[negCounter] = arr[i];
				negCounter++;
				/*finalArry[counter] = (-1)*(arr[i]);
				counter++;*/
			}
			else{
				positiveArray[posCounter] = (arr[i]);
				posCounter++;
			}	
		}
		
		for(int k = 0 ;k<arr.length ; k++){
			System.out.println(finalArry[k]);
		}
		
		System.out.println("*****************");
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1 ; j < arr.length ;j++)
			if(finalArry[i] > finalArry[j]){
				swap[0] = finalArry[j];
				finalArry[j] = finalArry[i];
				finalArry[i] = swap[0];
				
			}
			
			System.out.println("swapped "+ i +"  "+finalArry[i]);
		}
		
		for(int k = 0 ;k<arr.length ; k++){
			System.out.println(finalArry[k]);
		}
		
	}

}
