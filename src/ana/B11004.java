package ana;
import java.util.Scanner;
public class B11004 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] input1=input.split(" ");
		int n=Integer.parseInt(input1[0]);
		int k=Integer.parseInt(input1[1]);
		String input2=sc.nextLine();
		String[] input3=input2.split(" ");
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(input3[i]);
		}
		for(int i=0;i<num.length;i++) {
			int isChanged=0;
			for(int j=0;j<num.length-i-1;j++) {
				if(num[j]>num[j+1]) {
					int tmp=num[j];
					num[j]=num[j+1];
					num[j+1]=tmp;
					isChanged=1;
				}
			}
			if(isChanged==0) break;
		}
		System.out.println(num[k-1]);
		sc.close();
	}
}
