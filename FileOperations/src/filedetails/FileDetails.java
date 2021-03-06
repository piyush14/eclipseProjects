package filedetails;

import java.io.File;
import java.io.IOException;

public class FileDetails {
	String path = "D:/study/StudyMaterial";
	public void showDetails(File dir) throws IOException{
		File currentDir = new File(".");
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("directory:" + file.getName() + file.getTotalSpace());
				showDetails(file);
			} else {
				System.out.println("     file:" + file.getName()+ file.getTotalSpace());
			}
	}
}
}
