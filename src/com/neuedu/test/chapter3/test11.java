package com.neuedu.test.chapter3;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int s= 90;
			int i ;
			
			System.out.print(s+"=");
			for(i=2;i<=s;i++){
				while(s!=i)
			{
			if(s%i==0)
				{
				System.out.print(i+"*");
				s=s/i;
				}
			else
				{
				break;
				}
			
			}
			
			}
			System.out.print(s);
	}

}
