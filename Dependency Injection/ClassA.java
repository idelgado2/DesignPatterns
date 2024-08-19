public class ClassA {
    ClassB classB;

    /* Constructor Injection */
    ClassA(ClassB injected){
        classB = injected;
    }

    int classRandom(){
        return classB.calculate();
    }
}
