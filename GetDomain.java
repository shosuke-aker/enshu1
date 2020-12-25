package poly.kansai.enshu;

import java.util.Scanner;

public class GetDomain {

    public static void main(String[] args) {
//        String text="hoge@example.com";
//        int pos=text.indexOf("@");
//        String user=text.substring(0,pos);
//        System.out.println(user);

        String mailAddress = getMailAddress(); // メールアドレスの取得

        boolean isMailAddress = checkMailAddress(mailAddress); // メールアドレスのチェック

        if (isMailAddress) { // チェック結果によって処理の分岐
            String user = getUser(mailAddress); // ユーザ名の取得
            String domain = getDomain(mailAddress); // ドメイン名の取得
            showResult(user, domain); // 結果の表示
        } else { // 不適切なメールアドレスの場合
            showError(mailAddress); // エラーメッセージの表示
        }
    }

    static String getMailAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.print("メールアドレスの入力 : ");
        return sc.nextLine();
    }

    static boolean checkMailAddress(String mailAddress) {
        if (mailAddress.indexOf("@") == -1) { // @が1つ含まれているか？
            return false;
        } else if (mailAddress.indexOf("@") != mailAddress.lastIndexOf("@")) { // @が2個以上含まれているか？
            return false;
        } else { // 適切な書式の場合
            return true;
        }
    }

    static String getUser(String mailAddress) {
        int pos = mailAddress.indexOf("@");
        return mailAddress.substring(0, pos);
    }

    static String getDomain(String mailAddress) {
        int pos = mailAddress.indexOf("@");
        return mailAddress.substring(pos + 1);
    }

    static void showResult(String user, String domain) {
        System.out.println("\nユーザ名   : " + user);
        System.out.println("ドメイン名 : " + domain);
    }

    static void showError(String mailAddress) {
        System.out.printf("%n入力されたメールアドレス[%s]は不適切なアドレスです%n", mailAddress);
    }
}
