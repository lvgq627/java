package com.neuedu.test.chapter3;

public class test3 {
public static void main(String[] args) {
	/*�ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6����������ֻ�ܱ�5��������ӡ�ܱ�5������
	����ֻ�ܱ�6����������ӡ�ܱ�6�����������ܱ�5��6����������ӡ���ܱ�5��6������*/
	int num = 30;
	if(num%5==0 &&num%6==0)
	{
		System.out.println("�ܱ�5��6����");
	}
	else if(num%5==0)
	{
		System.out.println("�ܱ�5����");
		
	}
	else if(num%6==0)
	{
		System.out.println("�ܱ�6����");
	}
	else
	{
		System.out.println("���ܱ�5��6����");
	}
}
}
