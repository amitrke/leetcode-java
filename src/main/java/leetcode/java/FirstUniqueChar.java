package leetcode.java;

import java.util.HashSet;

class FirstUniqueChar {
    public int firstUniqChar(String s) {
        if (s.length() < 1){
            return -1;
        }
        if (s.length() == 1){
            return 0;
        }
        
        HashSet<Character> repeatedSet = new HashSet<>();
        
        for (int i=0; i<s.length()-1; i++){
            char c = s.charAt(i);
            if (repeatedSet.contains(c)){
                continue;
            }
            boolean hasRepeated = false;
            for (int j=i+1; j<s.length(); j++){
                if (c == s.charAt(j)){
                    hasRepeated = true;
                    repeatedSet.add(c);
                    break;
                }
            }
            if (!hasRepeated){
                return i;
            }
        }
        if (!repeatedSet.contains(s.charAt(s.length()-1))){
            return s.length()-1;
        }
        return -1;
    }
}
