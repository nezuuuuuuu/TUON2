public class Egg implements FoodInterface{
    public int satietyPoints=5;

    public void cook(int n){
        satietyPoints*=n;
        return;
    }
    public int eat(){
        return satietyPoints;
    }



}