public class Main {
    public static void main(String[] args) {
        /* Notice that we are creating ClassB fisrt */
        ClassB classB = new ClassB();
    
        /* Constructor Injection */
        ClassA classA = new ClassA(classB);
    
        System.out.println("Random number from Class B method: " + classA.classRandom());
      }
}
