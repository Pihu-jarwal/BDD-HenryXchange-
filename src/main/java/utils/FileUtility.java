package utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtility {

    public static File getFile(String fileName) {
        if (FileUtility.class.getClassLoader().getResourceAsStream(fileName) != null) {
            InputStream resourceAsStream = FileUtility.class.getClassLoader().getResourceAsStream(fileName);
            File file = new File(fileName, "");
            try {
                FileUtils.copyInputStreamToFile(resourceAsStream, file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return file;
        } else {
            return new File(fileName);
        }
    }

    public static Properties readPropertyFile(String filePath) {
        try (FileInputStream input = new FileInputStream(filePath)) {
            Properties prop = new Properties();
            prop.load(input);
            return prop;
        } catch (IOException ex) {
            throw new RuntimeException("Exception occurred for filePath" + filePath + ":" + ex.getMessage());
        }
    }

    public static void createDirectoryIfNotExist(File directory) {
        if (!directory.exists()) {
            File dir = new File("./" + directory);
            dir.mkdirs();
        }
    }

    public static void copyFileToDirectory(File file, File directory) throws IOException {
        createDirectoryIfNotExist(directory);
        FileUtils.copyFileToDirectory(file, directory, true);
    }

    public static void forceDelete(File file) throws IOException {
        file.delete();
    }
}
