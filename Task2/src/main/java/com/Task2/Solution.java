package com.Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(String s) {
        String [] setences = s.split("\\s*(\\?|!|\\.)\\s*");
        return  getCountWords(setences);
    }

    private int getCountWords(String[] setences) {
        int index = 0;
        int maxCountWords = 0;
        for (int i = 0; i < setences.length ; i++) {
            String [] word = setences[i].split("\\s+");
            if (maxCountWords < word.length) {
                maxCountWords = word.length;
                index = i;
            }
        }
        System.out.println("Sentense with max count words - " + setences[index]);
        return maxCountWords;
    }
}
