package Sorting;

public class BubbleSort {

	public static void main(String args[]){
		int[] arr = {2,4,6,1,3,-1,-30,20,0};
		int[] sorted = sort(arr);
		for(int a:sorted){
			System.out.println(a);
		}
	}

	private static int[] sort(int[] arr) {
				
		int temp = 0;
		for(int i = 0;i<arr.length;i++)
			for(int j = i+1 ; j < arr.length;j++)
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		return arr;
	}
	
}
