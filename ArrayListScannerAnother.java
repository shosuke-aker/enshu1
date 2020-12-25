package poly.kansai.enshu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScannerAnother {
	public static void main(String[] args) {
		//入力を一時保存するためのarraylist
		ArrayList<Integer> score = new ArrayList<>();
		//入力用メソッドの呼び出しとデータの代入
		score = inputScore();
		//結果の出力
		showResultScore(score);
	}
	//入力用メソッド
	static ArrayList<Integer> inputScore(){

		//arraylist,scanner,確認用int型変数宣言
		ArrayList<Integer> input = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);

		int check = 0;

		//-1が入力されるまで入力を続ける（文字列が入力されると例外発生）
		while(true) {
			System.out.print("数字を入力してください:");

			check = scan.nextInt(); //確認用変数に入力を一時保存

			if(check != -1) { //-1以外ならデータを追加

				input.add(check);

			}else if(check == -1) { //-1ならループ処理の終了
				System.out.println("入力を終了します。");
				break;
			}

		}
		return input;
	}

	static void showResultScore(ArrayList<Integer> score) {

		System.out.println("結果を出力します。");

		for(int i = 0;i < score.size();i++) { //arraylist内の格納されている要素数分繰り返し
			System.out.println((i+1) + "番目の入力は" + score.get(i));
		}
	}

}