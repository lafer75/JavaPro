package eighthomework;

import java.io.*;
import java.util.Formatter;

public class FileLoggerConfiguration {
    private static LoggingLevel level;
    private String filePath;
    private Formatter formatter;
    private static int size = 111;


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

    public static String writeFile(String a) throws IOException {
        File file = new File("logger");
        PrintWriter printWriter = new PrintWriter("logger");

        if (size > file.length()) {
            printWriter.println(a);
        } else {
            System.out.println("Не достаточно памяти");
        }
        printWriter.close();
        return a;
    }

    public static String writeFille(String a) throws IOException {
        File file = new File("logger");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logger"));
        if (size > file.length()) {
            bufferedWriter.write(a);
        } else {
            System.out.println("Не достаточно памяти");
        }

        bufferedWriter.close();

        return a;
    }


}
