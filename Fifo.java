package PageManagement;
import java.util.*;
public class Fifo {
	public static void main(String[] args) {
		int i=0;
		int k=0;
		int p=0;
		int n=0;
		int y=0;
		int [] arra1=new int[1000];
		int [] arra=new int[3];
		Scanner in = new Scanner(System.in);
		y=in.nextInt();
		n= in.nextInt();
		for(int x=0;x<y;x++)
		{
			arra[x]=-1;
		}
		for(int x=0;x<n;x++)
		{
			arra1[x]=in.nextInt();
		}
		for(int x=0;x<n;x++)
		{	k=0;
			for(int s=0;s<y;s++)
			{
			if(arra[s]==arra1[x])
			{	//System.out.println(arra1[x]);			
				k=1;
			}
			}
			if(k==0)
			{
				if(p==y)
				{
					p=0;
				}
					arra[p]=arra1[x];
					i=i+1;
					p=p+1;
					System.out.print("Fault Page = ");
				for(int s=0;s<y;s++)
					{	
						System.out.print(" "+arra[s]);
					}
				System.out.println("\n");	
			}	
		}
	}
}
