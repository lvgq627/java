package com.neuedu.test.chapter3;

public class test2 {
public static void main(String[] args) {
	//4��һ�� ���겻�� 400������
	int year = 2000;
	if(year % 400==0)
	{
		System.out.println(year+"������");
	}
	else if(year % 100!=0 && year % 4 ==0)
	{
		System.out.println(year+"������");
	}
	else
	{
		System.out.println(year+"��������");
	}
}
}
