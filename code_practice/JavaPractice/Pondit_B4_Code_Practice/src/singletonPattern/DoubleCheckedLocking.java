package singletonPattern;

public class DoubleCheckedLocking {
    private static DoubleCheckedLocking obj1;
    private DoubleCheckedLocking(){
        System.out.println("Hello");
    }
    public static DoubleCheckedLocking getInstance(){
        if(obj1 == null){
            synchronized (DoubleCheckedLocking.class){
                if(obj1 == null){
                    obj1 = new DoubleCheckedLocking();
                }
            }
        }
        return obj1;
    }
}

class LockingMain{
    public static void main(String[] args) {
//        DoubleCheckedLocking obj1 = DoubleCheckedLocking.getInstance();
//        DoubleCheckedLocking obj2 = DoubleCheckedLocking.getInstance();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DoubleCheckedLocking obj1 = DoubleCheckedLocking.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DoubleCheckedLocking obj2 = DoubleCheckedLocking.getInstance();
            }
        });
        t1.start();
        t2.start();

    }
}