//nested class and shadowing example
public class apartman {
    String name = "Selami Apartman";
    int numberofrooms;

    class room{
       String name = "Aşıklar Evi";
       int door_no;
       
       void OpenRoom()
       {
           System.out.println("Room has opened !");
       }
       void Allinfo(String name)
       {
           System.out.println("Name :"+ name);
           System.out.println("Room name :"+this.name);
           System.out.println("Apartman name :"+apartman.this.name);
       }

    }

    public static void main(String[] args) {
        apartman ap = new apartman();
        apartman.room rm= ap.new room();
        rm.Allinfo("Emre");
    }
}
