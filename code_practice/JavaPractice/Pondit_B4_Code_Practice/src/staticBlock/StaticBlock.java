package staticBlock;

import com.sun.jdi.PathSearchingVirtualMachine;

public class StaticBlock {
    private static final String abc="This is first time initialize";
//    static {
//        abc = "This is static block";
//    }

    public static void main(String[] args) {
        System.out.println(abc);
    }
}
