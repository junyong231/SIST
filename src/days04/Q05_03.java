package days04;

import java.util.Scanner;

/**
 * @author JUNYONG_HOME
 * @date 2024. 7. 5. - 오전 1:09:37
 * @subject 챗지피티 풀이인데 틀림 ㅋㅋ ㅄ
 * @content
 */
public class Q05_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 m 입력 받기
        System.out.print("첫 번째 정수 m을 입력하세요: ");
        int m = scanner.nextInt();

        // 정수 n 입력 받기
        System.out.print("두 번째 정수 n을 입력하세요: ");
        int n = scanner.nextInt();

        scanner.close();

        // m과 n 사이의 정수들의 합을 구하기
        int sum = 0;
        // m이 n보다 작거나 같은 경우
        if (m <= n) {
            for (int i = m; i <= n; i++) {
                sum += i;
            }
        } else {  // m이 n보다 큰 경우
            for (int i = n; i <= m; i++) {
                sum += i;
            }
        }

        // 결과 출력
        System.out.println(m + "부터 " + n + "까지의 정수의 합은 " + sum + "입니다.");
    }
}

