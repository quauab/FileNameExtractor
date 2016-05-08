package com.gmail.ichglauben.filenameextractor.core.concretes;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.gmail.ichglauben.filenameextractor.core.utils.concretes.PathValidator;
/**	
 * This class extracts the name portion of a file path, without it's extension.
 *	@see com.gmail.ichglauben.core.utils.concretes.PathValidator
 *	@see java.io.File
 *	@see java.nio.file.Path
 *	@see java.nio.file.Paths
 *	@author	Rick Walker
 *	@version 0.1
 *	@since 5/8/2016
*/
public class FileNameExtractor {
	/**Overloaded method. This method checks the file path's existence.
	 * @param filePath String the absolute file path
	 * @return String The file's name without the extension*/
	public static String extract(String filePath) {
		if (null != filePath && filePath.length() > 0) {
			if (PathValidator.isAFile(filePath)) {
				String name = Paths.get(filePath).getFileName().toString();
				int index = name.lastIndexOf(".");
				if (index != -1) {
					return name.substring(0, index);
				}
			}
		}
		return null;
	}

	/**Overloaded method. This method checks the file's existence.
	 * @param file The absolute File.
	 * @return String The file's name without the extension*/
	public static String extract(File file) {
		if (null != file && file.length() > 0) {
			if (PathValidator.isAFile(file.toPath().toAbsolutePath().toString())) {
				String name = file.toPath().getFileName().toString();
				int index = name.lastIndexOf(".");
				if (index != -1) {
					return name.substring(0, index);
				}
			}
		}
		return null;
	}

	/**Overloaded method. This method checks the path's existence.
	 * @param path The absolute Path.
	 * @return String The file's name without the extension*/
	public static String extract(Path path) {
		if (null != path) {
			if (PathValidator.isAFile(path.toAbsolutePath().toString())) {
				String name = path.getFileName().toString();
				int index = name.lastIndexOf(".");
				if (index != -1) {
					return name.substring(0, index);
				}
			}
		}
		return null;
	}
	
	public String toString() { return "File Name Extractor"; }
}
