package com.develogical;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

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
            String[] parts = query.split("%20");
            int num1 = Integer.parseInt(parts[3]);
            int num2 = Integer.parseInt(parts[5]);
            return String.valueOf(num1 + num2);
        }
        else if (query.toLowerCase().contains("largest")) {
            String[] parts = query.split("%20");
            int num1 = Integer.parseInt(parts[9]);
            int num2 = Integer.parseInt(parts[10]);
            int num3 = Integer.parseInt(parts[11]);
            int num4 = Integer.parseInt(parts[12]);
            int max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
            return String.valueOf(max);
        }
        return "";
    }
}
