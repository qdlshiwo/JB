package cn.zkingsoft.util;

import java.util.Random;

public class Helper {
	public  static String PrimaryKeyComplete(){
		StringBuilder str=new StringBuilder();//定义变长字符串
		Random random=new Random();
		//随机生成数字，并添加到字符串
		for(int i=0;i<8;i++){
		    str.append(random.nextInt(10));
		}
		//将字符串转换为数字并输出
		System.out.println("生成了"+str);
		return new String(str);
		
	}
	public static void main(String[] args) {
		String s = PrimaryKeyComplete();
		
	}
}
