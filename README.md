# File Name Extractor
A simple Java solution for extracting the name portion (not including the dot and the extension) of a file. It contains one abstract class with one single argument overloaded method "extract" the returns the file's name. This project also contains a factory child class "FileNameExtractor" that contains a single argument overloaded method "extractName" that calls it's inherited "extract" method, then returns the file's name portion. Both class' overloaded method arguments can be a Path, File or a String path pointing to the file.

<h2>Installation</h2>
<ol>
  <li>Download the project's zip</li>
  <li>Compile the project</li>
  <li>Generate a jar library</li>
  <li>Add jar to project's build path</li>
  <li>Call from the FileNameExtractor concrete class or sub-class it's parent</li>
</ol>

<h2>Motivation</h2>
Working on a previous project, I needed the ability to extract a file's name with and without the dot + extension, so I created a Java library that facilitates this task and uploaded to Github as a reference or potential library for others.

<h2>Info</h2>
This project does not contain any test cases.
