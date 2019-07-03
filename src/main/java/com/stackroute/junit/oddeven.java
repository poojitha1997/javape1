package com.stackroute.junit;

import java.util.Scanner;

//program to check odd and even
public class oddeven
{

    public String oddevencheck(int num)
    {
        if((num>=20)&&(num<=30))
        {
            if(num%2==0) //return jerry if number is even number
                return "Jerry";

            else
                return "Tom"; //return tom if number is odd number
        }
        else
            return "Error";

    }





}
