package com.javastart;


/**
 * while
 */
public class Ch05_2 {


	public static void main(String[] args) {
		//1+2+3...+99=?

		int total = 0;
		int next = 1;

		while (next < 100){

			//total = total + next;
			total += next;
			next++;
		}

		System.out.println(total);


		//巢狀迴圈
//		for (int i = 0; i < 100; i++) {
//			for (int j = 0; j < 500; j++) {
//
//			}
//		}
	}


}
