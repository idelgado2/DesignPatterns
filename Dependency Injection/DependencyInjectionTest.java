class Engine {
  Engine(){}

  void start(){
      System.out.println("Engine goes vrooomm!");
  }
}

class Car {
  Engine engine;

  /* Constructor Injection */
  Car(Engine injected){
      engine = injected;
  }

  void carStartEngine(){
      engine.start();
  }
}

public class DependencyInjectionTest {
    public static void main(String[] args) {
        /* Notice that we are creating engine fisrt */
        Engine engine = new Engine();
    
        /* Constructor Injection */
        Car car = new Car(engine);
    
        car.carStartEngine();
      }
}