package joke2;

import java.util.LinkedList;
import java.util.List;

public class StringMap {

	static class Entry{
		String key;
		String value;
		public Entry(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
	}
	
	private static final int CAPACITY = 10;
	List<Entry>[] data;

	public StringMap() {
		data = new List[CAPACITY];
		for (int i = 0; i < data.length; i++) {
			data[i] = new LinkedList<>();
		}
	}

	public void put(String key, String value) {
		char c = key.charAt(0);
		int index = c % CAPACITY;
		data[index].add(new Entry(key,value));
	}

	public String get(String key) {
		char c = key.charAt(0);
		int index = c % CAPACITY;
		for (Entry entry : data[index]) {
		if(entry.key.equals(key))	{
			return entry.value;
		}
		}
	return null;	
	}

	public static void main(String[] args) {
		StringMap sm = new StringMap();
		sm.put("cat", "Murzik");
		sm.put("dog", "Rex");
		sm.put("pig", "Hryusha");
		System.out.println(sm.get("dog"));
		System.out.println(sm.get("cat"));
		System.out.println(sm.get("pig"));
		sm.put("dragon", "Smog");
		System.out.println(sm.get("dog"));
	}
}
