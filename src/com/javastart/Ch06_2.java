package com.javastart;


public class Ch06_2 {

	public static void main(String[] args) {

		//實體化皮卡丘
		皮卡丘 皮卡皮卡 = new 皮卡丘();

		//設定屬性
		皮卡皮卡.set分類("電氣鼠");
		皮卡皮卡.set編號("25號");
		皮卡皮卡.set膚色("黃色");


		//調用 皮卡皮卡的方法
		皮卡皮卡.吃();
		皮卡皮卡.跳();

		//存取 皮卡皮卡的屬性
		System.out.println("皮卡皮卡的膚色" + 皮卡皮卡.get膚色());
		System.out.println("皮卡皮卡的編號" + 皮卡皮卡.get編號());
		System.out.println("皮卡皮卡的分類" + 皮卡皮卡.get分類());
	}
}
