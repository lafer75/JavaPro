package eighthomework;

import java.io.IOException;

import static com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl.DEBUG;
import static eighthomework.FileLogger.INFO;


public class Main {
    private static eighthomework.FileLoggerConfiguration FileLoggerConfiguration;

    public static void main(String[] args) throws Exception {
        FileLoggerConfiguration loggerConfig = new FileLoggerConfiguration(LoggingLevel.INFO, "C://User...");
        FileLogger.setUpLogger(FileLoggerConfiguration);
        if (loggerConfig.getLevel() == LoggingLevel.DEBUG) {
            eighthomework.FileLoggerConfiguration.writeFile(FileLogger.debug(DEBUG));
        } else {
            eighthomework.FileLoggerConfiguration.writeFile(FileLogger.info(INFO));
        }

    }
}
