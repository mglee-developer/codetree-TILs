import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String phoneNum = sc.nextLine();

        String front = phoneNum.substring(0, 3);
        String mid = phoneNum.substring(4, 8);
        String end = phoneNum.substring(9, 13);

        System.out.printf("%s-%s-%s",front, end, mid);
    }
}