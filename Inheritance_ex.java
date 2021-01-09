import java.util.jar.Attributes.Name;

class People
{   
    String name;
    int money,age;
    
    void Eat()
    {
        System.out.println("I am eating.");
    }
    void Earn()
    {
        System.out.println("I am earning money at the right now");
    }
    void Walk()
    {
        System.out.println("I am walking.");
    }
    void Idle()
    {
        System.out.println("I am waiting.");
    }
}

class Warrior extends People
{
 @Override
 void Earn()
 {
     super.Earn();
     super.money +=25;
 }
}


public class Inheritance_ex {
    public static void main(String[] args) {
        Warrior necati = new Warrior();
        Warrior asli = new Warrior();

        necati.name = "Necati";
        necati.age = 20;
        necati.money = 5;
        necati.Idle();
        necati.Earn();
        System.out.println("Money :"+necati.money);
        System.out.println("Aslı Money : "+asli.money);

    }
}
