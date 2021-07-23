package org.Task;
import java.util.Random;

public class Solution {

    final Random random = new Random();

    public int solution(int [] array) {
        int n = 0;
        n = checkException(array, n);
        setArray(array, n);
        int countzero = 0;
        int countsone = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0){
                countzero++;
            }
            else if (array[i] == 1) {
                countsone++;
            }
        }
        getArray(array);
        return countsone < countzero ? countsone : countzero;
    }

    private int checkException(int[] array, int n) {
        if (n <= 100) {
            n = array.length;
        }
        else {
            System.out.println("The number of coins was entered incorrectly, enter less than or equal to 100");
            System.exit(0);
        }
        return n;
    }

    private void getArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private void setArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(2);
        }
    }
}
