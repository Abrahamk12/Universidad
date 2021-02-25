package práctica_threads_01;

public class Num implements Runnable {
    int i = 1;
    
    public void run() {
        while (i != 31) {
            String name = Thread.currentThread().getName();
            System.out.println(name + "\t" + i++);
        }
    }
    
}