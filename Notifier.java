public class Notifier implements Runnable{

    private Message msg;
    public Notifier(Message m){
        this.msg=m;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (msg){
            msg.setMsg("notifier work done...");
            System.out.println("notifying waiter.....");
            msg.notify();
        }
    }
}
