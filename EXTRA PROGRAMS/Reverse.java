import java.util.*;
public class Reverse
{
        public String reverse(String Strings)
        {
            char ch[] = new char[100];
//            Scanner input = new Scanner(System.in);
//            String Strings = input.next();

            for(int i=0;i< Strings.length();i++)
            {
                ch[i] = Strings.charAt(i);
            }
            String rev="";
            for (int i=Strings.length()-1;i>=0;i--)
            {
                rev += ch[i];
            }

            System.out.println(rev);
            return rev;
        }

    public static void main(String[] args)
    {
        String sc = "abcd";
        Reverse r = new Reverse();
        String reversed = r.reverse(sc);
        System.out.println("reversed = "+reversed);
    }

}
