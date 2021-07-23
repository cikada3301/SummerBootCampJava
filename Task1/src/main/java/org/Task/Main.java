package org.Task;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of coins, please");
        int number = new Scanner(System.in).nextInt();
        Solution solution = new Solution();
        System.out.println("Minimum number of coins that must be reversed " + solution.solution(new int [number]));
    }
}
