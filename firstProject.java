import java.io.BufferedReader;
import java.io.*;

public class firstProject extends Thread{ 
	public static void main(String[] args) throws Exception {
		new firstProject().start();
		File file = new File("C:\\picture");
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				 BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(files[i])));
				 String line ="";
				 String str = null;
			        while ((str = in.readLine()) != null) {
			           line += str+"\n";
			        }
			        System.out.println(line);
			        Thread.sleep(60);
			        line = "";
			        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			        in.close();
			}
	} 
}
