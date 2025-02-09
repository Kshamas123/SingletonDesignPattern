package challenge;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import packages.singleton;

public class Log {
     private static Log instance=null;
     private  Log()
     {
    	 
     }
     static synchronized Log getinstance()
     {
  	   if(instance==null)
  		   instance=new Log();
  	   return instance;
     }
     public synchronized void logMessage()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("\"enter the log level\"");
    	 String loglevel=sc.nextLine();
    	 System.out.println("\"enter the log message\"");
    	 String logmessage=sc.nextLine();
    	 try {
    		 File file = new File("log.txt");
             FileWriter writer = new FileWriter(file, true);
			String str="["+loglevel+"] :"+logmessage;
			writer.write(str);
			writer.close();
			 System.out.println("Log file created at: " + file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
}
