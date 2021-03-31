
import java.util.*;
import java.io.*;
class gfg{
	
	static boolean anagram(char[] str1 , char[] str2)
	{
		if(str1.length!=str2.length)
		{
			return false;
		}
		int []arr = new int[256];
		for(int i=0;i<str1.length;i++)
		{
			arr[str1[i]-'a']++;
		}
		for(int j=0;j<str2.length;j++)
		{
			arr[str2[j]-'a']--;
		}
		for(int i=0;i<256;i++)
		{
			if(arr[i]!=0)
			return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine(); 
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		if(anagram(str1,str2))
		{
			System.out.println("true");
		}
		else
		System.out.println("false");
	}
}
