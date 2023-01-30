package FullStackProject1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientInterface {
	public static void displayMenu()
{
	System.out.println("= = = = = = = = = = LockedMe system = = = = = = = = =");
	System.out.println("= = = = = = This system digitize documents = = = = = = =");
	System.out.println("\n\nWelcome ADMIN\n\n");
	System.out.println("Student Name: Charles Jackon\n");
	System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = ");
	System.out.println("Choose one of the options");
	System.out.println("1. Display All Files in Current Directory");
	System.out.println("2. Perform File Operation");
	System.out.println("3. Exit the Application");
	}
	
	public static void displaySubMenu()
	{
		
		System.out.println("Choose one of the options");
		System.out.println("  ");
		System.out.println("1. Add a file to current directory");
		System.out.println("2. Enter a filename to be deleted");
		System.out.println("3. Search for a  File");
		System.out.println("4. Go to Main Menu");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in);
		listAllfles allfiles = new listAllfles();
		
	
		while(true) { // current context
			
			displayMenu();
			 try {
			 int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				
				String path = System.getProperty("user.dir");  
				// creating a file object  
				File fObj = new File(path); 
				  
				if(fObj.exists() && fObj.isDirectory())  
				{  
				// array for the files of the directory pointed by fObj  
				File a[] = fObj.listFiles(); 
				Arrays.sort(a);
				
				// display statements  
				System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");  
				System.out.println("Listing the Files in the directory : " + fObj);  
				System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");  
				// Calling the method  
				allfiles.printFiles(a, 0);  
				}  
				break;
			case 2:
				String filename;
				int newchoice=0;
				while (newchoice!=4)  {
					
				displaySubMenu();
				 newchoice = sc.nextInt();
				
				switch(newchoice) {
				case 1:
					System.out.println("Enter the file name");
					 filename = sc.next();
                    fileoperation.addFile(filename);
					break;
				case 2:
					System.out.println("Enter a filename to be deleted");
				    filename = sc.next();
				    fileoperation.deleteFile(filename);
				    break;
				case 3:
					//Searching for a given file name ignore case
					System.out.println("Enter a filename to be deleted");
					filename = sc.next();
					fileoperation.searchFile(filename);
					break;
			   case 4:
					//Going to the main menu
					break;
				default:
					System.out.println("Enter a number 1-4");
					
				}
					
				} break;
			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("Make a selection 1-3");
				break;
				

			}
		}
		catch(InputMismatchException | IOException e){
            System.out.println("An unexpected error happened. Please try again");
            sc.next();
          }

	   }
	}
	

}
