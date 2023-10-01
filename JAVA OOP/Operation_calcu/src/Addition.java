public class Addition extends Operation {
    double left, right;
    public Addition(double left, double right)
    {
        super(left,right);
        this.left=left;
        this.right=right;
    }

    public  double performOperation()
    {
        return left+right;
    }

}