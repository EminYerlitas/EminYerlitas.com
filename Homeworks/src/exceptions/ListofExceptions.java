package exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
public class ListofExceptions {
	public static void main(String[] args) {	
		String path="Java";
		String filePath=System.getProperty("user.dir")+"\\test.data\\Homework.xlsx";
		int a=10;
		int b=0;
	   System.out.println(exceptions(path,filePath, a, b));		
	}
	static ArrayList<String>exceptions(String path,String filePath, int a, int b) {
		ArrayList<String>list=new ArrayList<>();		
		try {
			FileInputStream fis=new FileInputStream(path);		
		}
		catch(FileNotFoundException fnfe) {
			list.add("FileNotFoundException: "+fnfe.getMessage());
		}
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException ae) {
			list.add("ArithmeticException: "+ae.getMessage());
		}
		try {
		    path.charAt(a);
		}
		catch(IndexOutOfBoundsException ioobe) {
			list.add("IndexOutOfBoundsException: "+ioobe.getMessage());
		}
		try {
			FileInputStream fis=new FileInputStream(filePath);
			fis.close();
			Properties prop=new Properties();
			prop.load(fis);
		}
			catch(IOException ioe) {
				list.add("IOException: "+ioe.getMessage());
			}		
		return list;			
	}

}
