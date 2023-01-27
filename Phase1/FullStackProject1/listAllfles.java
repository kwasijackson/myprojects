package FullStackProject1;
import java.io.File;  
public class listAllfles {

	public void printFiles(File[] a, int i)  
	{ 
		if(i == a.length)  
		{  
		return;  
		}  
		if(a[i].isFile())  
		{  
		System.out.println(a[i].getName());  
		} 
		printFiles(a, i + 1);  
	}  	
	}
	

