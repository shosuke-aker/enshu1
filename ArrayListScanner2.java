package poly.kansai.enshu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListScanner2 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> score = new ArrayList<>();

		score = inputScore();

		showResultScore(score);
	}

	static ArrayList<Integer> inputScore(){

		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);

		while(true) { //-1が入力されたときのみ無限ループを抜ける

			System.out.print("数字を入力してください:");
			try {
				//input配列に入力を追加する
				input.add(scan.nextInt());
				//追加された入力が-1ならデータを削除し、ループを抜ける。
				if(input.get(input.size()-1) == -1) {
					input.remove(input.size()-1);
					System.out.println("入力を終了します。");
					break;
				}else if(input.get(input.size()-1) > 100 || input.get(input.size()-1) < 0) { //input.size()-1 → count変数のほうが見やすい
					input.remove(input.size()-1);
					System.out.println("無効な範囲の入力です。今回の入力を削除します。");
				}

			}
			catch(InputMismatchException e) {

				System.out.println("エラー：整数以外の入力がされました。");
				scan.nextLine();

			}
			catch(Exception e) {
				System.out.println("想定外のエラー");
				scan.nextLine();
				for(int i = input.size()-1;i >= 0;i--) {
					input.remove(i);
				}
				break;
			}
			
		}
		
		//-1が入力されたときのみ無限ループを抜けてリターン
		return input;
	}

	static void showResultScore(ArrayList<Integer> score) {
		System.out.println("結果を出力します");
		for(int i = 0;i < score.size();i++) {
			System.out.println((i+1) + "番目の入力は" + score.get(i));
		}
	}


}
