package elias.spring5.dependency_injection.cars;

import elias.spring5.dependency_injection.interfaces.Car;
import org.springframework.stereotype.Component;

// if we add component annotation in this class, application gives crash. We have to use name
//@Component("corolla")
// either if we delete the component name it will work. Because the component name take the class name in lowercase
//@Component
public class Corolla implements Car {
    @Override
    public String specs() {
     return "Sedan from Toyota";
    }
}
