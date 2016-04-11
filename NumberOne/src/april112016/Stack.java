package april112016;

public class Stack<T > {

	T[] data;
	private int tos;

	public void push(T item) throws StackOverflowException{
	if(tos==data.length){
		throw new StackOverflowException("Overflow exception. The size of the stack is:"+ data.length);
	}
		data[tos++]= item;
	} 
	T pop()throws StackUnderflowException{
	if(tos==0){
		throw new StackUnderflowException();
	}
	T tmp = data[--tos];
	data[tos]=null;
	
	return tmp;
}
public Stack(int maxSize){
	if (maxSize==0){
		throw new IllegalArgumentException();
	}
	data =(T[])new Object[maxSize];
}

}
