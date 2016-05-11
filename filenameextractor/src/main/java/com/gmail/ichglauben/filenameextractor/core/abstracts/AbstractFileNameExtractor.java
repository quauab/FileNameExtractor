package com.gmail.ichglauben.filenameextractor.core.abstracts;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.gmail.ichglauben.filenameextractor.core.utils.concretes.PathValidator;
/**	
 * Abstract class provides 3 overloaded methods that will extract the name portion of a file path, without it's extension.
 *	@see java.io.File
 *	@see java.nio.file.Path
 *	@see java.nio.file.Paths
 *	@author	Rick Walker
 *	@version 0.1
 *	@since 5/8/2016
*/
public abstract class AbstractFileNameExtractor {
	public AbstractFileNameExtractor() {
		super();
	}

	/**
	 * Use this method to extract the name portion from a file path.
	 * 
	 * @param filePath
	 *            <b><i>String</i></b> The absolute file path
	 * @return String The name of the file at the end of this path, without the
	 *         extension
	 */
	protected static String extract(String filePath) {
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

	/**
	 * Use this method to extract the name portion from a File.
	 * 
	 * @param file
	 *            <b><i>File</i></b> The absolute File.
	 * @return String The file's name without the extension
	 */
	protected static String extract(File file) {
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

	/**
	 * Use this method to extract the name portion from a Path.
	 * 
	 * @param path
	 *            <b><i>Path</i></b> The absolute Path.
	 * @return String The path's name without the extension
	 */
	protected static String extract(Path path) {
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

	public String toString() {
		return "Abstract File Name Extractor";
	}
}
