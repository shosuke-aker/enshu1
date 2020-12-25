package poly.kansai.enshu;

public class SplitScore {

    public static void main(String[] args) {
        String scoreStr = "65,59,72,85,66";

        String[] scores = scoreStr.split(",");

        int total = 0;
        for (String score : scores) {
            total += Integer.parseInt(score);
        }

        System.out.println("点数一覧 : " + scoreStr);
        System.out.println("合計 : " + total);
    }

}
