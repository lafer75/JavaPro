package eighthomework;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileLogger {
    private static FileLoggerConfiguration loggerConfig;

    public static void setUpLogger(FileLoggerConfiguration config) {
        FileLoggerConfiguration FileLoggerConfiguration = config;
    }
    static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy", new Locale("uk", "UA"));
    static String date = dateFormat.format(new Date());

    private static Object locale = new Locale("uk", "UA");
    static DateFormat dateFormate = DateFormat.getTimeInstance(DateFormat.DEFAULT, (Locale) locale);
    static String time = dateFormate.format(new Date());

    public static String debug(String text) throws IOException {
        String a = FileLoggerConfiguration.writeFile(date + " || " + time
                + " | " + eighthomework.FileLoggerConfiguration.getLevel() + " | " + text);
        return a;
    }

    public static String info(String text) throws IOException {
        String a = FileLoggerConfiguration.writeFile(date + " || " + time
                + " | " + eighthomework.FileLoggerConfiguration.getLevel() + " | " + text);
        return a;
    }
}
