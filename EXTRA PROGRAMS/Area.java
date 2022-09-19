
public class Area
{
    public static void main(String[] args)
    {
           Triangle t1 = new Triangle();
          System.out.println(t1.findArea(2,4));

    }
}
class Triangle
{
    double findArea(int a,int b)
    {
        return (1/(double)2)*a*b;
    }
}
