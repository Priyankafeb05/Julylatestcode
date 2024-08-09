
//((((10/2)-2)*2)-2)+2)
package Class3;

public class Assignment2 {
	public int Div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("The result of Div  "+c);
		return c;
	}
	public int sub(int a1,int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("The result of Sub  " +c1);
		return c1;
		
	}
	public int multi(int a2,int b2)
	{
		int c2;
		c2=a2*b2;
		System.out.println("The result of Multi  "+c2);
		return c2;
	}
	public int Sum(int a3,int b3)
	{
		int c3;
		c3=a3+b3;
		System.out.println("The result of Final result ((((10/2)-2)*2)-2)+2)=  "+c3);
		return c3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 obj=new Assignment2();
		int Divresult=obj.Div(10, 2);
		
		int Subresult=obj.sub(Divresult, 2);
		
		int Multiresult=obj.multi(Subresult, 2);
		int Subresult1=obj.sub(Multiresult, 2);
		obj.Sum(Subresult1, 2);
		

	}

}
