package GenericType;

public class BoxGen<T>{

   private T container;

    BoxGen(T container) {
        this.container=container;
    }

    T getContainer() {
        return this.container;
    }

    //    We can also perform task based on the generic type given at the time of initialization.
    public void performTask(T container) {
        if (container instanceof String) {
//            If the container type is String then we'll find the length of the container;
            System.out.println(((String) container).length());
        } else System.out.println("This is an Integer Type");
    }

}
