public class BurgerFactory {
    public Burger makeBurger(String newBurgerType){
        if(newBurgerType.equals("double")){
            return new Doublecheese();
        }else if(newBurgerType.equals("beyond")){
            return new Beyond();
        }else if(newBurgerType.equals("veggie")){
            return new Veggie();
        }else{
            return null;
        }
    }
}
