package at.ac.fh_kufstein.uebung_04;

import at.ac.fh_kufstein.uebung04.Classes.Car;

public class Aufruf
{
    public static void main(String[] args)
    {
    Car auto1= new Car("blau",4,188.9); //Instanz
    Car auto2= new Car("rot",4,200.0);

    auto2.currentSpeed();
    auto1.currentSpeed();
    auto2.acclerate(60.0);
    auto2.currentSpeed();
    auto2.slowdown(60.0);
    auto2.currentSpeed();

    }
}
