package com.neuedu.test.chapter2;

public class test6 {
public static void main(String[] args) {
	
	/*��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
	int a = 100;
	System.out.println(a);
	int b = 200;
	System.out.println(b);
	int c = a;
	a = b;
	b = c;
	System.out.println("a="+a+",b="+b);*/
	
	//��λ֮��
	int a=345,b,c,d;
	b= a%10;
	c= a/100;
	d= a/10%10;
	System.out.println(a+"�ĸ�λ֮��="+c+d+b);
}
}
