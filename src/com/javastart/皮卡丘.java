package com.javastart;

public class 皮卡丘 {

	private String 膚色;

	private String 分類;

	private String 編號;


	public void set膚色(String color) {
		this.膚色 = color;
	}

	public void set分類(String 分類) {
		this.分類 = 分類;
	}

	public void set編號(String 編號) {
		this.編號 = 編號;
	}

	public String get膚色() {
		return 膚色;
	}

	public String get分類() {
		return 分類;
	}

	public String get編號() {
		return 編號;
	}

	public void 跳(){
		System.out.println("皮卡丘跳起來!!");
	}

	public void 吃(){
		System.out.println("皮卡丘吃起來!!");
	}

	public void 拍手(){
		System.out.println("皮卡丘向你招手!!");
	}
}
