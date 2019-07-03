package com.stackroute.junit;

import static java.lang.Character.isDigit;

//program for checking the speciality of character
public class LetterCheck
{
    public String  checkInput(char ch)
    {
        if ((ch >= 97) && (ch <= 122))//checking for lower case letter
            return "Lower case letter";
        else if ((ch >= 65) && (ch <= 90))//checking from upper case letter
            return "Capital letter";
        else if ((ch >= 48) && (ch <= 57))//checking for numbers
            return "Digit";
        else if((ch>0 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96) ||(ch>=123 && ch<=127))//condition for special charecters
            return "Special symbols";
        return "Error";
    }



}
