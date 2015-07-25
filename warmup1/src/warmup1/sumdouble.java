package warmup1;
import java.util.*;



public class sumdouble {
static int a;
static int b;
static int sum;
String s;

public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("enter a value");
a=in.nextInt();
System.out.println("enter b value");
b=in.nextInt();
	int c=sumdouble.sum();
System.out.println(c);
in.close();
}

public static int sum(){
	if (a!=b) {
		return a+b;
		}
		if (a==b) {
			return (a+b)*2 ;
			}
		return 0;
		
		
			

			
}


}
