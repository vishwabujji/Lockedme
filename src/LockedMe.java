import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.*;
public class LockedMe {

	public static void main(String [] args) throws IOException {
		List<File> c = new ArrayList <File>(); 
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int ch;
		int num1;
		System.out.println("LockedMe");
		
		System.out.println("Devoleped By Vishwanadh");
		
		System.out.println("Press Any number to Continue");
		num1 = sc.nextInt();
		String [] file = {"file3","file6","file2","file5"};
		Arrays.sort(file);
		System.out.println(Arrays.toString(file));
		
		do {
			System.out.println("1.Insert a File:");
			System.out.println("2.Display a File:");
			System.out.println("3.Search a File:");
			System.out.println("4.Delete a File:");
			System.out.println("5.Update a File:");
			System.out.println("Enter Your Choice:");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
			System.out.print("Enter Fileno:");
	        int fileno = sc.nextInt();
			System.out.print("Enter Filename:");
			String filename = sc1.nextLine();
			c.add(new File(fileno,filename));
			break;
			case 2:
				System.out.println("---------------------");
				Iterator<File> i = c.iterator();
				while(i.hasNext()) {
					File e = i.next();
					System.out.println(e);
				}
				System.out.println("----------------------");
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter Filenumber To Search:");
				 fileno = sc1.nextInt();
				System.out.println("---------------------");
				 i = c.iterator();
				while(i.hasNext()) {
					File e = i.next();
					if(e.getFileno() == fileno) {
					System.out.println(e);
					found = true;
				}
						
					}
				if(!found) {
					System.out.println("File Not Found");
				}
				System.out.println("---------------------");
				break;
			case 4:
				found = false;
				System.out.println("Enter Filenumber To Remove:");
			 fileno = sc1.nextInt();
				System.out.println("---------------------");
				 i = c.iterator();
				while(i.hasNext()) {
					File e = (File)i.next();
					if(e.getFileno() == fileno) {
					i.remove();
					found = true;
				}
						
					}
				if(!found) {
					System.out.println("File Not Found");
				}else {
				System.out.println("File is Deleted Successfully");	
				}
				System.out.println("---------------------");
				break;
			
		case 5:
			found = false;
			System.out.println("Enter Filenumber To Update:");
		 fileno = sc1.nextInt();
		 
			System.out.println("---------------------");
			ListIterator<File>li = c.listIterator();
			while(li.hasNext()) {
				File e = (File)li.next();
				if(e.getFileno() == fileno) {
					System.out.println("Enter File Name:");
					filename = sc2.nextLine();
					li.set(new File(fileno,filename));
					found = true;
				}
					
				}
			if(!found) {
				System.out.println("File Not Found");
			}else {
			System.out.println("File is Updated Successfully");	
			}
			System.out.println("---------------------");
			break;
			}
			 } while(ch!=0);
		
	
		
}
			
		}

	
	

    
	
	
	



