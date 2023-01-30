package FullStackProject1;

import java.io.File;
import java.io.IOException;


public class fileoperation {
	
	public static void addFile(String fileName) {
		
	    
	    try {
		      File myObj = new File(fileName);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		        
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}
	
	public static void deleteFile(String fileName) throws IOException {
			    
	    File myObj = new File(fileName);
		  if (myObj.delete()) { 
		         System.out.println("Deleted the file: " + myObj.getName());
		      } else {
		        System.out.println("Failed to delete the file.");
		      }

	}
	
	public static void searchFile(String fileName) {
				
		File path = new File(System.getProperty("user.dir"));  

		
		String[] flist = path.list();
        int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
  
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equalsIgnoreCase(fileName)) {
                    System.out.println(filename + " found");
                    flag = 1;
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File Not Found");
        }
	}

	
}
