import com.Task2.Solution;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the text");
        Solution solution = new Solution();
        int maxCountWords = solution.solution(new Scanner(System.in).nextLine());
        System.out.println("Max count words of setences in text = " + maxCountWords);
    }
}