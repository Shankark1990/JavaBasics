package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class DeleteFilesFromDirectory {
    public static void deleteFiles() throws IOException {
        FileUtils.cleanDirectory(new File("C:\\Users\\shakhara\\Workplace\\JavaBasics\\screenshots\\"));

    }
}
