package leetcode.java;

import java.util.HashMap;
import java.util.Map;

public class IntegerToEnglish {

    private Map<Integer, String> unit;
    private Map<Integer, String> tenths;

    IntegerToEnglish(){
        unit = new HashMap<>();
        unit.put(1, "One");
        unit.put(2, "Two");
        unit.put(3, "Three");
        unit.put(4, "Four");
        unit.put(5, "Five");
        unit.put(6, "Six");
        unit.put(7, "Seven");
        unit.put(8, "Eight");
        unit.put(9, "Nine");
        unit.put(10, "Ten");
        unit.put(11, "Eleven");
        unit.put(12, "Twelve");
        unit.put(13, "Thirteen");
        unit.put(14, "Fourteen");
        unit.put(15, "Fifteen");
        unit.put(16, "Sixteen");
        unit.put(17, "Seventeen");
        unit.put(18, "Eighteen");
        unit.put(19, "Nineteen");

        tenths = new HashMap<>();
        tenths.put(20, "Twenty");
        tenths.put(30, "Thirty");
        tenths.put(40, "Forty");
        tenths.put(50, "Fifty");
        tenths.put(60, "Sixty");
        tenths.put(70, "Seventy");
        tenths.put(80, "Eighty");
        tenths.put(90, "Ninety");
    }

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        String resp = "";
        int bil = num/1000000000;
        if (bil > 0){
            resp += hundred(bil)+" Billion";
            num = num % 1000000000;
            resp += num > 0? " ": "";
        }
        int mil = num/1000000;
        if (mil > 0){
            resp += hundred(mil)+" Million";
            num = num%1000000;
            resp += num > 0? " ": "";
        }
        int thousand = num/1000;
        if (thousand > 0){
            resp += hundred(thousand)+" Thousand";
            num = num%1000;
            resp += num > 0? " ": "";
        }
        resp += hundred(num);
        System.out.println(resp); 
        return resp;
    }

    private String hundred(int num){
        String resp = "";
        int h = num/100;
        if (h > 0){
            resp += this.unit.get(h) + " Hundred";  
        }
        num = num%100;
        if (num > 0){
            if (h > 0){
                resp += " ";
            }
            resp += this.two(num%100);
        }
        return resp;
    }

    private String two(int num){
        if (this.unit.containsKey(num)) {
            return this.unit.get(num);
        } else if (this.tenths.containsKey(num)) {
            return this.tenths.get(num);
        }else {
            int ones = num % 10;
            int tenth = num - ones;
            return this.tenths.get(tenth) + " "+this.unit.get(ones);
        }
    }

}