package com.stackroute.junit;

public class StringRev
{
    //method to reverse the character
    public String reverse(String str)
    {
        int length=str.length();
        String reverse=" ";
        for(int i=length-1;i>=0;i--)
        {
            reverse = reverse + str.charAt(i); //concatenating the string str to string named reverse

        }
        return reverse;

  }


}
