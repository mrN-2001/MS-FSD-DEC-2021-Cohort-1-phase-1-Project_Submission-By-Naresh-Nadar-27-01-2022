package myPackage;

import java.io.*;
import java.util.*;

public class LockedMe {

	public static final String FilePath="C:\\Users\\Naresh S Nadar\\eclipse-workspace\\LockedmeFiles";
	public static final String errormsg="Some error occured please contact admin";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch;
		
		Scanner sc1=new Scanner(System.in);
		do
		{
		  	Menu();
		  
		  	System.out.println("Enter your choice");
		  	
		  	ch=Integer.parseInt(sc1.nextLine());
		  	
		  	switch (ch) 
		  	{
			case 1:GetFiles();
			break;
			
			case 2:search();
			break;
			
			case 3:Add();
			break;
			
			case 4:Delete();
			break;
				
			case 5: System.exit(0);
			break;
			
			default:System.out.println("Invalid option");
			break;
		  	}	
			
				  	
		}
		while(ch>0);
				

	}
	
	public static void Menu() {
		System.out.println("*************************************");
		System.out.println("#       Welcome To LockedMe.com     #");
		System.out.println("#           Designed by             #");
		System.out.println("#             Naresh                #");
		System.out.println("*************************************");
		System.out.println("<><><><><><><><><><><><><><><><><><><");
		System.out.println("#        1] Display all files       #");    
		System.out.println("#        2] Search files            #");         
		System.out.println("#        3] Create files            #");
		System.out.println("#        4] Delete files            #");
		System.out.println("#        5] Exit                    #");
		System.out.println("<><><><><><><><><><><><><><><><><><><");
	}
	
	/**
	 * This method display all files inside folder
	 */
	public static void GetFiles() {
		
		
		try {
		
		File f=new File(FilePath);
		File[] listFiles = f.listFiles();
		
		if(listFiles.length==0) 
		{
			System.out.println("This folder doesn't have any files");
		}
			else 
			{
		for(File i:listFiles) 
		   {
			System.out.println(i.getName());
		   }
		    }
		}
	
		catch(Exception e)
		{
			System.out.println(errormsg);
			
		}
	
		
	}
	
	/**
	 * This method used to search files
	 */
	public  static void search() {
		
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter file name");
		
		String Filename=sc.nextLine();
		
		
		
		
		
		File f=new File(FilePath+"\\"+Filename);
		
		if(f.exists()) {
			System.out.println("File exist");
		}
		else{
			System.out.println("File doesn't exist");
			
		}
	
	
	
	
	
}
	/**
	 * This method will help you delete file
	 */
	public static void Delete() 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter File name");
		
		String fileName=sc.nextLine(); 
		
		try
		{
			
			File f=new File("C:\\Users\\Naresh S Nadar\\eclipse-workspace\\LockedmeFiles\\"+fileName);
			
			if(f.exists()) 
			{
				f.delete();
				System.out.println(fileName+" deleted Successfully");
			}

			else{
				System.out.println("File doesn't exist");
				}
			}
		
		catch(Exception e) 
		{
			System.out.println(errormsg);
		}
	}
	public static void Add()  {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1] Create empty file ");
		
		System.out.println("2] Create and  write on file ");
		
		int s=Integer.parseInt(sc.nextLine());
		
		try {
		if (s==1) 
		{
			
			System.out.println("Enter File name you want to create");
			
			String Filename=sc.nextLine();
			
				File f=new File(FilePath+"\\"+Filename);
				
				
				if(f.exists()) {
					System.out.println("File  already exists");
				}
				
				else
				{
					FileWriter fw=new FileWriter(f);
					fw.write("");
					
					System.out.println("File created successfully");
					fw.close();
				}
			
		  	
		}
		
		else if(s==2)
		{
		   System.out.println("Enter File name");
		  
		   String FileName=sc.nextLine();
		   
		   File f=new File(FilePath+"\\"+FileName);
		   
		   if(f.exists()) {
		
		   System.out.println("File already exist");
		   }
		   else
		   {
			   System.out.println("Enter how may lines you want to write");
			   
			   int count =Integer.parseInt(sc.nextLine());	
			   
			   
			   
			   FileWriter fw1=new FileWriter(FilePath+"\\"+FileName,true);
			   
			   
			   
			   for(int i=1;i<=count;i++)
			   {
				System.out.println("Enter line "+i);
				
				fw1.write(sc.nextLine()+"\n");
				
				
		   }
			   System.out.println("File written successfully");
			   fw1.close();
		   }  
		}
		}
		
		catch(Exception e)
		{
		  System.out.println(errormsg);	
		}
		
		
	}
	
}
