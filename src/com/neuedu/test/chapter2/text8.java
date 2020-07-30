package com.neuedu.test.chapter2;

public class text8 {
public static void main(String[] args) {
	//华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，
	//将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
	double s = 32.5;
	double h = s * 9 / 5 + 32;
	System.out.println(h);
	double s1 = (h-32) * 5 / 9;
	System.out.println(s1);
	
}
}
