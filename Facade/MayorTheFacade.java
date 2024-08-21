interface Instrument{
    void play();
    void pickUpInstrument();
    void putDownInstrument();
}

class Violin implements Instrument{
    public void pickUpInstrument() {
        System.out.println("Picking up Violin");
        
    }
    public void play() {
        System.out.println("Violen is playing!");
        
    }
    public void putDownInstrument() {
        System.out.println("Putting down Violin");
        
    }
}
class Viola implements Instrument{
    public void pickUpInstrument() {
        System.out.println("Picking up Viola");
        
    }
    public void play() {
        System.out.println("Viola is playing!");
        
    }
    public void putDownInstrument() {
        System.out.println("Putting down Viola");
        
    }
}
class Cello implements Instrument{
    public void pickUpInstrument() {
        System.out.println("Picking up Cello");
        
    }
    public void play() {
        System.out.println("Cello is playing!");
        
    }
    public void putDownInstrument() {
        System.out.println("Putting down Cello");
        
    }
}

interface Conductor{
    void playViolin();
    void playViola();
    void playCello();
}


class ConductorImplementor implements Conductor{

    public void playViolin() {
        Violin violin = new Violin();
        violin.pickUpInstrument();
        violin.play();
        violin.putDownInstrument();
    }

    public void playViola() {
        Viola viola = new Viola();
        viola.pickUpInstrument();
        viola.play();
        viola.putDownInstrument();
    }

    public void playCello() {
        Cello cello = new Cello();
        cello.pickUpInstrument();
        cello.play();
        cello.putDownInstrument();
    }

}

public class MayorTheFacade{
    public static void main(String[] args) {
        ConductorImplementor conductor = new ConductorImplementor();
        conductor.playViolin();
        conductor.playViola();
        conductor.playCello();
    }
}