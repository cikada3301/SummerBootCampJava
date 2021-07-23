package org.Task3;

public class Solution {
    public int solution (int A) {
        String output = "";
        if (A >= 0 && A <= 100000000)
        {
            String input = Integer.toString(A);
            char [] numberOfChars = input.toCharArray();
            for (int i = 0; i < numberOfChars.length; i++)
            {
                if (i % 2 == 0)
                {
                    output += numberOfChars[i/2];
                }
                else
                {
                    output += numberOfChars[numberOfChars.length - (i/2+1)];
                }
            }

        }
        return Integer.parseInt(output);
    }
}
