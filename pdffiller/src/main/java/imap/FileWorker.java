package imap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWorker {
	static String zFile ;
	
	public FileWorker (String zFile) {
		this.zFile = zFile;
	}
	
	/*
	public static void main(String arg[]) throws IOException{
		ArrayList<String> list = scanToList(zFile);
		for(String e : list ){
		System.out.println(e);
		}
	}
	*/
	
	public FileWorker() {
		// TODO Auto-generated constructor stub
	}

	public static void write(String fileName, String text) {
	    //Определяем файл
	    File file = new File(fileName);
	 
	    try {
	        //проверяем, что если файл не существует то создаем его
	        if(!file.exists()){
	            file.createNewFile();
	        }
	 
	        //PrintWriter обеспечит возможности записи в файл
	        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
	 
	        try {
	            //Записываем текст у файл
	            out.print(text);
	        } finally {
	            //После чего мы должны закрыть файл
	            //Иначе файл не запишется
	            out.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	/**
	 * Добавляет строку в конец файла, без его перезаписи
	 * @param filename
	 * @param text
	 * @throws FileNotFoundException
	 */
	public static void printlnAppen(String filename, String text)  {
		PrintStream printStream;
		try {
			printStream = new PrintStream(new FileOutputStream(filename, true), true);
			printStream.println(text);
			printStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void update(String filePathOld, String text) throws IOException {
	try {
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filePathOld, true)));
	    out.println(text);
	    out.close();
	} catch (IOException e) {
	    //oh noes!
	}
	}
	
	public static void removeLine(String lineToRemove) {

	    try {

	      File inFile = new File(zFile);

	      if (!inFile.isFile()) {
	        System.out.println("Parameter is not an existing file");
	        return;
	      }
	      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

	      BufferedReader br = new BufferedReader(new FileReader(zFile));
	      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

	      String line = null;
	      while ((line = br.readLine()) != null) {

	        if (!line.trim().equals(lineToRemove)) {

	          pw.println(line);
	          pw.flush();
	        }
	      }
	      pw.close();
	      br.close();
	      if (!inFile.delete()) {
	        System.out.println("Could not delete file");
	        return;
	      }
	      if (!tempFile.renameTo(inFile))
	        System.out.println("Could not rename file");

	    }
	    catch (FileNotFoundException ex) {
	      ex.printStackTrace();
	    }
	    catch (IOException ex) {
	      ex.printStackTrace();
	    }
	  }
	
	public static ArrayList<String> scanToList() {
		Scanner s;
		ArrayList<String> list = null;
		try {
			s = new Scanner(new File(zFile));
		list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<String> scanToList(String filePath) {
		ArrayList<String> list = null;
		list = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	list.add(line);
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}
	
}
