package joke2;

public class MyList<T> {
	private class Node {

		T data;
		Node next;
		Node previous;

	}

	Node first;
	Node current;
	public int count = 0;

	public void add(T data) {
		Node node = new Node();
		node.data = data;
		node.previous = current;
		;
		current = node;
		if (count == 0) {
			first = node;
			;
		} else {
			node.previous.next = current;
		}
	count++;
	}
@Override
public String toString() {
String s ="[";
Node temp = first;
while (temp != null) {
	s = s + temp.data;
	s+= " ,";
	temp = temp.next;
}
s+="]";
return s;

}

}
