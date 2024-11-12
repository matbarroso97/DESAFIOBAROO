package entities;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;


    public double ticket() {
        if (gender == 'M') {
            return 10.00;
        } else {
            return 8.00;
        }
    }

    public double feeding() {
        return (beer * 5) + (barbecue * 7) + (softDrink * 3);
    }

   public double cover(){
        if (feeding() > 30){
            return 0.0;
        } else {
            return 4.00;
        }
   }

   public double total(){
        return ticket() + feeding() + cover();
   }

}
