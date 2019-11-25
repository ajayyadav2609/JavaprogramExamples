package StringDemoexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("C:\\Users\\Ajay\\Desktop\\javawrite.txt");
		
		//BufferWriter bw=new BufferWriter(fw);
		fw.write("Do Not go to infosys. ");
		fw.write("It fake");
		System.out.println("Finished");
		fw.close();

	}

}
