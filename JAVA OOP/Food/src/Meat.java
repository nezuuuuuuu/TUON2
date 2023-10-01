public class Meat implements FoodInterface{
    public int satietyPoints=40;

    public void cook(int n){
        satietyPoints*=n;
        return;
    }
    public int eat(){
        return satietyPoints;
    }


}