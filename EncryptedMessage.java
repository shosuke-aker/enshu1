package poly.kansai.enshu;

public class EncryptedMessage {

    public static void main(String[] args) {
        String cryptedMessage = getCryptedMessage();
        String encryptedMessage = getEncryptedMessage(cryptedMessage);
        showResult(cryptedMessage, encryptedMessage);

    }

    static String getCryptedMessage() {
        return "こぶはるあじおぷめんうててぬのACJQOABRVEZAIO";
    }

    static String getEncryptedMessage(String message) {
        String str = "";
        for (int i = 0; i < message.length(); i++) {
            if (i % 3 == 2) {
                str += message.charAt(i);
            }
        }
        return str;
    }

    static void showResult(String cryptStr, String encryptStr) {
        System.out.printf("暗号化された電文 : %s%n", cryptStr);
        System.out.printf("復号された電文   : %s%n", encryptStr);
    }
}
