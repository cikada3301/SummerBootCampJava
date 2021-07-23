import org.Task3.Solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number for shuffle");
        Solution solution = new Solution();
        System.out.println(solution.solution(new Scanner(System.in).nextInt()));
    }
}
