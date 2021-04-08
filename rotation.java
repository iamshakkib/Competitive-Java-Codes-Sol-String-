import java.util.Scanner;
class gfg{

	static boolean rotation(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		return false;
		s1=s1+s1;
		return(s1.indexOf(s2)>=0);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		rotation(s1,s2);
		System.out.println(rotation(s1,s2));
	}
}
