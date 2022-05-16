package exceptionHandling;

public class CheckedException {

    public static void main(String[] args) {
        //System.out.println(divide(4,0));
        try{
            System.out.println(divide(4,0));
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    static int divide(int a,int b) throws Exception{
        if(b==0){
            throw new Exception("b is 0");
        }
        else {
            return a/b;
        }
    }
}
