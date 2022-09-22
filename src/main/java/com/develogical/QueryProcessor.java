package com.develogical;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {
    private String cutComma(String s) {
        return s.substring(0, s.length() - 1);
    }
    public String process(String query) {
        System.out.println("------------------");
        System.out.println(query);
        System.out.println("--------------");

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("name")) {
            return "basic-web-0";
        }
        else if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            int num1 = Integer.parseInt(parts[3]);
            int num2 = Integer.parseInt(parts[5]);
            return String.valueOf(num1 + num2);
        }
        else if (query.toLowerCase().contains("largest")) {
            String[] parts = query.split(" ");
            int num1 = Integer.parseInt(cutComma(parts[9]));
            int num2 = Integer.parseInt(cutComma(parts[10]));
            int num3 = Integer.parseInt(cutComma(parts[11]));
            int num4 = Integer.parseInt(parts[12]);
            int max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
            return String.valueOf(max);
        }
        else if (query.toLowerCase().contains("multiplied by")) {
            String[] parts = query.split(" ");
            int num1 = Integer.parseInt(parts[3]);
            int num2 = Integer.parseInt(parts[6]);
            return String.valueOf(num1 * num2);
        }
        return "";
    }
}
