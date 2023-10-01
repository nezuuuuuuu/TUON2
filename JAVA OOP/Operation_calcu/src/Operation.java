public abstract class Operation {
    double left;
    double right;

    public Operation(double left, double right)
    {
        this.left=left;
        this.right=right;
    }

    public abstract double performOperation();
    public void printResult()
    {
        System.out.println("Result: "+String.format("%.2f",this.performOperation()));
    }
}