package poly.kansai.enshu;

import java.util.Calendar;

public class CheckNoOvertimeDay {

	public static void main(String[] args) {

		// ノー残業日の曜日を格納する配列
		// 配列を利用することで複数のノー残業日の曜日を格納することができる
		int[] noOvertimeDays = { Calendar.MONDAY, Calendar.WEDNESDAY };

		// 今日の日にちを文字列で取得する
		String today = getToday();

		// 今日がノー残業デーかどうかをチェックする
		boolean isDay = isNoOvertimeDay(noOvertimeDays);

		// 結果の表示
		showResult(today, isDay);
	}

	// 今日の日付を文字列で返す自作メソッド
	static String getToday() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		return year + "年" + month + "月" + day + "日";
	}

	// 今日がノー残業日かどうかをチェックする自作メソッド
	// 実行する際、ノー残業日(曜日)が格納されている配列を受け取る
	static boolean isNoOvertimeDay(int[] noOvertimeDays) {
		boolean flag = false; // ノー残業日かどうかを格納する変数
		// 今日の曜日を取得
		Calendar cal = Calendar.getInstance();
		int youbi = cal.get(Calendar.DAY_OF_WEEK);
		// ノー残業日(曜日)が設定されている配列から1個ずつデータを取り出す
		// 配列内にはノー残業日の曜日が格納されている
		for (int i = 0; i < noOvertimeDays.length; i++) {
			// 今日の曜日がノー残業日の曜日と等しいかどうかのチェック
			if (youbi == noOvertimeDays[i]) {
				flag = true; // 等しければ今日はノー残業日
				break; // ノー残業日が確定したので他の曜日のチェックは不要
			} else {
				// 今日の曜日がノー残業日の曜日と一切一致しなかった場合
				flag = false; // 今日はノー残業日ではない
			}
		}
		return flag; // ノー残業日かどうかの判定結果を返す
	}

	static void showResult(String today, boolean isDay) {
		String result = ""; // ノー残業日かどうかのメッセージを格納
		// 今日がノー残業日かどうかのチェック
		if (isDay) {
			result = "今日はノー残業日です!!";
		} // ノー残業日でなければ、メッセージは空のまま
		System.out.printf("%s %s%n", today, result);
	}
}
