package at.ac.fh_kufstein.uebung04.Classes;

public abstract class Car
{
    String color;
    int wheels;
    double speed;


    public void currentSpeed()
    {
        System.out.println("Die Geschwindigkeit beträgt: " + this.speed + "!");
    }

    public Car(String color, int wheels, double speed, double maxSpeed)
    {
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getWheels()
    {
        return wheels;
    }

    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public Car(String color, int wheels, double speed)//Konstruktor wo in der Klammer alle PArameter angegeben wurden
    {
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }



    public void acclerate(double geschwindigkeit)
    {
        this.speed = this.speed + geschwindigkeit;
        System.out.println(speed);
    }

    public void slowdown(double geschwindigkeit)
    {
        this.speed = this.speed - geschwindigkeit;
        System.out.println(speed);
    }

}
