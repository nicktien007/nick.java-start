package com.javastart;


public class Ch02_2 {


	public static void main(String[] args) {

		//算術運算子
		System.out.println("========算術運算子========");

		int num1 = 30 + 20;
		int num2 = 30 - 20;
		int num3 = 3 * 20;
		int num4 = 30 / 3;
		int num5 = 20 % 3;

		System.out.println("【30 + 20】 = " + num1);
		System.out.println("【30 - 20】 = " + num2);
		System.out.println("【3 * 20】 = " + num3);
		System.out.println("【30 / 3】 = " + num4);
		System.out.println("【20 % 3】 = " + num5);


		//算術運算子，請觀察以下範例，a 值的變化
		System.out.println("========指定運算子========");
		int a = 30;
		int b = 10;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("【a += b】 結果：" + (a += b) + ", 此時 a = " + a + " , b = " + b);
		System.out.println("【a -= b】 結果：" + (a -= b) + ", 此時 a = " + a + " , b = " + b);
		System.out.println("【a *= b】 結果：" + (a *= b) + ", 此時 a = " + a + " , b = " + b);
		System.out.println("【a /= b】 結果：" + (a /= b) + ", 此時 a = " + a + " , b = " + b);

		//遞增運算子
		System.out.println("========遞增運算子========");

		int x = 8;
		System.out.println("x = " + x);
		System.out.println("【x++】 結果：" + (x++) + ", 此時 x = " + x);
		System.out.println("【--x】 結果：" + (--x) + ", 此時 x = " + x);
		System.out.println("【x--】 結果：" + (x--) + ", 此時 x = " + x);

		//比較運算子
		System.out.println("========比較運算子========");

		int grade = 78;
		int passScore = 60;

		System.out.println("得分(grade)：" + grade + " , 及格分數(passScore)：" + passScore);

		System.out.println("【grade == passScore】 得分是否等於及格分數：" + (grade == passScore));
		System.out.println("【grade > passScore】 得分是否大於及格分數：" + (grade > passScore));
		System.out.println("【grade < passScore】 得分是否小於及格分數：" + (grade < passScore));
		System.out.println("【grade >= passScore】 得分是否大於或等於及格分數：" + (grade >= passScore));
		System.out.println("【grade <= passScore】 得分是否小於或等於及格分數：" + (grade <= passScore));

		//邏輯運算子
		System.out.println("========邏輯運算子========");

		int n1 = 123;
		int n2 = 48;
		int n3 = 589;
		int n4 = 300;

		System.out.println("n1 = " + n1 + " , n2 = " + n2 + " , n3 = " + n3 + " ,n4 = " + n4 + "");

		boolean result1 = (n1 > n2) && (n3 > n4); //(n1 > n2)：True , (n3 > n4)：True
		boolean result2 = (n1 < n2) || (n3 > n4); //(n1 < n2)：False , (n3 > n4)：True
		boolean result3 = !(n4 > n3);             //(n4 > n3)：False，加上「!」，代表相反狀態

		System.out.println("【(n1 > n2) && (n3 > n4)】 = " + result1);
		System.out.println("【(n1 < n2) || (n3 > n4)】 = " + result2);
		System.out.println("【!(n4 > n3)】 = " + result3);
	}
}
