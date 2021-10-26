package elias.spring5.autowire.cars;

import elias.spring5.autowire.interfaces.Car;
import org.springframework.stereotype.Component;

// if we only give annotation in this class component just consider this is  a bean
//@Component("swift")
// either if we delete the component name it will work. Because the component name take the class name in lowercase
@Component
public class Swift implements Car {
    @Override
    public String specs() {
        return "Hatchback from Suzuki";
    }
}
