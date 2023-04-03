import java.util.Scanner;
interface Car{
    void accelerate();
}
class BMW implements Car {
    @Override
    public void accelerate(){
        System.out.println(" accelerate ");
    }
}
class Civic implements Car {
    @Override
    public void accelerate(){
        System.out.println(" accelerate ");
    }
}
public class QQ {
    public static void main ( String[] args) {
        BMW b = new BMW ();
    Civic c = new Civic ();
        b.accelerate();
        c.accelerate();
    }
}