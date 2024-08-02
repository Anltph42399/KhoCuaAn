package com.example.ASM2_anltph42399.TinhTong;

public class TinhTong {
    public static int TinhTong(int a ,int b){
        if (a%1!=0 || b%1!=0){
            throw new  IllegalArgumentException("Phải là Số Nguyên");
        }
        return a+b ;
    }
}
