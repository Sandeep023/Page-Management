package PageManagement;
import java.util.*;
public class Optimal {
	public static void main(String[] args) {
		int pos = 0;
		int i;
		int take=0;
		 int[] a = new int[1000];
		 int[] cot = new int[1000];
		 int[] fra = new int[1000];
		 int min = 1000000;
		 int pos1=0;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the no.of Frames");
		 int f = in.nextInt();
		 System.out.println("Enter no.of Pages");
		 int p = in.nextInt();
		 System.out.print("Enter the Values\n");
		 int j;
		 for(j=0;j<p;j++)
		 {
			 a[j] = in.nextInt();
		 }
		 int fault = 0;
		 for(j=0;j<f;j++)
		 {
		  fra[j] = a[j];
		 }
		 fault  = f;
		 take = f;
         for(j=0;j<p;j++)
         {
        	 cot[a[j]] = cot[a[j]] + 1;
         }
         for(j=take;j<p;j++)
         {
        	 int k = a[j];
        	 int flag=0;
        	 for( i = 0;i<f;i++)
        	 {
        		 if(fra[i]==k)
        		 {
        			 flag = 1;
        			 pos = i;
        			 
        		 }
        	 }
        	 if(flag == 1)
        	 {
        		 cot[fra[pos]] = cot[fra[pos]] - 1;
         }
        	 if(flag == 0)
        	 {
        		for(int b=0;b<f;b++)
        		{
        			System.out.print(fra[b] + " ");
        		}
        		System.out.println();
        		 for(int b = 0;b<f;b++)
        		 {
        			 if(cot[fra[b]]< min)
        			 {
        				 min = cot[fra[b]];
        				 pos1 = b;
        			 }
        		 }
        		// for(int l=0;l<f;l++)
        		// {
        	//		 System.out.print(fra[l] + " ");
        		// }
        		 fra[pos1] = k;
        		 cot[fra[pos1]] = cot[fra[pos1]] - 1;
        		 fault = fault + 1;
        	 }
         }
         for(int u = 0 ; u<f;u++)
         {
        	 System.out.print(fra[u] + " ");
         }
         System.out.println();
         System.out.println(fault);
         
	}
}
