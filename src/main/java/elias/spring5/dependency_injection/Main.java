package elias.spring5.dependency_injection;

import elias.spring5.dependency_injection.cars.Corolla;
import elias.spring5.dependency_injection.cars.Swift;
import elias.spring5.dependency_injection.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Car swift= new Swift();
//        System.out.println(swift.specs());
        Car corolla = new Corolla();
//        System.out.println(corolla.specs());
        //Car car = new Swift();
        //System.out.println(car.specs());
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        String carName="swift";
        Car car= context.getBean(carName,Car.class);
        carName="corolla";
        Car car1 = context.getBean(carName,Car.class);
        System.out.println(car.specs());
        System.out.println(car1.specs());
        context.close();
    }
}
