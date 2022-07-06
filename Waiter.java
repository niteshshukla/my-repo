public class Waiter implements  Runnable{

    private Message msg;

    public Waiter(Message m){
        this.msg=m;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        synchronized (msg){
            System.out.println("waiting to get notified...");
            try {
                msg.wait();
               // msg.setMsg("waiter working...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("message is: "+msg.getMsg());
        System.out.println("waiter work done...");
    }
}
