public class Bread  implements FoodInterface{
    public int satietyPoints=10;

    public void cook(int n){
        satietyPoints*=n;
        return;
    }
    public int eat(){
        return satietyPoints;
    }


}