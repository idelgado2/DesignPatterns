import java.util.Arrays;

public abstract class Burger {
    private String name;
    private boolean meat;
    private String[] ingredients;

    public String getName(){ return name;}
    public void setName(String newName) { name = newName; }

    public String[] getIngredients() { return ingredients; }
    public void setIngredients(String[] ingre) { ingredients = ingre; }

    public boolean isMeat(){ return meat;}
    public void setIsMeat(boolean isMeat){ meat = isMeat; }

    public void displayBurgerName(){
        System.out.println(getName() + " is on screen");
    }
    public void displayBurgerIngredients(){
        System.out.println(Arrays.toString(getIngredients()));
    }
}
