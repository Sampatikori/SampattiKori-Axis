package Thread;

public class ThreadProgram {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
//        thread.start();

        t1.join();

        ThreadOne t2 = new ThreadOne();
        t2.run();


        System.out.println("Main ends here");
//        System.out.println(thread.getThreadGroup());
//        System.out.println(thread.getName());
//        System.out.println(thread.getPriority());
//        System.out.println(thread.isAlive());
//        System.out.println(thread.getState());
//        System.out.println(thread.toString());
//        System.out.println(thread.getStackTrace());
//        System.out.println(thread.getClass());
//        System.out.println(thread.hashCode());
//        System.out.println(thread.isInterrupted());
    }
}
