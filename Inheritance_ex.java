class Vehicle
{
    int speed;
    int price;
    int capacity;
    boolean is_working()
    {
        return true;
    }

    void getVehicleInfo()
    {
        System.out.println("Speed : "+speed);
        System.out.println("Price : "+price);
        System.out.println("Capacity : "+capacity);
    }

}
class Car extends Vehicle
{
    int number_of_whells;
    int number_of_doors;

    Car(int now,int nod,int speed,int price,int capacity)
    {
        number_of_doors = nod;
        number_of_whells = now;
        super.speed = speed;
        super.price = price;
        super.capacity = capacity;
    }
    @Override
    void getVehicleInfo() {
        // TODO Auto-generated method stub
        super.getVehicleInfo();
        System.out.println("Number of doors : "+number_of_doors);
        System.out.println("Number of whells : "+number_of_whells);
    }
}
class Motorcycle extends Vehicle
{
    int number_of_whells;

    
    Motorcycle(int now,int speed,int price,int capacity)
    {
        number_of_whells = now;
        super.speed = speed;
        super.price = price;
        super.capacity = capacity;
    }
    @Override
    void getVehicleInfo() {
        // TODO Auto-generated method stub
        super.getVehicleInfo();
        System.out.println("Number of whells : "+number_of_whells);
    }
}

public class Inheritance_ex {
    public static void main(String[] args) {
        Car car1 = new Car(4,4,270,15000,5);
        Motorcycle motorcycle = new Motorcycle(2,450,27000,1);

        car1.getVehicleInfo();
        motorcycle.getVehicleInfo();
    }
}
