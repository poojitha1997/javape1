package  com.stackroute.junit;

public class App
{
    public String concatAndConvertString(String str1, String str2) {
        if(str1==null || str2==null)
        {
            return "string is null";
        }
        String concatedString = str1.concat(str2);
        return concatedString.toUpperCase();
    }

}
