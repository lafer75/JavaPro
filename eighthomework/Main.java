package eighthomework;

import java.io.IOException;
import java.util.Formatter;

public class Main {
    private static eighthomework.FileLoggerConfiguration FileLoggerConfiguration;

    public static void main(String[] args) throws IOException {
        FileLoggerConfiguration loggerConfig = new FileLoggerConfiguration(LoggingLevel.DEBUG, "C://User...");
        FileLogger.setUpLogger(FileLoggerConfiguration);
        String a ="| LEVEL | INFO | DEBUG |";
        String b ="| LEVEL | INFO |";
        if (loggerConfig.getLevel() == LoggingLevel.DEBUG) {
            FileLoggerConfiguration.writeFile(FileLogger.log("Log text"));
        }else {

        }
        System.out.print(FileLogger.date + " || ");
        System.out.print(FileLogger.datee);
    }
}
