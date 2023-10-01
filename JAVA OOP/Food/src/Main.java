import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        Human human=new Human();
        Egg egg= new Egg();
        Bread bread = new Bread();
        Rice rice = new Rice();
        Meat meat= new Meat();
        System.out.print("Enter the number of times to cook Egg: ");
        n=scanner.nextInt();
        egg.cook(n);
        System.out.print("Enter the number of times to cook Bread: ");
        n=scanner.nextInt();
        bread.cook(n);

        System.out.print("Enter the number of times to cook Rice: ");
        n=scanner.nextInt();
        rice.cook(n);

        System.out.print("Enter the number of times to cook Meat: ");
        n=scanner.nextInt();
        meat.cook(n);


        Tester.test(human, egg, bread, rice, meat);

    }
}