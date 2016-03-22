package joke2;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
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
	public boolean isEmpty(){
		return count == 0;
	}
	public T top(){
		if (isEmpty() ==true){
			return null;
		}
		return current.data;
	}
	public T pop(){
		if(isEmpty()==true){
			return null;
		}
		Node temp = current;
		current.previous.next = null;
		current =current.previous;
		return temp.data;
		
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
@Override
public Iterator<T> iterator() {
	return new Iterator<T>() {
	 Node	current = first;

	 @Override
	 public boolean hasNext() {
	 	return current !=null;
	 }
	 @Override
	 public T next() {
	 	T data = current.data;
	 	current = current.next;
	 	return data;
	 }
	 @Override
	 public void remove() {}

	};
	
}

}
