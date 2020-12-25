package poly.kansai.enshu;

import java.util.Scanner;

public class UseRunnableTimer {

	public static void main(String[] args) {

		//キーボードから秒数を取得
		int inputTime = getTime();

		//スレッドスタート
		Runnable timeS = new RunnableTimer(inputTime);
		Thread t1 = new Thread(timeS);
		t1.start();

	}

	//キーボードから秒数を取得する自作メソッド
	static int getTime() {
		Scanner sc = new Scanner(System.in);
		System.out.print("時間を計測します。秒数を入力してください：");
		return sc.nextInt();
	}

}
