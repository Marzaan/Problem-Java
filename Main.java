import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int x,sum=0;
			int[] arr1=new int[100];
			int[] arr2=new int[100];
			x=sc.nextInt();
			for(int i=0;i<x;i++){
				arr1[i]=sc.nextInt();
				arr2[i]=sc.nextInt();
			}
			for(int i=0;i<x;i++){
				int y=arr2[i]-arr1[i];
				if(y>=2){
					sum=sum+1;
				}
			}
				System.out.println(sum);
	}
}