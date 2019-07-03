package com.stackroute.junit;


//program to print the pattern
public class loop {
    public String print(int num) {
        String str = "";
        if (((num >= 97) && (num <= 122) || ((num >= 65) && (num <= 90))))
            return "Error";

        for (int temp = 1; temp <= num; temp++) {
            for (int j = temp; j > 0; j--) {
                str = str + temp;
            }
        }
        return str;
    }
}

