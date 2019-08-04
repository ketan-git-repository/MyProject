import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparetorImplementation {
	
	public static void main(String args[]){
		
		List<Integer> list = new ArrayList<>();
		list.add(120);
		list.add(222);
		list.add(321);
		list.add(943);
		list.add(466);
		list.add(765);
		
		
		
		Comparator<Integer> c = new Comparator<Integer>(){

			public int compare(Integer i, Integer j) {
				return i%10 > j%10 ? 1:-1; 
				
			}
		};
			
		Collections.sort(list,c);
		
		//Collections.sort(list,(i,j)->i%10>j%10 ? 1:-1);
		
		
		

		for(Integer i : list){
			System.out.println(i);
		}
		
	}

}

