import java.util.Scanner;

public class Angle_time
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter hour: ");
        int h = input.nextInt();
        System.out.print("Please enter min: ");
        double m = input.nextInt();
        double m1=m,m2=m,a=0,r=1,m3=m;
        if(m==0)
        {
            a = 12-h;
            a = a*30;
            a = 360-a;
            System.out.println("The angle between "+h+":"+m+" is "+a);
        }
        else
        {
            m=m/5;
            System.out.println(m);
            m=h-m;
            System.out.println(m);
            a=m*30;
            System.out.println(a);
            a =a+m1*0.5;
            System.out.println(a);
//            r = m1%5;
//            Math.abs(a);
            System.out.println("The angle between "+h+":"+m3+" is "+Math.abs(a  ));

        }


    }
}
