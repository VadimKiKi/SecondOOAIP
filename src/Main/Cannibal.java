package Main;

public abstract class Cannibal {
    public final void Day(){
        CatchVictim();
        hook();
        Cook();
        Eat();
        GoToSleep();
    }
    abstract void Cook();
    public void CatchVictim(){
        System.out.println("Людоед ловит жертву");
    }
    public void Eat(){
        System.out.println("Людоед кушает");
    }
    public void GoToSleep(){
        System.out.println("Людоед ложится спать");
    }

    void hook() {}
}
