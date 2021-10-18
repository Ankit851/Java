package com.Ankit;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        int p = si.nextInt();
        int r = si.nextInt();
        int t = si.nextInt();
        float sim = (p * r * t / 100f);
        System.out.println(sim);
    }
}
