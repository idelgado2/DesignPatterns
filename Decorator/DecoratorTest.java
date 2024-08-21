interface Pizza {
    String getDescription();
    double getCost();
}
 
class PlainCheesePizza implements Pizza {
    public String getDescription() {
        return "Plain Cheese Pizza";
    }
    public double getCost() {
        return 2.0;
    }
}
 
class PepperoniDecorator implements Pizza {
    public Pizza decoratedPizza;
    public PepperoniDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Pepperoni";
    }
    public double getCost() {
        return decoratedPizza.getCost() + 0.5;
    }
}
 
class SausageDecorator implements Pizza {
    public Pizza decoratedPizza;

    public SausageDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Sausage";
    }
    public double getCost() {
        return decoratedPizza.getCost() + 0.2;
    }
}
 
public class DecoratorTest {
    public static void main(String[] args) {
        Pizza coffee = new PlainCheesePizza();
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
 
        Pizza milkCoffee = new PepperoniDecorator(new PlainCheesePizza());
        System.out.println("\nDescription: " + milkCoffee.getDescription());
        System.out.println("Cost: $" + milkCoffee.getCost());
 
        Pizza sugarMilkCoffee = new SausageDecorator(new PepperoniDecorator(new PlainCheesePizza()));
        System.out.println("\nDescription: " + sugarMilkCoffee.getDescription());
        System.out.println("Cost: $" + sugarMilkCoffee.getCost());
    }
}