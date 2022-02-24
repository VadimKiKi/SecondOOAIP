package Main;

public class BlueCannibal extends Cannibal{
    @Override
    void Cook() {
        System.out.println("Людоед варит жертву");
    }
    @Override
    void hook(){
        System.out.println("Людоед беседует");
    }
}
