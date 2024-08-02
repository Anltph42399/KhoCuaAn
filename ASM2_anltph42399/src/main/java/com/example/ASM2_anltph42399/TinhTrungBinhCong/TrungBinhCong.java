package com.example.ASM2_anltph42399.TinhTrungBinhCong;

public class TrungBinhCong {
    public static int TrungBinhCong(int[] numbers){
        if (numbers.length == 0){
            throw new ArrayStoreException("rỗng");
        }
        int sum = 0;
        for (int number : numbers) {
            sum+=number;
        }
        return sum/numbers.length;
    }


}
