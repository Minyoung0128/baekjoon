package ana;
import java.util.Scanner;
public class B2355 {

	public static void main(String[] args) {
		int a,b, tmp;
		long result;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {
			tmp=a;
			a=b;
			b=tmp;
		}
		if(a<0&&b<0) {
			result=(a*(-a+1)/2)-((b*(-b+1))/2)+b;
		}
		else {
			result=((b*(b+1))/2)-((a*(a+1))/2)+a;
		}
		
		System.out.println(result);

	}

}
