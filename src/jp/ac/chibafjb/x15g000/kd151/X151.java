package jp.ac.chibafjb.x15g000.kd151;

import java.util.Scanner;

public class X151 {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
			System.out.format("aの入力→");
				float a=sin.nextInt();
			System.out.format("bの入力→");
				float b=sin.nextInt();
		
		System.out.println(a+"+"+b+"="+(a+b));
		
		System.out.println(a+"-"+b+"="+(a-b));
		
		System.out.println(a+"*"+b+"="+(a*b));
		
		System.out.println(a+"/"+b+"="+(a/b));
	}

}
