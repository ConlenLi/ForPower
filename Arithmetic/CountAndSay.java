import java.util.Formatter;

/**
 * ��������
 *
 * ����������ָһ���������У��������е�������˳����б������õ���һ��������ǰ�������£�

 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if ( n == 1)
        return "1";
        String str = "1";
        while (n-- > 0){
            for (int i = 0; i < str.length(); i++) {

            }
        }
        return "";
    }

    public static void main(String[] args) {
        int d = 15;
        double b = 25.22;
        String str = "xtt";
        String str1 = "xttsssss";
        double b1 = 27.2222222;
        int d1 = 16;
        CountAndSay countAndSay = new CountAndSay();
        countAndSay.countAndSay(5);
        Formatter f = new Formatter(System.out);
        f.format("%s ���� %d ���ˣ����� %f ����\n",str,d,b);
        f.format("%.1s ���� %d ���ˣ����� %f ����",str1,d1,b1);
    }
}
