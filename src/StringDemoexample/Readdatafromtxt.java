package StringDemoexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readdatafromtxt {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Ajay\\Desktop\\infosyslogin.txt");
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
			
		}
		
		
	}

}
