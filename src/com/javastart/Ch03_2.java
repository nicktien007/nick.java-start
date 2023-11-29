package com.javastart;


import java.util.ArrayList;
import java.util.List;

/**
 * List
 */
public class Ch03_2 {


	public static void main(String[] args) {

		//宣告一個String List

		List<String> listStrings = new ArrayList<>();

		//泛型不支援基礎型別，例如：int、char、boolean
//		List<char> listInts = new ArrayList<char>();


		//Java 有針對各基礎型別，做封裝
		//int ==>Integer
		//boolean ==> Boolean
		//char ===> Character
		List<Integer> integers = new ArrayList<>();

		System.out.println(listStrings.size());

		//調用list add
		listStrings.add("nick");
		listStrings.add("emma");
		System.out.println(listStrings.size());

		//取出list的資料
		System.out.println(listStrings.get(0));

		String name = listStrings.get(1);
		System.out.println(name);

		listStrings.set(0, "apple");

		System.out.println(listStrings.get(0));

	}
}
