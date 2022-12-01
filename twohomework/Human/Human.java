package twohomework.Human;

public interface Human {
    void  PIB();
    void  position();
    default void  email(){
        System.out.println("email@gmail.com");
    };
    void  years();
}
