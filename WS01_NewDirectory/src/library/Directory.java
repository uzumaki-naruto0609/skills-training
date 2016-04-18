/**
 * 
 */
package library;

import java.io.File;
import java.util.regex.Pattern;

/**
 * @author Hung
 *
 */
public class Directory {

	public boolean isDirExist(String directoryPath) {

		boolean result = false;
		try {
			File file = new File(directoryPath);
			if (file.exists()) {
				result = true;
			} else {
				result = false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;

	}

	public int createDirectory(String fullPath) {

		String[] pathSection = fullPath.split(Pattern.quote("\\"));
		String currentPath = "";
		int numberOfCreate = 0;

		for (int i = 0; i < pathSection.length; i++) {

			if (currentPath.equals("")) {
				currentPath = pathSection[i];
			} else {
				currentPath = currentPath + "\\" + pathSection[i];
			}
			if (!isDirExist(currentPath)) {
				File dir = new File(currentPath);
				boolean isCreated = dir.mkdir();
				if (isCreated) {
					numberOfCreate = numberOfCreate + 1;
				}else{
					numberOfCreate = -1;
					break;
				}
			}
		}

		return numberOfCreate;
	}

}
