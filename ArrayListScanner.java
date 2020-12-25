package poly.kansai.enshu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScanner {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> score = new ArrayList<>();
		
		score = inputScore();
		
		showResultScore(score);
	}
	static ArrayList<Integer> inputScore(){
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("数字を入力してください:"
					+ "");
			input.add(scan.nextInt());
			if(input.get(input.size()-1) == -1) {
				input.remove(input.size()-1);
				System.out.println("入力を終了します。");
				break;
			}
		}
		return input;
	}
	
	static void showResultScore(ArrayList<Integer> score) {
		System.out.println("結果を出力します");
		for(int i = 0;i < score.size();i++) {
			System.out.println((i+1) + "番目の入力は" + score.get(i));
		}
	}

}
