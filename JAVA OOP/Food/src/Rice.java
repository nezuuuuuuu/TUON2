public class Rice  implements FoodInterface{
    public int satietyPoints=20;



    public void cook(int n){
        satietyPoints*=n;
        return;
    }
    public int eat(){
        return satietyPoints;
    }


}