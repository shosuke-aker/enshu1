package poly.kansai.enshu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayWeek {

	public static void main(String[] args) {
		//Dateクラスのインスタンスを生成
		Date date = new Date();

		//SimpleDateFormatクラスのインスタンスを生成
		SimpleDateFormat sdf = new SimpleDateFormat("(E)");

		//書式を（曜日）で整形
		String text = sdf.format(date);

		//表示
		System.out.println(text);
	}
}
