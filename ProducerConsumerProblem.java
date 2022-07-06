import sun.applet.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerProblem {
    private static List<String> dataList = new LinkedList<>();

    public static void main(String[] args) {

        Runnable r1 = () -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                produce(i);
            }
            System.out.println(Thread.currentThread().getName() + " added " + "End");
            dataList.add("End");
        };


        Runnable r2 = () -> {
            System.out.println(Thread.currentThread().getName());

            while (true) {
                if (dataList.isEmpty()) {
                    continue;
                }
                if (dataList.get(0).equals("End")) {
                    System.out.println(Thread.currentThread().getName() + " exiting.");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " removed " + dataList.remove(0));
                }
            }
        };

        Thread producer = new Thread(r1, "producer");
        Thread consumer = new Thread(r2,"consumer");
        Thread consumer2 = new Thread(r2,"consumer");

        producer.start();
        consumer.start();
        consumer2.start();


    }
    private static void produce(int data){

        dataList.add(String.valueOf(data));
        System.out.println("produced: " + String.valueOf(data));

    }
}
