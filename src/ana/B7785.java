package ana;
import java.util.Scanner;
public class B7785{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] name=new String[n];
        String[] log=new String[n];
        int[] inOrout=new int[n];
        for(int i=0;i<n;i++){
            name[i]=sc.next();
            log[i]=sc.next();
        }
        for(int j=0;j<n;j++){
            for(int k=0;k<n-j;k++){
                if(name[j]==name[j+k]){
                    if(log[j+k]=="enter"){
                        inOrout[j]=1;
                    }
                    else{
                        inOrout[j]=0;
                    }
                }
            }
        }
        for(int l=0;l<n;l++){
            if(inOrout[l]==1){
                System.out.println(name[l]);
            }
            System.out.println(name[l]);
            System.out.println(log[l]);
            System.out.println(inOrout[l]);
        }
        
    }
}
