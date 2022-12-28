interface Vehicles
{
    public void gearChange();
    public void speedUp();
    public void applyBrakes();
}
class Bicycle implements Vehicles
{
    public void gearChange()
    {
        System.out.println("gear change for bicycle");
    }
    public void speedUp()
    {
        System.out.println("speed up for bicycle");
        
    }
    public void applyBrakes()
    {
        System.out.println("apply brakes for bicycle");
    }
}
class Bike implements Vehicles
{
    public void gearChange()
    {
        System.out.println("gear change for bike");
    }
    public void speedUp()
    {
        System.out.println("speed up for bike");
        
    }
    public void applyBrakes()
    {
        System.out.println("apply brakes for bike");
    }
}
class Car implements Vehicles
{
    public void gearChange()
    {
        System.out.println("gear change for car");
    }
    public void speedUp()
    {
        System.out.println("speed up for car");
        
    }
    public void applyBrakes()
    {
        System.out.println("apply brakes for car");
    }
}
public class Interface
{
    public static void main (String args[])
    {
      Vehicles v;
      v= new Bicycle();
      v.gearChange();
      v.speedUp();
      v.applyBrakes();
      
      v= new Bike();
      v.gearChange();
      v.speedUp();
      v.applyBrakes();
      
      v= new Car();
      v.gearChange();
      v.speedUp();
      v.applyBrakes();
    }
}