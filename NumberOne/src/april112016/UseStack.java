package april112016;

public class UseStack {

	public static void main(String[] args) {
		System.out.println("start");
		Stack<String> st = new Stack(2);
	try {
		st.push("hi");
	} catch (StackOverflowException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		st.push("hi");
	} catch (StackOverflowException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		st.push("hi");
	} catch (StackOverflowException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		st.pop();
	} catch (StackUnderflowException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println(	e.getLocalizedMessage());
	}
		System.out.println("finish");	
	}

}
