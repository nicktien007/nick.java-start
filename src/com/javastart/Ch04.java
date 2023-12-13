package com.javastart;


/**
 * if and switch
 */
public class Ch04 {


	public static void main(String[] args) {
		//if
		int grade = 30;

//		if (grade >= 60) {
//			System.out.println("通過測驗!!");
//		}

		//if else
		String state = "";
		if (grade >= 60) {
			state = "通過測驗!!";
		}else {

			state = "加油，再接再厲";
		}

//		System.out.println("考試結果：" + state);
		state = grade >= 60 ? "通過測驗!!" : "加油，再接再厲";
		System.out.println("考試結果：" + state);
		System.out.println("考試結果：" + (grade >= 60 ? "通過測驗!!" : "加油，再接再厲"));


		// if elseif
		int age = 90;

		if (age < 18) {
			System.out.println("未成年");
		}else if(age >=18 && age <=30){
			System.out.println("青壯年");
		}else if(age >=31 && age <=50){
			System.out.println("中年");
		}else {
			System.out.println("老年");
		}


		//switch

		Days day = Days.星期二;

		switch (day){
			case 星期一:
				System.out.println("星期一，猴子穿新衣");
				break;
			case 星期二:
				System.out.println("星期二，猴子肚子餓");
				break;
			case 星期三:
				System.out.println("星期三，猴子去爬山");
				break;
			case 星期四:
				System.out.println("星期四，猴子看電視");
				break;
			case 星期五:
				System.out.println("星期五，猴子去跳舞");
				break;
			case 星期六:
				System.out.println("星期六，猴子去斗六");
				break;
			case 星期日:
				System.out.println("星期日，猴子過生日");
				break;
			default:
				System.out.println("混混噩噩");
				break;

		}
	}

	public enum Days{
		星期一,
		星期二,
		星期三,
		星期四,
		星期五,
		星期六,
		星期日
	}
}
