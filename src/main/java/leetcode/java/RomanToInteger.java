package leetcode.java;

import java.util.HashMap;

public class RomanToInteger {
    private HashMap<String, Integer> symbolTable = new HashMap<>();
    
    RomanToInteger() {
        this.symbolTable.put("I", 1);
        this.symbolTable.put("V", 5);
        this.symbolTable.put("X", 10);
        this.symbolTable.put("L", 50);
        this.symbolTable.put("C", 100);
        this.symbolTable.put("D", 500);
        this.symbolTable.put("M", 1000);
    }
    
    public int romanToInt(String s) {
        int num = 0;
        int prevDigit = 0;
        for(int i=s.length()-1; i>=0; i--){
            String c = s.substring(i, i+1);
            int currDigit = this.symbolTable.get(c);
            if (num > 0 && prevDigit != 0 && prevDigit > currDigit){
                num -= currDigit;
            } else {
                num += currDigit;
                prevDigit = currDigit;
            }
        }
        
        return num;
    }
}
