package besic;

public class forEachLoop3d
{
public static void main(String args[])
{
	int data[][][]= {{{12,33,44},
		            {90,89,78},
		            {34,21,33}},
			
			        {{11,22,33},
			         {90,56,77},
			         {54,33,22}},
			
			         {{44,55,6},
				      {99,66,77},
				      {22,11,33}}};
//	System.out.println(data[0][0][0]);//12
//	System.out.println(data[1][1][1]);//56
//	System.out.println(data[2][2][2]);//33
int size=0;
for(int x=0;x<3;x++)
{
	for(int y=0;y<3;y++)
	{
		for(int z=0;z<3;z++)
		{
			System.out.print(data[x][y][z]+" ");size++;
		}
		System.out.println();
	}
	System.out.println();
}
System.out.println(size);	
}
}
