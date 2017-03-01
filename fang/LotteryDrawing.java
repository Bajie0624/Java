package com.company;

import java.lang.reflect.Array;
import  java.util.*;
public class LotteryDrawing {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw");
        int k = in.nextInt();

        System.out.println("What's the highest number you can draw");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + i;

        }

        int[] result = new  int[k];
        for (int i = 0; i < result.length; i++){
            int r = (int) (Math.random() *n);
            numbers[r] = numbers[n- 1];
        }

        Arrays.sort(result);
        System.out.println("Bet the follow cambination. It'll make you rich");
        for (int r : result)
            System.out.println(r);
    }
}
