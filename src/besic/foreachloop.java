//1D array

package besic;

public class foreachloop
{
public static void main(String args[])
{
	int data[]= {12,33,44};
	int[]pp= {56,32,11};
	int x[]=new int[] {12,21,23,44,55};
	
	for(int a:x)//datatype
		System.out.println(a+" ");
	System.out.println();
	for(Integer a:x)//class
	System.out.println(a+" ");
	System.out.println();
	for(Object a:x)//object
		System.out.println(a+" ");

}
}
