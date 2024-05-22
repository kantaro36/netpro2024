public class DinnerFullCource {

	// public static void main(String[] args) {

	// 	Dinner dinner = new Dinner();
	// 	dinner.eat3Dishes();
	// }

    private Dish[] list = new Dish[5];// [0]-[4]の計5個

	public static void main(String[] args) {

		DinnerFullCource fullcourse = new DinnerFullCource();
		fullcourse.eatAll();
	}

	DinnerFullCource() {

		list[0] = new Dish();
		list[0].setName("たらこパスタ");
		list[0].setValune(800);

		list[1] = new Dish();
		list[1].setName("カルボナーラ");
		list[1].setValune(900);
		
		list[2] = new Dish();
		list[2].setName("ボロネーゼ");
		list[2].setValune(800);

        list[3] = new Dish();
		list[3].setName("ボンゴレパスタ");
		list[3].setValune(1000);

        list[4] = new Dish();
		list[4].setName("しらすときのこの和風パスタ");
		list[4].setValune(900);
		

	}// Dinnerコンストラクターエンド

	void eatAll() {
		for(int i = 0; i < list.length; i ++){
			System.out.println("料理名" + list[i].getName() + "値段" + list[i].getValune());
		}
		// String str1 = "料理名" + dish1.getName() + "値段" + dish1.getValune();
		// String str2 = "料理名" + dish2.getName() + "値段" + dish2.getValune();
		// String str3 = "料理名" + dish3.getName() + "値段" + dish3.getValune();
		// String str4 = "料理名" + dish4.getName() + "値段" + dish4.getValune();
		// String str5 = "料理名" + dish5.getName() + "値段" + dish5.getValune();
		// System.out.println(str1);
		// System.out.println(str2);
		// System.out.println(str3);
		// System.out.println(str4);
		// System.out.println(str5);
	}// eat end

	// cook3Dishes()

}//Dinner end