package com.gmail.ichglauben.filenameextractor.core.utils.concretes;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**	
 * Use this class to validate the existence of a file (or directory). This class provides 3 separate methods to
 * validate a directory, file or a file path exists. Also this class contains all static members and a private constructor.
 * This class can also be assigned to a variable by way of the getInstance method.
 *	@see java.nio.file.Files
 *	@see java.nio.file.Path
 *	@see java.nio.file.Paths
 *	@author	Rick Walker
 *	@version 0.1
 *	@since 5/8/2016
*/
public class PathValidator {
	/**Use this method to validate a path.
	 * @param filePath The path to the file or directory
	 * @return boolean True if the path exists, false if otherwise*/
	public static boolean pathExists(String filePath) {
		Path path = null;
		if (null != filePath) {
			if (null != (path = Paths.get(filePath))) {
				return (isADirectory(path.toAbsolutePath().toString()) || isAFile(path.toAbsolutePath().toString()));
			}
		}
		return false;
	}
	

	/**Use this method to validate a a directory.
	 * @param filePath The path to the directory
	 * @return boolean True if the path exists, false if otherwise*/
	public static boolean isADirectory(String filePath) {
		Path path = null;
		if (null != filePath) {
			if (null != (path = Paths.get(filePath))) {
				return (path.toFile().exists() && path.toFile().isDirectory() && Files.isWritable(path));
			}
		}
		return false;
	}
	

	/**Use this method to validate a file.
	 * @param filePath The path to the file
	 * @return boolean True if the path exists, false if otherwise*/
	public static boolean isAFile(String filePath) {
		Path path = null;
		if (null != filePath) {
			if (null != (path = Paths.get(filePath))) {
				return (path.toFile().exists() && path.toFile().isFile());
			}
		}
		return false;
	}
	
	/**Single private constructor*/
	private PathValidator() {}
	
	public String toString() { return "Path (Directory or File) Validator"; }
}
