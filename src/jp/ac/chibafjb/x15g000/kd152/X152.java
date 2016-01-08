package jp.ac.chibafjb.x15g000.kd152;

import java.util.Scanner;

public class X152 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin=new Scanner(System.in);
		System.out.print("半径r -->");
		 float a = sin.nextFloat();
		 float  b = 3.14f;
	sin.close();
		System.out.println("円周  ="+2*b*a);
		System.out.println("面積  ="+b*a*a);
			
			
	}

}
