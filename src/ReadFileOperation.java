import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ReadFileOperation {

	public static void main(String[] args) {
		ArrayList list =  new ArrayList<ObjectValue>();
		Map<String,ObjectValue> map = new HashMap<String,ObjectValue>();
		try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/kebhardwaj/Documents/test.txt"))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
			//	System.out.println(sCurrentLine);
				ObjectValue objval = new ObjectValue();
				String[] arr = sCurrentLine.split(",");
				String name = null;
				for(int i= 0; i<arr.length; i++){
					 name = arr[0];
					objval.setAge(Integer.parseInt(arr[1]));
					objval.setDesignation(arr[2]);
				}
				map.put(name,objval);
			}
			list.addAll(map.values());
			
			Collections.sort(list,new CompartorByAge() );
		//	System.out.println(list);
			Collections.sort(list,new ComparatorByName() );
			System.out.println(list);
			
		/*Scanner sc = new Scanner(System.in);
		String getName = sc.nextLine();
		
		System.out.println(map.get(getName).age);
		System.out.println(map.get(getName).designation);*/
			
			
			
			Set<String> set = map.keySet();
			TreeSet<String> tree = new TreeSet<>(set);
			for(String s1:tree)
				System.out.println(s1);
			Map<String,String> map1 = new HashMap<>();
			
			
			
			Set<Map.Entry<String, ObjectValue>> set1 = map.entrySet();
			//TreeSet<String,ObjectValue> tree1 = new TreeSet<>(set1);
			
			
			for(Map.Entry<String,ObjectValue> ent : set1){
				//System.out.println(ent.getKey());
				//System.out.println(ent.getValue());
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
