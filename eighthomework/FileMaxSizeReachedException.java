package eighthomework;

public class FileMaxSizeReachedException extends Exception{
    public FileMaxSizeReachedException() {
        System.out.println("Дуже великій розмір файлу");
    }
}
