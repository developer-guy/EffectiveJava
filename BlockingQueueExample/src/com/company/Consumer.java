package com.company;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * Created by bapaydin on 31.10.2016.
 */
public class Consumer implements Runnable {

    private BlockingQueue<Message> blockingDeque;

    public Consumer(BlockingQueue<Message> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        try {
            Message message;
            while ((message = blockingDeque.take()).getMsg() != "exit") {
                Thread.sleep(1000);
                System.out.println("Consumed : " + message.getMsg());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
