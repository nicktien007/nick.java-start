package com.javastart;


/**
 * for loop
 */
public class Ch06_1 {


	public static void main(String[] args) {


		模擬叫號機(23);

		System.out.println("====");

		模擬叫號機(25);


		sum(100, 200);
	}


	public static void 模擬叫號機(int x){
		//....

		for (int i = 8; i <= x; i++) {
			System.out.println("輪到" + i + "號患者進診間!!");
		}
	}

	public static int sum(int x, int y){
		return x + y;
	}

}
