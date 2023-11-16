package com.javastart;


public class Ch02_1 {
	public static void main(String[] args) {

		//宣告變數
		String name = "nick";

		//印出name
		System.out.println(name);

		System.out.println("==================整數==================");

		//整數：預設int型別
		int n1 = 18;
		System.out.println("n1 型別為 int，值 = " + n1);

		//byte：-128 ~ 127
		//超出範圍，報錯!!
//		byte n2 = 128;
//		System.out.println(n2);

		//short：-32768 ~ 32767
		short n3 = 30000;
		System.out.println("n3 型別為 short，值 = " + n3);

		//長整數：字尾加上L
		long n4 = 88888888888888L;
		System.out.println("n4 型別為 long，值 = " + n4);

		System.out.println("\n==================浮點數==================");


		//浮點數：預設double型別(倍精浮點數)：小數點下第15位
		double d1 = 1.123456789;
		System.out.println("d1 型別為 double，值 = " + d1);

		//單精浮點數：小數點下第7位
		float f1 = 1.123456789F;	// ===> 超過小數點7位，精度損失
		System.out.println("f1 型別為 float，值 = " + f1);

		System.out.println("\n==================布林==================");

		//布林
		int age = 78;
		boolean isHappy = false;
		boolean isOlder = age > 65;

		System.out.println("isHappy = " + isHappy);
		System.out.println("isOlder = " + isOlder);


		System.out.println("\n==================字元及字串==================");

		//字元
		char c1 = 'n';
		System.out.println("c1 型別為 char，值 = " + c1);

		//字元也可以是中文字
		char c2 = '我';
		System.out.println("c2 型別為 char，值 = " + c2);


		String s1 = "哈囉";
		System.out.println("s1 型別為 String，值 = " + s1);


		System.out.println("\n==================型別轉換-數字轉換==================");


		System.out.println("小範圍轉大範圍：自動轉換(隱含轉換)");

		//小範圍轉大範圍：自動轉換(隱含轉換)
		float f2 = 3.1415f;
		System.out.println("f2 = " + f2);

		System.out.println("f2隱含轉換為d2");
		double d2 = f2; //隱含轉換
		System.out.println("d2 = " + d2);

		System.out.println("f2明確轉換為d3");
		double d3 = (double) f2;
		System.out.println("d3 = " + d3);


		//大範圍轉小範圍：只能強制轉換(明確轉換)
		System.out.println("大範圍轉小範圍：只能強制轉換(明確轉換)");

		double d4 = 3.14159265359;
		System.out.println("d4 = " + d4);

		//大範圍轉小範圍，不可隱含轉換，報錯!!
//		float f3 = d4;


		System.out.println("d4 明確轉換為 f3, 精度損失");
		float f3 = (float) d4;//明確轉換(大範圍轉小範圍，精度損失)

		System.out.println("f3 = " + f3);


		System.out.println("\n==================型別轉換-文字轉數字==================");
		String a = "70";
		String b = "30";
		String c = "12.3434";

		System.out.println("【字串a】 = " + a);
		System.out.println("【字串b】 = " + b);
		System.out.println("【字串c】 = " + c);

		System.out.println();

		System.out.println("【字串a】 + 【字串b】= " + a + b);


		System.out.println("將字串a、b轉數字");
		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);
//		System.out.println("【數字a】 + 【數字b】= " + aInt + bInt); //錯!!!有括號沒括號差很多
		System.out.println("【數字a】 + 【數字b】= " + (aInt + bInt));

		System.out.println("將字串a 轉long");
		long aLong = Long.parseLong(a);
		System.out.println("aLong = " + aLong);

		System.out.println("將字串c 轉Float");
		float cFloat = Float.parseFloat(c);
		System.out.println("cFloat = " + cFloat);

		System.out.println("將字串c 轉double");
		double cDouble = Double.parseDouble(c);
		System.out.println("cDouble = " + cDouble);


		System.out.println("\n==================型別轉換-數字轉文字==================");
		int y = 88;
		double d5 = 55.99;

		System.out.println("y = " + y);//自動轉字串
		System.out.println("y = " + String.valueOf(y));
		System.out.println("d5 = " + String.valueOf(d5));

	}
}
