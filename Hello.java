import java.lang.reflect.Array;
import java.security.Key;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;



//import jdk.internal.util.xml.impl.Input;

//import sun.awt.AWTAccessor.SystemTrayAccessor;


 class Car {
    private int whell,speed;
    private String color,name;

    public Car(){
        this(0,0,"yok","yok");
    }
    public Car(int whell,int speed,String color,String name)
    {
        this.whell = whell;
        this.speed = speed;
        this.color = color;
        this.name = name;
        System.out.println("this reference : " + this);
    }
    // void SetCarİnfo(int whell, int speed, String color,String name)
    // {
    //     this.name = name;
    //     this.speed = speed;
    //     this.whell = whell;
    //     this.color = color;
    // }
    void GetCarİnfo()
    {

        System.out.println("What is its name ? : "+name);
        System.out.println("How many whells has car ? : "+whell);
        System.out.println("How speed is the car ? : "+speed);
        System.out.println("What color is the car ? : "+color);
    }

}
//  class FinalDemo{
//     public final void display()
//     {
//         System.out.println("This is a final method.");
//     }
// }
// class Main extends FinalDemo{  // FİNAL CLASS CAN NOT BE OVERRİDDE.
//     public final void display()
//     {
//         System.out.println("This final method is overridden.");
//     }
// }

public class Hello {
    static int factorial(int n)
    {
        if(n != 0)
        return n*factorial(n-1);
        else
        return 1;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int result = factorial(number);
        System.out.println(number +" factorial = "+ result);


        // Main obj = new Main();
        // obj.display();

      //   final int age = 20;
      //   age = 30; // IT IS NOT CAN USE WITH THAT.
      //   System.out.println(""+age);


        // Car car1 = new Car();
        // System.out.println("this reference :"+ car1);

        // String name = "Emre";
        // System.out.println(name);

        // String surname = "Yiğit";
        




        // System.out.println("This is the \"String\" class");  //JAVA STRING DOUBLE QUOTES


        // Boolean result = name.equals(surname);           //JAVA STRING EQUAL
        // System.out.println("Strings name and surname are equal : "+result);

        // String fullname = name.concat(surname); // JAVA STRING CONTACT
        // System.out.println(fullname);

        // int l = fullname.length();       // JAVA STRING LENGHT
        // System.out.println(""+l);






        // Car newCar = new Car();
        // Car car2 = new Car(4,175,"white","Mercedes");
        // System.out.println("What you want name to car ?");
        // String carname = scan.nextLine();

        // System.out.println("Plesae, get in the vaules...");
        // System.out.println("Plesae, get in number of whells :");
        // int whells = scan.nextInt();  
        // System.out.println("Plesae, get in color :");
        // String color = scan.next();
        // System.out.println("Plesae, get in speed :");
        // int speed = scan.nextInt();

        // newCar.SetCarİnfo(whells, speed, color, carname);

        // newCar.GetCarİnfo();
        // car2.GetCarİnfo();





















        // veriable = expressions ?  ture : false ; NOT USE İF

    //     float a,b,result;
    //     char operation;

    //     System.out.print("Number 1 :");
    //     a = scan.nextFloat();
    //     System.out.print("Number 2 :");
    //     b = scan.nextFloat();
    //     System.out.printf("+. Addition %n -. Subtraction %n *. Multiplication %n /.Division %n");
    //     operation = scan.next().charAt(0);

    //     switch (operation) {
    //         case '+':
    //             result = a + b;
    //             System.out.println(result);
    //             break;
    //         case '-':
    //             result = a - b;
    //             System.out.println(result);
    //             break;
    //         case '*':
    //             result = a * b;
    //             System.out.println(result);
    //             break;
    //         case '/':
    //             result = a / b;
    //             System.out.println(result);
    //             break;

    //         default:
    //         System.out.println("Please, choose +,-,* or /");
    //             break;

    //     }

    //    }
        // int a,sum = 0;

        // System.out.print("Numer :");
        // a = scan.nextInt();
        // int i = 0;

        // while(i<5)
        // {
        //     if(i==3)
        //     break;
        //         System.out.println(i);
        //          i++;


        // }

        // float a = 0;
        // float sum = 0;
        // while(true)
        // {
        //     System.out.print("Enter a Number :");

        //     a = scan.nextFloat();


        //     if(a<=0)
        //     break;
        //     sum+=a;
        // }
        // System.out.println("Sum :" + sum);


        // int a = 0;

        //  while(a<10)
        //     {

        //         a++;
        //         if(a==6)
        //           continue;

        //           System.out.println(a);
        //     }

        // System.out.println("End");
        // int[][] data = {
        //     {0,1,2},
        //     {3,4},
        //     {5}
        // } ;

        // for (int[] a:data) {
        //     for (int[] b: a) {
        //         System.out.println();
        //     }
        // }

        // int[] a = {1,2,3,4,5,6};
        // int[] b = new int[6];

        // for(int i=0;i<a.length;i++)
        // {
        //     b[i] = a[i];
        // }
        // a[0] = -5;
        // System.out.println(Arrays.toString(b));
        // System.out.println(Arrays.toString(a));



    }
}