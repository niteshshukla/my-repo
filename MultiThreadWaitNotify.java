import org.junit.experimental.theories.Theories;

public class MultiThreadWaitNotify {

    public static void main(String[] args) {

        Message m= new Message("process it");
        Waiter w= new Waiter(m);

        Thread t1= new Thread(w,"waiter");
        t1.start();

        Notifier n= new Notifier(m);
        Thread t2= new Thread(n,"notifier");
        t2.start();

    }
}
