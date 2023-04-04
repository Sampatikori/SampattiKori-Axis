package Thread;

public class ThreadOne implements Runnable{
    @Override
    public void run() {
        for (int j=0; j<19; j++){
            System.out.println("****" + Thread.currentThread().getName() +" "+ j);

        }
    }
}
