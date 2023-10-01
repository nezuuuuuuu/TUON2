public class Division extends Operation {
    double left, right;
    public Division(double left, double right)
    {
        super(left,right);
        this.left=left;
        this.right=right;
    }

    public double performOperation()
    {
        return left/right;
    }

}