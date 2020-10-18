package leetcode.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToEnglishTest {
    @Test
    public void testOne(){
        IntegerToEnglish itoE = new IntegerToEnglish();
        assertEquals("One Hundred Twenty Three", itoE.numberToWords(123));
        assertEquals("Twelve Thousand Three Hundred Forty Five", itoE.numberToWords(12345));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", itoE.numberToWords(1234567));
        assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One", itoE.numberToWords(1234567891));
        assertEquals("Zero", itoE.numberToWords(0));
        assertEquals("One", itoE.numberToWords(1));
        assertEquals("Nine", itoE.numberToWords(9));
        assertEquals("Ninety", itoE.numberToWords(90));
        assertEquals("Ten", itoE.numberToWords(10));
        assertEquals("One Hundred", itoE.numberToWords(100));
        assertEquals("One Thousand", itoE.numberToWords(1000));
        assertEquals("One Million", itoE.numberToWords(1000000));
        assertEquals("One Billion", itoE.numberToWords(1000000000));
    }
}
