package eighthomework;

import java.io.IOException;


public class Main {
    private static eighthomework.FileLoggerConfiguration FileLoggerConfiguration;

    public static void main(String[] args) throws IOException {
        FileLoggerConfiguration loggerConfig = new FileLoggerConfiguration(LoggingLevel.DEBUG, "C://User...");
        FileLogger.setUpLogger(FileLoggerConfiguration);
        if (loggerConfig.getLevel() == LoggingLevel.DEBUG) {
            eighthomework.FileLoggerConfiguration.writeFile(FileLogger.debug("Log text"));
            eighthomework.FileLoggerConfiguration.writeFille(FileLogger.info("textzfdscx"));
        } else {
            eighthomework.FileLoggerConfiguration.writeFile(FileLogger.info("textzfdscx"));
        }
    }
}
