package com.stackroute.junit;

import java.util.Arrays;
import java.util.Scanner;

//program to sort the numbers
public class SortNumber
{
    public String sort(String number)
    {
        int sum=0;
        String str="";
        int length= number.length();
        char tempArray[] = number.toCharArray();
        Arrays.sort(tempArray);
        String original = new String(tempArray);
        StringBuilder stringBuilder = new StringBuilder(original);
        original = stringBuilder.reverse().toString();
        str=str.concat("Sorted number in non-increasing order ").concat(original);
        for(int i=0;i<length;i++)//sorting the digits in the number
        {
            int j = Character.getNumericValue(original.charAt(i));
            if(j%2==0)
            {
                sum=sum+j;
            }
        }

        str=str+"sum of even numbers is "+sum;//calculating the sum
        if(sum>15)
            return  str=str+" true";
        else
            return str=str+" false";


    }

}


