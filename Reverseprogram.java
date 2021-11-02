
package ReverseNumber;

public class Reverseprogram
{
public static void main(String []agrs)
{

	String A="XYZ";
	String Rev=" ";

	for(int i=0;i<=A.length()-1;i++)
	{
		Rev=Rev+A.charAt(i);
	}

	System.out.println("original String :"+A);
	System.out.println("Reverse String :"+Rev);

}
}