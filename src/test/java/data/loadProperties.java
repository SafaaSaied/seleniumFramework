package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class loadProperties {
	//load the properities(file) from the folder

	public static Properties userData=loadProperties(System.getProperty("user.dir")+"\\src\\main\\java\\properities\\userDataProperities");
	//public static Properties userData=loadProperties("F:\\Selenuim Workspace\\projectt\\src\\main\\java\\properities\\userDataProperities");

	//prop mn java.util

	private static Properties loadProperties(String path) {

		Properties pro= new Properties();

		//stream for reading elfile
		//w try w catch 3lshan lw m3rfsh y2ra mn elfile ytl3le error bdl ma y3ml break ll code

		try {
			FileInputStream stream=new FileInputStream(path);
			pro.load(stream); //keda b3ml load ll stream
		} catch (FileNotFoundException e) {
			System.out.println("Error occured " + e.getMessage()); //elecveption da 3lshan lw ml2ash elfile aslun
		} catch (IOException e) {
			System.out.println("Error occured " + e.getMessage()); //elexception da 3lshan lw geh y3ml reload(stream) ll file w m3rfsh 
		}

		catch (NullPointerException e) {
			System.out.println("Error occured " + e.getMessage()); //elexception da ll null pointer exception 3lshan my failsh y3ml el test case 
		}

		return pro;

	}




}
