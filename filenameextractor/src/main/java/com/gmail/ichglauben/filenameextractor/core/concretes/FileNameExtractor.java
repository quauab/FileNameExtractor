package com.gmail.ichglauben.filenameextractor.core.concretes;

import java.io.File;
import java.nio.file.Path;

import com.gmail.ichglauben.filenameextractor.core.abstracts.AbstractFileNameExtractor;

/**
 * Use this class to extract the name portion of a file path, without it's
 * extension. This class provides 3 overloaded methods to accomplish this task.
 * 
 * @see java.io.File
 * @see java.nio.file.Path
 * @see java.nio.file.Paths
 * @see com.gmail.ichglauben.filenameextractor.core.abstracts.AbstractFileNameExtractor
 * @author Rick Walker
 * @version 0.1
 * @since 5/8/2016
 */
public class FileNameExtractor extends AbstractFileNameExtractor {
	private final static FileNameExtractor extractor = new FileNameExtractor();

	/** Single default constructor <i>calls parent's constructor</i> */
	public FileNameExtractor() {
		super();
	}

	/**
	 * Use this method to assign an instance of this class to a variable.
	 * 
	 * @return FileNameExtractor instance
	 */
	public static FileNameExtractor getInstance() {
		return extractor;
	}

	/**
	 * Use this method to extract the name portion from a Path.
	 * 
	 * @param p
	 *            <b><i>Path</i></b> The absolute Path.
	 * @return String The path's name without the extension
	 */
	public static String extractName(Path p) {
		return extract(p);
	}

	/**
	 * Use this method to extract the name portion from a File.
	 * 
	 * @param f
	 *            <b><i>File</i></b> The absolute File.
	 * @return String The file's name without the extension
	 */
	public static String extractName(File f) {
		return extract(f);
	}

	/**
	 * Use this method to extract the name portion from a file path.
	 * 
	 * @param s
	 *            <b><i>String</i></b> The absolute file path
	 * @return String The name of the file at the end of this path, without the
	 *         extension
	 */
	public static String extractName(String s) {
		return extract(s);
	}

	public String toString() {
		return "File Name Extractor";
	}
}
