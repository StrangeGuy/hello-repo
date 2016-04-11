package april112016;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class YaRuGetter {

	public static void main(String[] args) {
		try(Socket soc = new Socket("ya.ru", 80)) {
		OutputStream ous =	 soc.getOutputStream();
			PrintWriter pw = new PrintWriter(ous);
			pw.println("GET / HTTP/1.0");
			pw.println();
			pw.flush();
			InputStream inputStream = soc.getInputStream();
			Scanner scn = new Scanner(inputStream);
			while(scn.hasNext()){
				System.out.println(scn.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
//TODO Auto-generated method setub