package thursdaywork;

import Thread.ThreadEx;

public class ThreadPriority extends Thread{

    public void run() {
        for (int i =1;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Thread is running! " + Thread.currentThread().getName() + " - Priority - "
            + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        ThreadEx t1 = new ThreadEx();
        ThreadEx t2 = new ThreadEx();
        


        t1.setName("Thread-1");
        t2.setName("Thread-2");
     

        t1.setPriority(NORM_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
       

        t1.start();
        t2.start();
      

	
}
}
