package ana;
import java.util.Arrays;
import java.util.Scanner;
public class B1225 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] arrOfa=new int[5];
		int[] arrOfb=new int[5];
		int tmpa=a;
		int tmpb=b;
		Arrays.fill(arrOfa, 0);
		Arrays.fill(arrOfb, 0);
		for(int i=0;i<5;i++) {
			arrOfa[i]=tmpa%10;
			tmpa/=10;
			arrOfb[i]=tmpb%10;
			tmpb/=10;
		}
		int sum=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				sum+=arrOfa[i]*arrOfb[j];
			}
		}
		System.out.println(sum);

	}

}
