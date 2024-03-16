//2D array

package besic;

public class forEachloop2
{
public static void main(String args[])
{
	int data[][]= {{12,33,44},
			{90,89,78},
			{34,21,33}
	};
	
for(int x=0;x<3;x++)
{
	for(int y=0;y<3;y++)
	{
		System.out.println(data[x][y]+" ");
	}
	System.out.println();
}
}
}
