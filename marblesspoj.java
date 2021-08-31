/********************************************************************
*******  ######      #       #   #  #####    ###   ******************
*******  #          #  #     #  #     #      #  #  ******************
*******  ######    ######    ###      #      ###   ******************
*******       #   #      #   #  #     #      #  #  ******************
*******  ######  #        #  #   #  #####    ###   ******************
*********************************************************************
********************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;
import java.lang.*;



class test{

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException 
  {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    // br = new BufferedReader(new FileReader("in.txt"));
    // out = new PrintWriter(new FileWriter("out.txt"));
    		try{
			//Your Solve
		    int t = readInt();
		    while(t-->0){
		    	long n = readLong();
		    	long r = readLong();
		    	n-=1;
		    	r-=1;
		    	
		    	r=Math.min(r,n-r);
		    	System.out.println(nCr(n,r));
		    }
		}catch(Exception e){
			return;
		}
    
  }
  static long nCr(long n,long r){
  	long i=0;
  	long res = 1;
  	for(i=0;i<r;i++)
  	
            {
            	res=(res*(n-i))/(i+1); 
            	
            }
        return res;
  }
  static long fact(long n){
  	long sum=1;
  	for(long i=1;i<=n;i++){
  		sum*=i;
  	}
  	return sum;
  }
  static String next() throws IOException 
  {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }
    //extended
    static int gcd(int a, int b, int x, int y)
    {
        // Base Case
        if (a == 0)
        {
            x = 0;
            y = 1;
            return b;
        }
 
        int x1=1, y1=1; // To store results of recursive call
        int gcd = gcd(b%a, a, x1, y1);
 
        // Update x and y using results of recursive
        // call
        x = y1 - (b/a) * x1;
        y = x1;
 
        return gcd;
    }
    
  static long readLong() throws IOException 
  {
    return Long.parseLong(next());
  }

  static int readInt() throws IOException
  {
    return Integer.parseInt(next());
  }

  static double readDouble() throws IOException 
  {
    return Double.parseDouble(next());
  }

  static char readCharacter() throws IOException 
  {
    return next().charAt(0);
  }

  static String readLine() throws IOException 
  {
    return br.readLine().trim();
  }

}
