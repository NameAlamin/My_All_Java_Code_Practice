package singletonPattern;

public class SingletonLazy {
    public static SingletonLazy obj;

    private SingletonLazy(){
        System.out.println("Object Created");
    }

    public static SingletonLazy getInstance(){
        if(obj == null){
            obj = new SingletonLazy();
        }
        return obj;
    }
}

class LazyMain{
    public static void main(String[] args) {
        SingletonLazy obj1 = SingletonLazy.getInstance();
        SingletonLazy obj2 = SingletonLazy.getInstance();
    }
}
