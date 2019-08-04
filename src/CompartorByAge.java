import java.util.Comparator;

public class CompartorByAge implements Comparator<ObjectValue>{


	public int compare(ObjectValue o1, ObjectValue o2) {
		
		if(o1.getAge() == o2.getAge())
		return 0;
		else if(o1.getAge() > o2.getAge())
			return 1;
		else return -1;
	}
	
	

}
