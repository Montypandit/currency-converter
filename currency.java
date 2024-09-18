package function_and_array;

//import java.util.* ;
import java.util.Scanner;

public class currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double curr = 0;
		Scanner sc = new Scanner( System.in);
		System.out.println("input the original currency name");
		String p = sc.next();
		
		System.out.println("input the original currency");
		double cur = sc.nextDouble();
		
		
		
		System.out.println("input the changable currency name");
		String c = sc.next();
		
		
		System.out.println(p +" currency = "+ cur);
		
		if(p.equals("rupee")){
			curr = cur;
			System.out.println("rupees currency = Rs. "+ curr);
		}
		else
		//if(p != "rupee")
		{
			
			if(p.equals("dollar"))
			{
				curr = cur * 83.56517;
				System.out.println("rupees currency  = Rs. "+ curr);
			}
			if(p.equals("euro"))
			{
				curr = cur * 89.29013;
				System.out.println("rupees currency = Rs. "+ curr);
			}
			if(p.equals("pound"))
			{
				curr = cur *106.1463;
				System.out.println("rupees currency  = Rs. "+ curr);
			}
			if(p.equals("rial"))
			{
				curr = cur * 22.239342;
				System.out.println("rupees currency = Rs. "+ curr);
			}
			if(p.equals("yuan"))
			{
				curr = cur * 11.50034;
				System.out.println("rupees currency = Rs. "+ curr);
			}
			
		}
		
		 double l= currency1(curr,c);
		System.out.println(c + " currency = " + l);
		

	}

	private static double currency1(double curr, String c) {
		// TODO Auto-generated method stub
		double t=0;
		if( c.equals("rupee"))
		{
			
				 t = curr;
				 return t;
			
		}
		else
		{
			if(c.equals("dollar"))
			{
				 t = (curr)/(83.56517); 
			}
			if(c.equals("euro"))
			{
				 t = (curr)/(89.29013); 
			}
			if(c.equals("pound"))
			{
				 t = (curr)/(106.1463); 
			}
			if(c.equals("rial"))
			{
				 t = (curr)/(22.2393); 
			}
			if(c.equals("yuan"))
			{
				 t = (curr)/(11.50034); 
			}
			return t;
		}
	}

}
