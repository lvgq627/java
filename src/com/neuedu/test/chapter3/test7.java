package com.neuedu.test.chapter3;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double bj=1000000;
double lx;
double i,sum;
double a= 1000000;
double b  ;
for(i=0;i<3;i++)
{
	bj=bj+(bj * 0.04);	

}
lx = (bj-1000000)/36;


sum = lx * 12;
b =a *0.003-sum;
System.out.println("每个月的利息是:"+lx);
System.out.println("一年后取出应拿"+b);


	}
	

}
