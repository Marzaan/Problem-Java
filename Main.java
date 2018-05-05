import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner (System.in);
			int k=sc.nextInt();
			int n=sc.nextInt();
			int w=sc.nextInt();
			int x=0;
			for(int i=1;i<=w;i++){
				x=x+k*i;
			}
			if(x>=n){
				System.out.println(x-n);
			}
			else{
				System.out.println("0");
			}
	}

}
