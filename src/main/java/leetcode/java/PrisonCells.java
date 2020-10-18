package leetcode.java;

import java.util.Arrays;
import java.util.HashMap;

class PrisonCells {
    public int[] prisonAfterNDays(int[] cells, int N) {
        HashMap<String, ObjStorage> seen = new HashMap<>();
        boolean seenBefore = false;

        for (int day=1; day <= N; day++){
            int[] nextDay = nextDay(cells);
            String dayState = Arrays.toString(nextDay);
            if (seen.containsKey(dayState)){
                seenBefore = true;
                break;
            } else {
                seen.put(dayState, new ObjStorage(day, nextDay));
            }
            cells = nextDay;
            //System.out.println("Day "+day+": "+Arrays.toString(nextDay));
        }

        if (seenBefore){
            int nSkipBlock = N % seen.size();
            System.out.println("nSkipBlock "+nSkipBlock+":");
            for (String key: seen.keySet()){
                if (seen.get(key).n == nSkipBlock){
                    System.out.println(Arrays.toString(seen.get(key).cells));
                    cells = seen.get(key).cells;
                }
            }
        }

        return cells;
    }
    
    private int[] nextDay(int[] cells){
        int[] response = new int[cells.length];
        for (int i=1; i<cells.length-1; i++){
            if (cells[i-1] == cells[i+1]){
                response[i] = 1;
            }
        }
        return response;
    }

}

class ObjStorage {
    public int n;
    public int[] cells;

    ObjStorage(int n, int[] cells){
        this.n = n;
        this.cells = cells;
    }
}