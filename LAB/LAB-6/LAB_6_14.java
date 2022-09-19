// import java.util.Scanner;

// public class Prefix
// {
//     static Prefix p1 = new Prefix();
//     static Scanner input = new Scanner(System.in);
//     static int length_of_array;
//     static int[] stack = new int[100];
//     static  String postfix_string="" ;
//     static  int answer=0,top=-1;

//     public void push(int a)
//     {
//         top++;
//         stack[top] = a;
// //        System.out.println("Stack value at top("+top+") is in push "+stack[top]);
//     }

//     public int pop()
//     {
// //        System.out.println("Stack value at top("+top+") is in pop "+stack[top]);
//         return stack[top];
//     }

//     public static void main(String[] args)
//     {
//         System.out.print("Please enter the postfix experssion: ");
//        String temp = input.next();

//         int c8=0,c2=0;

//         for(int i=temp.length()-1;i>=0;i--)
//         {
//             postfix_string += temp.charAt(i);
//         }

//         System.out.println("post "+postfix_string);

//         length_of_array = postfix_string.length();

//         for(int i=0;i<length_of_array;i++)
//         {
//             if (postfix_string.charAt(i)!='+' &&
//                     postfix_string.charAt(i)!='-'    &&
//                     postfix_string.charAt(i)!='*'    &&
//                     postfix_string.charAt(i)!='/'    &&
//                     postfix_string.charAt(i)!='^')
//             {
//                 c2++;
//             }

//             else
//             {
//                 c8++;
//             }
//         }

//         if(c2-c8==1)
//         {
//             System.out.println("Valid string postfix string");
//         }
//         else
//         {
//             System.out.println("Invalid string postfix string");
//             c8=0;
//         }

//         if(c8!=0)
//         {
//             for(int i=0;i<length_of_array;i++)
//             {
//                 if (postfix_string.charAt(i)!='+' &&
//                         postfix_string.charAt(i)!='-'    &&
//                         postfix_string.charAt(i)!='*'    &&
//                         postfix_string.charAt(i)!='/'    &&
//                         postfix_string.charAt(i)!='^'
//                 )

//                 {
//                     char c1 = (postfix_string.charAt(i));
//                     int c =Character.getNumericValue(c1);
// //                           System.out.println(c);
//                     p1.push(c);
//                 }

//                 else
//                 {

//                     int a = p1.pop();
//                     top--;
// //                         System.out.println("Top value after 1 time sub "+top);
//                     int b= p1.pop();
//                     top--;
// //                         System.out.println("Top value after 1 time sub "+top);

// //                         System.out.println(a);
// //                         System.out.println(b);

//                     if(postfix_string.charAt(i)=='+')
//                     {
//                         answer = b + a;
//                     }
//                     else if(postfix_string.charAt(i)=='-')
//                     {
//                         answer = b - a;
//                     }
//                     else if(postfix_string.charAt(i)=='*')
//                     {
//                         answer = b * a;
//                     }
//                     else if(postfix_string.charAt(i)=='/')
//                     {
//                         answer = b / a;
//                     }
//                     else if(postfix_string.charAt(i)=='^')
//                     {
//                         answer = (int) Math.pow(b,a);
//                     }
// //                          System.out.println(answer);
//                     p1.push(answer);
//                 }

//             }
//         }

//         System.out.println("Answer = "+answer);


//     }
// }
