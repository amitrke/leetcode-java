package leetcode.java;

import org.junit.Test;

public class PrisonCellsTest {
    
    @Test
    public void testOne(){
        PrisonCells prisonCells = new PrisonCells();
        int[] cells = {1,0,0,1,0,0,1,0};
        prisonCells.prisonAfterNDays(cells, 1000000000);
    }
}
