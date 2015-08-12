import java.util.concurrent.*;

public class ConcurrentnavigableMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentNavigableMap<String, String> map = new ConcurrentSkipListMap<String, String>(); 
		 
		map.put("1", "one"); 
		map.put("2", "two"); 
		map.put("3", "three"); 
		 
		ConcurrentNavigableMap<String, String> headMap = map.headMap("2");
		
		for (int i = 0; i < headMap.size(); ++i) {
			System.out.println(headMap.get(headMap.lastKey()));
		}
	}

}
