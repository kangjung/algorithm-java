package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://leetcode.com/problems/string-to-integer-atoi/
public class leetcode8 {
    public static void main(String[] args) {
        System.out.println(new leetcode8().myAtoi("42"));
        System.out.println(new leetcode8().myAtoi("   -42"));
        System.out.println(new leetcode8().myAtoi("4193 with words"));
    }

    private int myAtoi(String s) {
        int result = 0;

        s = s.stripLeading();

        Pattern pattern = Pattern.compile("^[+-]?[0-9]+");
        Matcher matcher = pattern.matcher(s);

        if(matcher.find()){
            try{
                result = Integer.parseInt(matcher.group());
            }catch(Exception e){
                System.out.println(result);
                return s.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return result;
    }
}