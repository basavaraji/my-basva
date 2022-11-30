package edu.jsp.demo;

public class FbRecursion {

	public static void main(String[] args) {
		int num=10;
		Fbp p=new Fbp();
		p.fbp(num);
		
	}

}
class Fbp
{
	int n1=0,n2=1,n3=0;

	public void fbp(int num)
	{
		System.out.print(n1+ " " +n2);
		for(int i=2;i<=num;i++)
		{
			n3=n1+n2;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
		}
		
	}
}
