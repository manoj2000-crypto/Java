package tinyProject;

/*
 * Name: Manoj Kale 
 * Enrolment Number: EBEON0923804152
 * Date : 25-Oct-23
 * */

import java.io.File;
import java.util.Scanner;

public class CmdFileManager {
	
	private File currentDirectory; //count 1

    public CmdFileManager() 
    {
        currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void listFiles() 
    {
        File[] files = currentDirectory.listFiles();
        
        for (File file : files) 
        {
            System.out.println(file.getName());
        }
    }

    public void changeDirectory(String directoryName) 
    {
        File newDirectory = new File(currentDirectory, directoryName);
        
        if (newDirectory.exists() && newDirectory.isDirectory()) 
        {
            currentDirectory = newDirectory;
        }
        else 
        {
            System.out.println("Directory not found.");
        }
    }

    public void createDirectory(String directoryName) 
    {
        File newDirectory = new File(currentDirectory, directoryName);
        
        if (newDirectory.mkdir()) 
        {
            System.out.println("Directory created.");
        }
        else 
        {
            System.out.println("Failed to create directory.");
        }
    }
	
	public static void main(String[] args) {
		
		CmdFileManager fileManager = new CmdFileManager();
		
		Scanner scanner = new Scanner(System.in);

        while (true) 
        {
        	System.out.print("Enter the given commands : 1)List , 2)ChangeFolder, 3)MakeFolder, 4)Exit\n");
            System.out.print(fileManager.currentDirectory.getAbsolutePath() + " $ ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("List")) 
            {
                fileManager.listFiles();
            } 
            else if (command.equals("ChangeFolder") && parts.length > 1) 
            {
                fileManager.changeDirectory(parts[1]);
            } 
            else if (command.equals("MakeFolder") && parts.length > 1) 
            {
                fileManager.createDirectory(parts[1]);
            } 
            else if (command.equals("Exit")) 
            {
            	System.out.println("CMD File Manager is closed !");
                break;
            } 
            else 
            {
                System.out.println("Command is not recognized.");
            }
        }
        
        scanner.close();
		
	}

}
