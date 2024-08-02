package com.example.ASM2_anltph42399.TinhHieu;

public class TinhHieu {
    public static int TinhHieu(int a ,int b){
        if (a%1!=0 || b%1!=0) {
            throw new IllegalArgumentException("la so nguyen");
        }
        return (a-b);
    }
    }

