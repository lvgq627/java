package com.neuedu.test.chapter3;

public class test5 {
public static void main(String[] args) {
	
	//4%利息10000存三年
	double sum = 10000;
	int i = 0;
	//i是控制循环次数的
	while(i<3)
	{
		sum*=(1+0.04);
		i++;
	}
	System.out.println(sum);
}
}
