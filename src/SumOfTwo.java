
public class SumOfTwo {
	
	public static void main(String args[]){
		int arr[] = {4,2,5,7,8,3,1,2,4};
		int temp = 0;
		for(int i = 0;i < arr.length ; i++){
			for(int j = i;j< arr.length ; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int max1 = arr[arr.length-1];
		int max2 = arr[arr.length-2];
		int max3 = arr[arr.length-3];
		
		System.out.println("max1 "+max1 +"\n" +"max2 "+max2+"\n"+max3 );
		
		for(int i = 0 ;i< arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
