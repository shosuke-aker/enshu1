package poly.kansai.enshu;

public class RunnableTimer implements Runnable {

	private int time;

	//コンストラクタ
	RunnableTimer(int time) {
		this.time = time;
	}

	@Override
	public void run() {
		try {
			//-----------------------演習1
//			for (int i = 0; i < time; i++) {
//				Thread.sleep(1000);
//				System.out.println((i + 1) + "秒経過");
//			}
			//-----------------------演習2
			for (int i = 0; i < time; i++) {
				if (i != 0 && i % 10 == 0) {
					System.out.println(i + "秒経過");
				}
				Thread.sleep(1000);
				System.out.print("*");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(time + "秒経過しました。終了します");
	}

}
