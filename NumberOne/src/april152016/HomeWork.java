package april152016;

import java.util.Random;

public class HomeWork {

	public static void main(String[] args) {
		
		System.out.println("start");
		long start1 = System.nanoTime();
		double[][] matrix = generate();
		long finish = System.nanoTime();
		System.out.println(matrix[1][3]);
		System.out.println("Matrix generated elapsed time:" + (finish-start1));
		
		long start = System.nanoTime();
		process(matrix);
		long stop = System.nanoTime();
		
		System.out.println("Elapsed = " + (stop - start));
		
	}

	private static void process(double[][] matrix) {
		
		Thread[] threads = new Thread[matrix.length];
		
		for (int i = 0; i < matrix.length; i++) {
			final double[] row = matrix[i];
			threads[i] = new Thread() {
				@Override
				public void run() {
					processRow(row);
				};
			};
			threads[i].start();
		}
		
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static void processRow(double[] ds) {
		for (int i = 0; i < ds.length; i++) {
			Math.pow(ds[i], ds[i]);
			
		}
	}

	private static double[][] generate() {
		final double[][] matrix = new double[10][100_000];
		 
		Thread[] threads=new Thread[matrix.length];
		for(int i = 0; i < matrix.length; i++){
			final int n = i;
		threads [i]=new Thread(){
		 
			public void run() {
			 matrix[n] = generateRow();
			 System.out.println(Thread.currentThread());
			}

			private double[] generateRow() {
				Random random = new Random();
				double[]row = new double[100_000] ;
				for(int i = 0 ; i<100_000;i++){
					row[i] = random.nextDouble();
				}
				return row;
				
			}
		};
		
		threads[i].start();
		

		
	}
for(Thread thread:threads){
	try {
		thread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
		return matrix;
		
		
	}
	
	
}