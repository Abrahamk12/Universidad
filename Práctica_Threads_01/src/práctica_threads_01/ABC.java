package práctica_threads_01;

public class ABC implements Runnable {
    public void run() {
        for(char a = 'a'; a <= 'z'; a++){
            String name = Thread.currentThread().getName();
            System.out.println(name + ":\t" + a);
        }
    }
}
