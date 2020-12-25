package poly.kansai.enshu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EnhanceFor {
	public static void main(String[] args) {
		//入力を一時保存するためのarraylist,sum,average,max
		ArrayList<Integer> score = new ArrayList<>();
		int sum = 0;
		double average = 0;
		int max = 0;
		//入力用メソッドの呼び出しとデータの代入
		score = inputScore();
		//足し算メソッド呼び出し
		sum = sumMethod(score);
		//平均メソッド呼び出し
		average = averageMethod(score);
		//最高値メソッド呼び出し
		max = maxMethod(score);
		//結果の出力
		showResultScore(score,sum,average,max);
	}
	//入力用メソッド
	static ArrayList<Integer> inputScore(){

		//arraylist,scanner,確認用int型変数宣言
		ArrayList<Integer> input = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);

		int check = 0;

		try {
		//-1が入力されるまで入力を続ける（文字列が入力されると例外発生）
		while (true) {
			System.out.print("0～100の整数を入力してください:");

			check = scan.nextInt(); //確認用変数に入力を一時保存

			if (check != -1) { //-1以外ならデータを追加
				if (-1 < check && check < 101) {
					input.add(check);
				} else {
					System.out.println("無効な範囲です。入力は0～100です。");
				}

			} else if (check == -1) { //-1ならループ処理の終了
				System.out.println("入力を終了します。");
				break;
			}
		}
		}catch(InputMismatchException e) { //nextIntにInt型以外が入力された時の例外をキャッチ(

			System.out.println("整数以外が入力されました。");

		}catch(Exception e) { //上でキャッチする例外以外をキャッチし、不正な操作の可能性が高いのでデータ初期化

			input.clear();
			System.out.println("不正な操作が実行されました。データを消去します。");

		}

		//キャッチまたは無限ループ抜けでinput配列を返す
		return input;

	}

	static int sumMethod(ArrayList<Integer> score) {
		int sum = 0;
		for(int element: score) {
			sum += element;
		}

		return sum;
	}

	static double averageMethod(ArrayList<Integer> score) {
		double ave = 0;
		int sum = 0;

		for(int element: score) {
			sum += element;
		}
		if(score.size() != 0) {
			ave = (double)sum/score.size();
		}else {
			ave = 0;
		}

		return ave;
	}

	static int maxMethod(ArrayList<Integer> score) {
		int max = 0;

		if(score.size() > 0) {
			max = score.get(0);
		}

		for(int element: score) {
			if(max < element) {
				max = element;
			}
		}

		return max;
	}

	static void showResultScore(ArrayList<Integer> score,int sum,double average,int max) {

		System.out.println("結果を出力します。");

		for(int i = 0;i < score.size();i++) { //arraylist内の格納されている要素数分繰り返し
			System.out.println((i+1) + "番目の入力は" + score.get(i));
		}
		System.out.println("----------------------------");
		if(score.size()!=0) {
			System.out.printf("合計点：%d%n平均点：%.2f%n最高点：%d%n",sum,average,max);
		}else {
			System.out.println("入力が見つかりませんでした");
		}
	}

}