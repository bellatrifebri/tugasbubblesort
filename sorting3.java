import java.util.Scanner;
public class sorting3{
	public static void main (String args [])
	{
		int ember,d;
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Panjang data : ");
        d=scan.nextInt();
        int a[]=new int[d];

        for (int b=0; b<d; b++){
        	System.out.print("data ke : "+b);
        	a[b]=scan.nextInt();
        }

        for (int z=1; z<a.length-1; z++)
        {
        	if(a[z]<a[z+1]){
        		ember = a[z-1];
        		a[z-1]=a[z];
        		a[z] = ember;
        	}
        }
       for(int z=0; z < a.length; z++){
       	System.out.print(a[z]);
       }
    }
}
        