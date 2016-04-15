package april112016;

public class Threads {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		new Thread(){
			public void run() 
			{System.out.println("running");
			System.out.println(Thread.currentThread());
			for(StackTraceElement el :currentThread().getStackTrace()){
				System.out.println(el.getMethodName()+" " + el.getLineNumber()+ " " + el.getClassName());}
			}
		}.start();
		System.out.println("back to main");
	}

}
