package com.javastart;


/**
 * 陣列 Array
 */
public class Ch03_1 {


	public static void main(String[] args) {

		//宣告一個整數陣列，長度為3
		int[] intsArray = new int[3];

		//取得陣列長度
		System.out.println(intsArray.length);

		//陣列取值
		System.out.println(intsArray[0]);

		int number = intsArray[1];
		System.out.println(number);

		System.out.println(intsArray[2]);

		//設定陣列內容
		intsArray[0] = 100;
		intsArray[1] = 500;
		intsArray[2] = 200;

		System.out.println(intsArray[0]);
		System.out.println(intsArray[1]);
		System.out.println(intsArray[2]);

	}
}
