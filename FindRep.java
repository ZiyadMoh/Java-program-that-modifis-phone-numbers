import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class FindRep {
	
	static String findRep(String  s) {
		String str = s;
		String repl = "\\+966";
		String replwith = "00966";
		
		Pattern p = Pattern.compile(repl);
		Matcher m = p.matcher(str);
		String modStr = m.replaceAll(replwith);		
		
		return modStr;
		
	}

	public static void main(String[] args) {
		String str = null;
		try {
			
			File file = new File("C:\\Users\\ziyad\\OneDrive\\Desktop\\KSU\\Comp\\input.txt");
			Scanner s = new Scanner(file);
			while(s.hasNextLine()) {
				str = s.nextLine();
				
				
				
			}
		}catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		String modS = findRep(str);
		try {
			FileWriter fw = new FileWriter("C:\\Users\\ziyad\\OneDrive\\Desktop\\KSU\\Comp\\input.txt");
			fw.write(modS);
			fw.close();
			System.out.println("File modified... ");
		}catch(IOException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
		
	}

}
