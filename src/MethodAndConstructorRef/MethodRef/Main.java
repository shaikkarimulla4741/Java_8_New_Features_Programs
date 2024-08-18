package MethodAndConstructorRef.MethodRef;

public class Main {
    public static void main(String[] args) {

//      Implementing the WorkInterface using the Work Class through Method Referencing.
        // This is using the Static Method Referencing.
        WorkInterface workInterface = Work::doMath;
        workInterface.doTask();

        Runnable runnable = Work::printNumbers;
        Thread thread = new Thread(runnable);
        thread.start();

//      Using the Instance Method Referencing.
//      To us the Instance Method Referencing we need to create the Object for the Class.

        Work work = new Work();
        WorkInterface workInterface1 = work::doSum;
        workInterface1.doTask();

    }
}
