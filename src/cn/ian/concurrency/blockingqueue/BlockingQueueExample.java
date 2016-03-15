package cn.ian.concurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ian on 2016/3/15.
 */
public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(1024);
        Producer producer =  new Producer(queue);
        Customer customer = new Customer(queue);

        Thread tp = new Thread(producer);
        Thread tc = new Thread(customer);

        tp.start();
        tc.start();

        try {
            tp.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

   static class Producer implements Runnable {

        private BlockingQueue queue;

        public Producer(BlockingQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {

            try {
                queue.put("1");
                queue.put("2");
                Thread.sleep(5000);
                queue.put("3");
                Thread.sleep(15000);
                queue.put("14");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Customer implements Runnable {
        private BlockingQueue queue;

        public Customer(BlockingQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {

            try {
                System.out.println(queue.take());
                System.out.println(queue.take());
                System.out.println(queue.take());
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

