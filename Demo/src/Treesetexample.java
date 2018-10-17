import java.util.HashSet;
import java.util.Iterator;

public class Treesetexample {
	public static void main(String args[]) {

		HashSet<String> set = new HashSet<>();
		set.add("prasad");
		set.add("harsha");
		set.add("sourish");
		set.add("harsha");
			Iterator itr=set.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
	
		}
		
			
	}

}
