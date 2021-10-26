package elias.spring5.autowire.cars;

import elias.spring5.autowire.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// if we add component annotation in this class, application gives crash. We have to use name
//@Component("corolla")
// either if we delete the component name it will work. Because the component name take the class name in lowercase
@Component
public class Corolla implements Car {
    // spring skip creating the object of Engine
//    @Autowired(required = false)
    @Autowired()
    Engine engine;

//    there is a small difference between constructor and setter
//    setter explicitly run at this set of value when we will like used to object then we will create the object
    //@Autowired
   /* public void setEngine(Engine engine) {
        engine.type = "New V8 eEngine";
        this.engine = engine;
    }*/

    //    we can use the @AutoWired  annotation with constructor
    public Corolla(Engine engine) {
        engine.type = "new V8 value";
        this.engine = engine;
    }

    @Override
    public String specs() {
        String specs = " Sedan from Toyota with engine type as unknown " + engine.type;
        return specs;
    }
}
