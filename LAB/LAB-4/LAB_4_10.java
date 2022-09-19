import java.util.Scanner;
class StackDemo{
	static int array[]=new int[100];
	static int top=-1;
	static boolean flag=true;
	public static void push(int n){
		if(top>=10){
			System.out.println("Stack Overflow");
		}
		else{
			top++;
			array[top]=n;
		}
	}
	public static  int pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int n = array[top];
			top--;
			return n;
		}
	}
	public static void find(int l,int m){
		System.out.println("-------------------------------------");
		for(int j=0;j<l;j++){
			int a=pop();
			if(a==m){
				System.out.println(m+" found at index "+(l-j-1));
				flag=false;
			}
		}
		if(flag){
			System.out.println(m+" not found");
		}
	}
}
public class StackArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackDemo sd=new StackDemo();
		System.out.print("Enter size of array : ");
		int l=sc.nextInt();
		for(int i=0;i<l;i++){
			System.out.print("Enter array element : ");
			sd.push(sc.nextInt());
		}
		System.out.print("Enter no. you want to find : ");
		int m=sc.nextInt();
		sd.find(l,m);
	}
}