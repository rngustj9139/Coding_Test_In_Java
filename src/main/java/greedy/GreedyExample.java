/**
 * public static void main(String[] args) { // static 변수 (Thread Safety, 메모리 해제 안되는 문제 발생 가능) 는 모든 인스턴스가 공유 가능 static 함수는 인스턴스를 생성하지 않고도 호출 가능, 클래스 내부 클래스 선언시 static을 내부 클래스에 붙여야함
 *         System.out.println("Hello and welcome!");
 * }
 */
// 거스름돈 문제
package greedy;
import java.util.*;

public class GreedyExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 1260 입력
        sc.close();
        Integer[] coins = {500, 100, 50, 10};
        int result = 0;

        Arrays.sort(coins, Collections.reverseOrder());
        for (int coin : coins) {
            result += (N / coin);
            N = (N % coin);
        }

        System.out.println(result);
    }

}


