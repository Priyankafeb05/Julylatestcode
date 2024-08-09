

//(((((10+2)*2)-2)*2)/2)
package Class3;

public class Assignment1 {
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("The result of (10+2)  "+c);
		return c;
	}
	public int sub(int a1,int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("The result of Sum "+c1);
		System.out.println();
		return c1;
		
	}
	public int multi(int a2,int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("The result of Multi  "+c2);
		return c2;
	}
	public int Div(int a3,int b3)
	{
		int c3;
		c3=a3/b3;
		System.out.println("The result of Final result (((((10+2)*2)-2)*2)/2)=  "+c3);
		return c3;
		
	}
	public static void main(String[] args) {
		Assignment1 obj=new Assignment1();
			int sumresult=obj.sum(10, 2);
			int Multiresult=obj.multi(sumresult, 2);
			int Subresult=obj.sub(Multiresult, 2);
			int Multiresult1=obj.multi(Subresult, 2);
			obj.Div(Multiresult1, 2);
			
			
	}

}
