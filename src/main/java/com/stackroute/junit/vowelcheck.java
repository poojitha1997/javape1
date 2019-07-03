package com.stackroute.junit;

import java.util.Scanner;

//program to check whether is vowel or consonant
public class vowelcheck
{
    public String check(String str)
    {
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            //condition for vowel if character is a,i,e,o,u
            if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='o'||str.charAt(i)=='U'||str.charAt(i)=='A'||str.charAt(i)=='I'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                 str1=str1.concat("v");
            }
            //condition for consonant
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                str1 = str1.concat("c");

            }
        }
        if(str1!=null)
            return str1;
        else
        return "ERROR it is not a letter";
    }


}
