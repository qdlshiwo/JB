package cn.zkingsoft.util;

import java.util.Random;

public class Helper {
	public  static String PrimaryKeyComplete(){
		StringBuilder str=new StringBuilder();//����䳤�ַ���
		Random random=new Random();
		//����������֣�����ӵ��ַ���
		for(int i=0;i<8;i++){
		    str.append(random.nextInt(10));
		}
		//���ַ���ת��Ϊ���ֲ����
		System.out.println("������"+str);
		return new String(str);
		
	}
	public static void main(String[] args) {
		String s = PrimaryKeyComplete();
		
	}
}
