import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a,b;

        String option;
        System.out.print("Enter the first number: ");
        a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        b = sc.nextDouble();
        Operation op;
        sc.nextLine();
        System.out.print("Choose an operator (+ - * /): ");
        option = sc.nextLine();

        if(option=="-")
        {
            op=new Subtraction(a,b);
        }
        else if(option=="+")
        {
            op=new Addition(a,b);
        }
        else   if(option=="/")
        {
            op=new Division(a,b);
        }
        else
        {
            op=new Multiplication(a,b);
        }




        Tester.test(op);
    }
}