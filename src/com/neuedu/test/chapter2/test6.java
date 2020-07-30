package com.neuedu.test.chapter2;

public class test6 {
public static void main(String[] args) {
	
	/*已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序
	int a = 100;
	System.out.println(a);
	int b = 200;
	System.out.println(b);
	int c = a;
	a = b;
	b = c;
	System.out.println("a="+a+",b="+b);*/
	
	//各位之和
	int a=345,b,c,d;
	b= a%10;
	c= a/100;
	d= a/10%10;
	System.out.println(a+"的各位之和="+c+d+b);
}
}
