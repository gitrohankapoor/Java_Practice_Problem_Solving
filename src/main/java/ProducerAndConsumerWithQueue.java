import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerAndConsumerWithQueue {
    public static void main(String args[]) throws InterruptedException {
        Queue queue = new LinkedList<String>();
        Object obj = new Object();
        Thread producerThread = new Thread(() -> {
            synchronized (obj){
                if(queue.size()>0){
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Queue content in Consumer"+queue.peek());
                queue.add("element");
                obj.notify();
            }

        });
        Thread consumerThread = new Thread(() -> {
            synchronized (obj){
                if(queue.size()==0){
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Queue content in Consumer"+queue.peek());
                queue.remove();
                obj.notify();
            }
        });
       producerThread.start();
       consumerThread.start();
       //producerThread.join();
       //consumerThread.join();
    }
}
