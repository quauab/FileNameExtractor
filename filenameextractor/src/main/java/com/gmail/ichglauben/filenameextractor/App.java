package com.gmail.ichglauben.filenameextractor;

import java.io.File;

import com.gmail.ichglauben.filenameextractor.core.concretes.FileNameExtractor;
import com.gmail.ichglauben.filenameextractor.core.utils.abstracts.CustomClass;

public class App extends CustomClass {
	public static void main(String[] args) {
		ClassLoader loader = App.class.getClassLoader();

		File f1 = new File(loader.getResource("large.gif").getFile());
		File f2 = new File(loader.getResource("medium.gif").getFile());
		testFileNameExtractorClass(f1);
		testFileNameExtractorInstance(f2);
	}

	private static void testFileNameExtractorClass(File f1) {
		print(f1.toPath().getFileName() + " = " + FileNameExtractor.extractName(f1));
	}
	
	private static void testFileNameExtractorInstance(File f) {
		print(f.toPath().getFileName() + " = " + FileNameExtractor.extractName(f));
	}
}
