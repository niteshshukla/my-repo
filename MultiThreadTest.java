public class MultiThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Runnable r = ()->{

            for(int i=0;i<10;i++){
                System.out.println("Thread:"+Thread.currentThread().getName()+" "+i);
            }

        };

        Thread t1= new Thread(r);
        t1.setName("Thread 1");
        Thread t2= new Thread(r);
        t1.setName("Thread 2");

        t1.start();

        t2.start();

    }
}
