package ana;
import java.util.Scanner;
public class B8941 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String n1=sc.nextLine();
		int n=Integer.parseInt(n1);
		double[] mass= {12.010,1.0080,16.000,14.01000};
		char[] symbol= {'C','H','O','N'};
		
		for(int i=0;i<n;i++) {
			double result=0.0;
			String tmp=sc.nextLine();
			int l=1;
			for(int j=0;j<tmp.length();j+=l) {
				
				for(int k=0;k<4;k++) {
					if(tmp.charAt(j)==symbol[k]) {
						if(j==tmp.length()-1) {
							result+=mass[k];
							l=1;
							break;
						}
						else if(tmp.charAt(j+1)>='0'&&tmp.charAt(j+1)<='9') {
							if(tmp.charAt(j+2)>='0'&&tmp.charAt(j+2)<='9') {
								l=3;
								int t=(int)(tmp.charAt(j+1)-'0')*10+(int)(tmp.charAt(j+2)-'0');
								result+=mass[k]*t;
							}
							else {
								int t1=(int)(tmp.charAt(j+1)-'0');
								result+=mass[k]*t1;
								l=2;
							}
						}
						else {
							result=result+mass[k];
							l=1;
						}
					}
				}
				
			}
			System.out.printf("%.3f\n",result);
		}
	}

}
