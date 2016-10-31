package com.company;

import java.util.concurrent.BlockingQueue;

/**
 * Created by bapaydin on 31.10.2016.
 */
public class Producer implements Runnable {

    private BlockingQueue<Message> blockingQueue;

    public Producer(BlockingQueue<Message> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            Message message = new Message(" " + i);
            try{
                Thread.sleep(i);
                blockingQueue.put(message);
                System.out.println("Procuded " + message.getMsg());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        Message message = new Message("exit");
        try {
            blockingQueue.put(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
