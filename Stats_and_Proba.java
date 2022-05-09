import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double mue = 0, sd , vrnc , epx = 0 , x2px = 0;
		
		System.out.print("Enter no. of Elements: ");
		int n=sc.nextInt();
		
		double arrn[]=new double[n] , arrpx[]=new double[n] , xpx[]=new double[n] , xpx2[]=new double[n];
		
		System.out.print("\n\n(VALUES OF X)\n");
		for(int i=0 ; i<n ; i++){
			System.out.print("Enter value of x  element no. "+ (i+1) + " : ");
			arrn[i]=sc.nextDouble();
			}
		System.out.print("\n\n(VALUES OF P(x))\n");
		for(int i=0 ; i<n ; i++){
			System.out.print("Enter value of px  element no. "+ (i+1) + " : ");
			arrpx[i]=sc.nextDouble();
			
			epx += arrpx[i];
			}
		for(int i=0 ; i<n ; i++){
			xpx[i] = arrn[i] * arrpx[i];
			mue += xpx[i];
			}
		for(int i=0 ; i<n ; i++){
			xpx2[i] = xpx[i] * arrn[i];
			x2px += xpx2[i];
			}
		vrnc = x2px - Math.pow(mue , 2);
		sd = Math.sqrt(vrnc);
		
		System.out.print("\n\nANSWERS:\nMean = "+mue + "\nVariance = " + vrnc + "\nStandard Deviation: " + sd);
	}
}