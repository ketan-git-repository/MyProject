import java.util.Comparator;

public class ComparatorByName implements Comparator<ObjectValue> {

	public int compare(ObjectValue o1, ObjectValue o2) {

		if(o1.getDesignation() == o2.getDesignation())
			return 1;
		else return -1;
	}

}
