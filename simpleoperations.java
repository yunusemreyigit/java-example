public class simpleoperations {
    public static void main(String[] args) {
        int n =5;

        if(n==2 && ++n>3) //short circuit
        {}
        System.out.println("n :"+n); //5
        if(n==5 || ++n<2) //short circuit
        {}
        System.out.println("n :"+n); //5



        insan ali = new insan();
        insan veli = new insan(170,20);

        ali.boy =175;
        ali.yas = 18;
        System.out.println("alinin yaşı : "+ali.yas+","+"alinin boyu :"+ali.boy);
        System.out.println("velinin yaşı : "+veli.yas+","+"velinin boyu :"+veli.boy);
    }
}
class insan
{
    int boy;
    int yas;

    public insan(){
        System.out.println("ben insanım !");
    }
    public insan(int boy, int yas)
    {
        this();
        this.boy = boy;
        this.yas=yas;
    }
}