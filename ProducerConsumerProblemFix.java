import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class ProducerConsumerProblemFix {
    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {

        Runnable r1 = () -> {
            produce();
        };


        Runnable r2 = () -> {

            while(true) {
                try {
                    System.out.println(Thread.currentThread().getName() + " removed " + queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread producer = new Thread(r1, "producer");
        Thread consumer = new Thread(r2,"consumer1");
        //Thread consumer2 = new Thread(r2,"consumer2");

        producer.start();
        consumer.start();
       // consumer2.start();


    }
    private static void produce(){
        for (int i = 0; i < 10; i++) {
            try {
                queue.put(String.valueOf(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("produced: " + i);
        }

    }
}
