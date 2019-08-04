
public class ReverseArray {
	
	public static void main(String args[]){
		
		int a[] = {1,2,3,4,5,6};
		
		int size = a.length -1;
		int start = 0;
		int temp = 0;
		
		while(start < size){
			
			System.out.println("size :" +a[size]);
			
			temp = a[size]; 
			System.out.println("temp :" +temp);
			a[size] = a[start];
			System.out.println("size :" +a[size]);
			a[start] = temp;
			System.out.println("start :" +a[start]);
			
			start++;
			size --;
			
		}
		
		for(int ab: a)
		System.out.println(ab);
		
	}

}
