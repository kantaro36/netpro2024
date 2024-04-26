import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou3 {
    public static void main(String[] args) { 

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		try {
			System.out.println("何歳ですか?");
			String line = reader.readLine();
			int age = Integer.parseInt(line);
			
			int year = 2024 - age;
			if(38 <= (year - 1868 + 1) && (year - 1868 + 1) <= 44){ 
				System.out.println("あなたは2030年では" + (age + 6) + "歳ですね。");
				System.out.println("あなたは明治" + (year - 1868 + 1) + "年生まれです。");
			}
			
			if(0 <= (year - 1912 + 1) && (year - 1912 + 1) <= 14){ 
				if((year - 1912 + 1) == 1){
					System.out.println("あなたは大正元年生まれです。");
				}
				else{
				System.out.println("あなたは大正" + (year - 1912 + 1) + "年生まれです。");
				}
			}
			if(0 <= (year - 1926 + 1) && (year - 1926 + 1) <= 63){ 
				if((year - 1926 + 1) == 1){
					System.out.println("あなたは昭和元年生まれです。");
				}
				else{
				System.out.println("あなたは昭和" + (year - 1926 + 1) + "年生まれです。");
				}
			}

			if(0 <= (year - 1989 + 1) && (year - 1989 + 1) <= 30){ 
				if((year - 1989 + 1) == 1){
					System.out.println("あなたは平成元年生まれです。");
				}
				else{
				System.out.println("あなたは平成" + (year - 1989 + 1) + "年生まれです。");
				}
			}

			if(0 <= (year - 2019 + 1) && (year - 2019 + 1) <= 6){ 
				if((year - 2019 + 1) == 1){
					System.out.println("あなたは令和元年生まれです。");
				}
				else{
				System.out.println("あなたは令和" + (year - 2019 + 1) + "年生まれです。");
				}
			}

			if(age < 0 || 120 <= age){
				System.out.println("もう一度入力してください。");
			}

			// if(reader = "q"){
				
			// }
			//System.out.println("あなたは" + age + "歳ですね。");
			//System.out.println("あなたは10年後、" + (age + 10) + "歳ですね。");
		}
		catch(IOException e) {
			System.out.println(e);
		}


	}
}
