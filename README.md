# File Name Extractor
A simple Java solution for extracting the name portion (not including the dot and the extension) of a file. It contains one abstract class with one single argument overloaded method "extract" the returns the file's name. This project also contains a factory child class "FileNameExtractor" that contains a single argument overloaded method "extractName" that calls it's inherited "extract" method, then returns the file's name portion. Both class' overloaded method arguments can be a Path, File or a String path pointing to the file.

<h2>Usage</h2>
Generate a jar file - Include the jar in the project's build path - Instantiate the factory child class and call it's method.

<h2>Motivation</h2>
I created this project so to have a Java jar library that will extract a file's name (without the dot or the extension), if and when I am working on a project that requires this feature.

<h2>Info</h2>
This project does not contain any test cases.
