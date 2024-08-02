package com.example.ASM2_anltph42399.TinhTich;

public class TinhTich {
    public static int TinhTich(int a, int b) {
        if (a % 1 != 0 || b % 1 != 0) {
            throw new IllegalArgumentException("ab phai la so nguyen");
        }
        return a * b;
    }
}
