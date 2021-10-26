package elias.spring5.autowire;

import elias.spring5.autowire.cars.Corolla;
import elias.spring5.autowire.cars.Swift;
import elias.spring5.autowire.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String carName = "corolla";
        Car car = context.getBean(carName, Car.class);
        System.out.println(car.specs());
        context.close();
    }
}
