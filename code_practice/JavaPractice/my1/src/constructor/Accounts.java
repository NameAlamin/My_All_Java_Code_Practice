package constructor;

public class Accounts {
    public String StudentName;
    public int courseFee;

    /*
        Constructor
        1. Same name as class name
        2. Constructor never return anything
        3. It will be used to allocate memory

        * when we create new instance every time it's call default constructor

     */

     Accounts(){
         System.out.println("This is default constructor for Accounts Class");
    }
    Accounts(int i){
        System.out.println("This is paramitarized constructor");
    }
    Accounts(int x, float y){
        System.out.println("This is 2 paramitarized constructor");
    }
}
