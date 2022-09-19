import java.util.Scanner;

public class AsCount {
    int count = 0, flag = 0;

    public int checking(int arr[])
    {
        for(int i=0;i< arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return 0;
            }
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            else
            {
                if(count>=2) {
                    count = 0;
                    flag = 1;
                    continue;
                }
                else {
                    return 0;
                }
            }
        }
        return 1;
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int arr[] = {3,3,3,4,4,4,5,5,5,6,6,6};

        AsCount a = new AsCount();


        System.out.println(a.checking(arr));



    }
}
