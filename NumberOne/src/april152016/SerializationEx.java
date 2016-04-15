package april152016;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.SingleSelectionModel;

public class SerializationEx {
	static class Whatever implements Serializable{
   static int number ;
   
		public Whatever() {
	System.out.println("New whatever");
	number++;
	
}
		private static final long serialVersionUID = 7741110489415242073L;
		private void check() {
			System.out.println("It's allright. The ID is " + number);

		}
		
	}

	public static void main(String[] args) {
		Whatever w1 = new Whatever();
		Whatever w2 = new Whatever();
		Whatever w3 = new Whatever();
		
			try {
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("whatever.ser"));
				os.writeObject(w3);
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			try {
				ObjectInputStream ois =new ObjectInputStream(new FileInputStream("whatever.ser"));
			w2 =(Whatever)ois.readObject();
			ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			w2.check();
			
		

	}

}
