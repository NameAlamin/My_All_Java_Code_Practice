package singletonPattern;

public class SynchronizedBlockMultipleThread {
    public static SynchronizedBlockMultipleThread obj1;

    private SynchronizedBlockMultipleThread(){
        System.out.println("Hello obj");
    }

    public static synchronized SynchronizedBlockMultipleThread getInstance(){
        if(obj1 == null){
            obj1 = new SynchronizedBlockMultipleThread();
        }
        return obj1;
    }
}

class ThreadMain{
    public static void main(String[] args) {
       Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               SynchronizedBlockMultipleThread obj1 = SynchronizedBlockMultipleThread.getInstance();
           }
       });
       Thread t2 = new Thread(new Runnable() {
           @Override
           public void run() {
               SynchronizedBlockMultipleThread obj2 = SynchronizedBlockMultipleThread.getInstance();
           }
       });
       t1.start();
       t2.start();
    }
}