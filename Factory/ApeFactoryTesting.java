import java.util.Scanner;
 
// Library classes
abstract class Ape {
    public abstract void printApe();
    public abstract void yell();
}
 
class Chimpanzee extends Ape {
    public void printApe() {
        System.out.println("I am a Chimpanzee");
    }
    public void yell(){
        System.out.println("hoot-pant-grunt!");
    }
}
 
class Gorilla extends Ape {
    public void printApe() {
        System.out.println("I am a Gorilla");
    }
    public void yell(){
        System.out.println("hoot-pant-hoot!");
    }
}
 
class Orangutans extends Ape {
    public void printApe() {
        System.out.println("I am an Orangutan");
    }
    public void yell(){
        System.out.println("pant-hoot-pant-scream!");
    }
}
 
// Factory
class ApeFactory {
    public Ape createApe(String newApe) {
        if(newApe.equals("chimpanzee")){
            return new Chimpanzee();
        }else if(newApe.equals("gorilla")){
            return new Gorilla();
        }else if(newApe.equals("orangutan")){
            return new Orangutans();
        }else{
            return null;
        }
    }
}
 
// Driver program
public class ApeFactoryTesting {
    public static void main(String[] args) {
        ApeFactory apeFactory = new ApeFactory();
        Ape myApe = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of Ape do you want to create? (chimpanzee / gorilla / orangutan)");
        if(userInput.hasNextLine()){
            String typeOfApe = userInput.nextLine();
            myApe = apeFactory.createApe(typeOfApe);
            if(myApe != null){
                introduceApe(myApe);
            }else{
                System.out.println("Wrong input!");
            }
        }
    }
   
    public static void introduceApe(Ape myApe){
        myApe.printApe();
        myApe.yell();
    }
}