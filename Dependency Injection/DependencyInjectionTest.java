class ClassB {
  ClassB(){}

  int calculate(){
      return (int) Math.round(Math.random() * 100);
  }
}

class ClassA {
  ClassB classB;

  /* Constructor Injection */
  ClassA(ClassB injected){
      classB = injected;
  }

  int classRandom(){
      return classB.calculate();
  }
}

public class DependencyInjectionTest {
    public static void main(String[] args) {
        /* Notice that we are creating ClassB fisrt */
        ClassB classB = new ClassB();
    
        /* Constructor Injection */
        ClassA classA = new ClassA(classB);
    
        System.out.println("Random number from Class B method: " + classA.classRandom());
      }
}