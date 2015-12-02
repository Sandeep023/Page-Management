package PageManagement;
import java.util.*;
public class Iru {
	public static void main(String[] args)
	{
	   Scanner in = new Scanner(System.in);
		 System.out.println("Enter the no.frames\n");
		 int n = in.nextInt();
		 int[] f = new int[n];
		 int[] check = new int[n];
	     System.out.println("Enter the no.pages\n");
	     int pa = in.nextInt();
	     int[] p = new int[pa];
	     int k=0;
	     int fault = 0;
	     int flag = 0;
	     System.out.println("Values\n");
	     for(k = 0;k<pa;k++)
	     {
	    	 p[k] = in.nextInt();
	     }    
		 for(k=0;k<n;k++)
		 {
			f[k] = -1;
			check[k] = -1;
		 }
		 int l = 0;
		 for(k=0;k<n;k++)
		 {
			 f[k] = p[k];
			 for( l=0;l<k;l++)
			 {
				 System.out.print(f[l] + " ");
			 }
			 System.out.println();
			 fault = fault + 1;
			 check[k] = n -l- 1;
		 }
		 int j=0;
		 int pos=0;
		 int pos1 = 0;
		 for(j=k;j<pa;j++)
		 {
			 int ban = p[j];
				 for(int d=0;d<n;d++)
				 {
					 System.out.print(f[d] + " " );		
				 }
				 System.out.println();
				 for(int m=0;m<n;m++){
		       if(f[m]==ban)
		       {
		    	 flag =1;
		    	 pos = m;
		      }
				 }
			 if(flag==1)
			 {
				 for(k=0;k<n;k++)
				 {
					 check[k] = check[k] + 1;
				 }
				 check[pos] = 0;
			 }
			 else
			 {
				 for(k=0;k<n;k++)
				 {
					 check[k]= check[k] + 1;
				 }
				 int find = -1;
				 for(k=0;k<n;k++)
				 {
					 if(find < check[k])
					 {
						 find = check[k];
						 pos1 = k;
					 }
				 }
				 f[pos1] = ban;
				 check[pos1] = 0;
				 fault = fault + 1; 
			 }
		 }
		 for(int o = 0;o<n;o++)
		 {
			 System.out.print(f[o] +  " ");
		 }
		 System.out.println();
		 System.out.println(fault);
	}
}
