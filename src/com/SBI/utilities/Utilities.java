package com.SBI.utilities;

public class Utilities {
    public static String pad(int n) {
        if (n < 0)
            n = -n;
        if (n < 10)
            return "0" + n;
        return "" + n;
    }
    public static boolean checkString(String s)
    {
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {

            }
            else {
                return false;
            }

        }
        return true;
    }

}
