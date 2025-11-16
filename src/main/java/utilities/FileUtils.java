package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileUtils {
	 public static byte[] fileToBytes(File file) throws IOException {
	        return Files.readAllBytes(file.toPath());
	    }

}
