package sk.racek;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AdresaryStructurePrintout {
	private static  Path    currentRelativePath = Paths.get("");
	static		    String  currentFolderPath	= currentRelativePath.toAbsolutePath().toString();

	public void currentAddresaryPrintout(File currentFile, int space){
		if(currentFile.isDirectory()){
			for (int i = 0; i < space; i++) {
				System.out.print(" ");
			}
			System.out.print("+");
			System.out.println(currentFile.getName());

			
				for (File f : currentFile.listFiles()) {
					currentAddresaryPrintout(f, space + 2);	//rekurzia
				}
			
		} else{
			for (int i = 0; i < space - 2; i++) {
				System.out.print(" ");
			}
			System.out.print("|__");
			System.out.println(currentFile.getName());
		}
	}
}
