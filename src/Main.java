import javafx.concurrent.*;

public class Main {
    public static void main(String[] args)  {
        Thread v1 = new Thread(new Thrid("V1"));
        Thread v2 = new Thread(new Thrid("V2"));
        Thread v3 = new Thread(new Thrid("V3"));

        v1.start();
        v2.start();
        v3.start();
    }
}
