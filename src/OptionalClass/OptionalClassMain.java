package OptionalClass;

import java.util.Optional;

public class OptionalClassMain {

//        Used to handle NullPointerException.
//    Once wrapped in an Optional, you can safely perform operations without worrying about null.
//    We can check whether a function or value is null or not and take actions accordingly.
//    Provides many functionalities to check null and take actions, do alternatives.
    public static void main(String[] args) {

        String name = "Hii";

//        Using the normal way.
        if (name == null) {
            System.out.println("This a null value");
        } else System.out.println(name);

//        Using Optional Class references.
//        Using this "Optional.ofNullable(name)" even if the name is not the NullPointerException won't raise.
        Optional<String> stringOptional = Optional.ofNullable(name);

//        Returns if the stringOptional contains a value inside it.
        System.out.println(stringOptional.isPresent());

//        Returns the value in variable.
        System.out.println(stringOptional.get());

//        If the value is not inside the stringOptional then we can perform an alternative using orElse().
        System.out.println(stringOptional.orElse("The value is not present"));

//        We perform the actions on the below method since it is Optional.
//        We can check if the value is present or  not  and then print.
        Optional<String >  optional = getName();
        System.out.println(optional.orElse("The value is null"));

    }

    public static Optional<String> getName() {
        String name = "Buzz";
        return Optional.ofNullable(name);
    }

}
