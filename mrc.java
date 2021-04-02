import java.io.*;
import java.util.*;
class mrc{
	static int mrc(char []str)
	{
		int[] FI= new int[256];		//we will store the index of the characters in this array 							
		for(int i=0;i<256;i++)	        // and filling the array with -1 or any -ve value as characters ranges
						//upto 256 so that we could keep a track of 
						//repeating and non-repeating chars
		{
			FI[i]=-1;
		}
		int res = Integer.MAX_VALUE;    //using integer max value constant to compare 
						//it with the variable res which will have the index of 		
						//repeating chars and we will constantly update it
						//it until and unless we are not getting the 
						//leftmost repeating character 
		for(int i=0;i<str.length;i++)
		{
			if(FI[str[i]]==-1)	//initially all elements having -1 so it will 
						//come inside the if loop and will store the chars
						//index according to its ASCII value
			{
				FI[str[i]]=i;
			}
			else				//and as soon as the ASCII value of the repeating char matches it will find
							//that element with same ASCII index already containing the index no. of its 1st apperance
							// and will come to the else part and the else will identify the
							//leftmost char as leftmost char will surely have the least value of index
			res = Math.min(res,FI[str[i]]); 
		}
		return (res==Integer.MAX_VALUE)?-1:res; // if res remains the Max value then return -1 means no repeating char
							// else returning the index of the leftmost char by comparing it using MIN method.
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();	//taking string as a input 
		  				//and then converting it into character array
		  				//so that we could randomly access it inside 
		  				//the FI(First Index) array the purpose is to 
		  				//use the ASCII value of characters to keep the
		  				//track of the repeating char and non-repeating
		  				//chars.
		char []str = s.toCharArray();    
		mrc(str);
		System.out.println(mrc(str));
	}
}
