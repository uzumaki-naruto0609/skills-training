/**
 * 
 */
package executable;

import java.util.Scanner;

import library.Directory;

/**
 * @author Hung
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create scanner instance object to get input
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the path: ");
		String path = reader.nextLine();

		// Close scanner instance object when read input completely
		reader.close();

		// Create new instance of Directory object
		Directory dir = new Directory();

		System.out.println("VERIFY PATH: "+path);

		if (dir.isDirExist(path)) {	
			
			System.out.println("PATH: " + "\"" + path + "\"" + " is already exists");
		}
		else {
			int numberOfCreated = dir.createDirectory(path);
			if (numberOfCreated == -1) {
				System.out.println("PATH: " + "\"" + path + "\"" + " is invalid");
			} else {
				System.out.println("PATH: " + "\"" + path + "\"" + " is created.\nCreated times: " + numberOfCreated);
			}

		}

	}

}
