import java.util.ArrayList;

public class FruitBasket{

    private ArrayList<Fruit> fruits= new ArrayList<Fruit>();

    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }
    public void countApple()
    {int count=0;
        for (Fruit a:fruits
             ) { if(a instanceof Apple)
        {
            count++;
        }
            
        }
            System.out.println("Number of Apples in the basket: "+count);
    }
    public void countOrange(){
        int count=0;
        for (Fruit a:fruits
        ) { if(a instanceof Orange)
        {
            count++;
        }

        }
        System.out.println("Number of Oranges in the basket: "+count);
    }

    public void countBanana(){
        int count=0;
        for (Fruit a:fruits
        ) { if(a instanceof Banana)
        {
            count++;
        }

        }
        System.out.println("Number of Bananas in the basket: "+count);
    }
    public void fruitBasketTastes()
    {
        for (Fruit a:fruits
        ) { if(a instanceof Apple)
        {
            a.getTaste();
            break;
        }

        }

        for (Fruit a:fruits
        ) { if(a instanceof Orange)
        {
            a.getTaste();
            break;
        }

        }
        for (Fruit a:fruits
        ) { if(a instanceof Banana)
        {
           a.getTaste();
           break;
        }

        }



    }
    public void fruitBasketTextures()
    {
        for (Fruit a:fruits
        ) {
            if(a instanceof Apple)
        {
            a.getTexture();
            break;
        }

        }

        for (Fruit a:fruits
        ) { if(a instanceof Orange)
        {
            a.getTexture();
            break;
        }

        }
        for (Fruit a:fruits
        ) { if(a instanceof Banana)
        {
            a.getTexture();
            break;
        }

        }
    }
}
