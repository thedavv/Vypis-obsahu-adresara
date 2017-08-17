package sk.racek;

import java.io.File;

public class AdresaryStructurePrintoutTest {
	public static void main(String[] args) {
		AdresaryStructurePrintout asp = new AdresaryStructurePrintout();
		File testFile = new File(AdresaryStructurePrintout.currentFolderPath);
		
		asp.currentAddresaryPrintout(testFile, 0);
	}
}
