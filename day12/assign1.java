import java.util.*;
class kirmada {
		public static void main(String [] args){
			Scanner sc=new Scanner (System.in);
			System.out.print("Enter two numbers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Addition is: "+(a+b));
			if (a>b){
				System.out.println("Substraction is :"+(a-b));
			}else{
				System.out.println("Substraction is :"+(b-a));
			}
		}
}