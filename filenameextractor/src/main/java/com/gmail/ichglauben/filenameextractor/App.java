package com.gmail.ichglauben.filenameextractor;

import java.io.File;

import com.gmail.ichglauben.filenameextractor.core.concretes.FileNameExtractor;
import com.gmail.ichglauben.filenameextractor.core.utils.abstracts.CustomClass;

public class App extends CustomClass {
	public static void main(String[] args) {
		ClassLoader loader = App.class.getClassLoader();

		File f1 = new File(loader.getResource("large.gif").getFile());
		print(f1.toPath().getFileName() + " = " + FileNameExtractor.extractName(f1));
	}
}
