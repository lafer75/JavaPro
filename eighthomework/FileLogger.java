package eighthomework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FileLogger {
    private static FileLoggerConfiguration loggerConfig;

    public static void setUpLogger(FileLoggerConfiguration config) {
        FileLoggerConfiguration FileLoggerConfiguration = config;
    }

    public static String log(String text) {
        if (FileLoggerConfiguration.getLevel() == LoggingLevel.DEBUG) {
            debug(text);
        } else {
            info(text);
        }
        return text;
    }
    static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd,MMMM,yyyy", new Locale("uk", "UA"));
    static String date = dateFormat.format(new Date());

    private static Object locale = new Locale("uk", "UA");
    static DateFormat dateFormatt = DateFormat.getTimeInstance(DateFormat.DEFAULT, (Locale) locale);
    static String datee = dateFormatt.format(new Date());


    private static void debug(String text) {
        System.out.println("| DEBUG, INFO | " + text);
    }

    private static void info(String text) {
        System.out.println("| INFO | " + text);
    }
}
