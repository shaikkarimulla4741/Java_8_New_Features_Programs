package MethodAndConstructorRef.MethodRef;

public class Work {

    public void doSum(){
        System.out.println(Math.addExact(244,444));
    }
    public static void doMath(){
        System.out.println(Math.sqrt(25));
    }

    public static void printNumbers(){
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
