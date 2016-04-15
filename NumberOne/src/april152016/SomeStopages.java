package april152016;

public class SomeStopages {

	public static void main(String[] args) {
		Task task = new Task();
		Thread t  = new Thread(task);
		t.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		task.stopT();
		
		
		
	}
static class Task implements Runnable{

volatile private boolean stopped;
	@Override
	public void run() {
	System.out.println("Running! Yahoo-hooo");
		int i = 0;
		while(!stopped){
			i++;
		}
		System.out.println("Stopped! Count of operations is : "+i);
		
	}
	private void stopT() {
	stopped = true;

	}
	
}
}
