public class Human {
    public int satietyLevel=0;


    public void getSatiety(){
        if(this.satietyLevel<50)
        {
            System.out.print("Hungry");

        }
        else{
            System.out.print("Full");
        }
    }
    public void feed(FoodInterface food)
    {
        this.satietyLevel=food.eat()+this.satietyLevel;

    }
}