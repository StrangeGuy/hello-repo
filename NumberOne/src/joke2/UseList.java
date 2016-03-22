package joke2;

import java.util.Iterator;

public class UseList {

	public static void main(String[] args) {
		MyList<String> list = new MyList<String>(){{
			add("one");
			add("two");
			add("three");
		}};
		MyList<String> list1 = new MyList<String>();
		for (String item : list) {
			System.out.println(item);
		}
		Iterator<String> it= list.iterator();
while(it.hasNext()){
	String item = it.next();
	System.out.println(item);
}
Iterator<String> it1= list.iterator();
	System.out.println(it1.next());
	System.out.println(it1.next());
	Iterator<String> it2= list.iterator();
	System.out.println(it1.next());
	System.out.println(list.isEmpty());
	System.out.println(list.pop());
	System.out.println(list);
	list.add("three");
	System.out.println(list);
	list1.pop();
	
	}
	

}
