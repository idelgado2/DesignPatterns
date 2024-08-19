import java.util.Scanner;

public class BurgerTesting {
    public static void main(String[] args) {
        BurgerFactory bugerFactory = new BurgerFactory();

        Burger myBurger = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of burger? (double / beyond / veggie)");

        if(userInput.hasNextLine()){
            String typeOfBurger = userInput.nextLine();
            myBurger = bugerFactory.makeBurger(typeOfBurger);
            if(myBurger != null){
                doBurgerStuff(myBurger);
            }else{
                System.out.println("Wrong input!");
            }
        }
    }
    public static void doBurgerStuff(Burger burger){
        burger.displayBurgerName();
        burger.displayBurgerIngredients();
    }
}
