import javafx.concurrent.*;

public class Thrid implements Runnable {
    private String name;
    Thrid(String namee){
        this.name = namee;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(name+" :"+i);
            try{
                Thread.sleep((long)(Math.random()*1500));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
