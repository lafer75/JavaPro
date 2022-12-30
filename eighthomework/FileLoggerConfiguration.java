package eighthomework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;

public class FileLoggerConfiguration {
    private static LoggingLevel level;
    private String filePath;
    private Formatter formatter;
    private static int size = 1;


    public FileLoggerConfiguration(LoggingLevel level, String filePat) {
        this.level = level;
        this.filePath = filePath;
    }


    public static LoggingLevel getLevel() {
        return level;
    }

    public String getFilePath() {
        return filePath;
    }

    public static void writeFile(String a) throws IOException {
        File file = new File("logger");
        PrintWriter printWriter = new PrintWriter("logger");
        printWriter.println(a);
        System.out.println(file.length());
        if (size > file.length()) {
            System.out.println("asdasddasdasd = ");

        }
        printWriter.close();

    }

}
