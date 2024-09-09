import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ConvertTest {

    @org.junit.Test
    public void whenNumberis_99_result_XCIX() {
        Convert tester2 = new Convert();
        assertEquals("XCIX", Convert.intToRoman(99));
    }

    @org.junit.Test
    public void whenNumberis_0_result_NUll() {
        Convert tester2 = new Convert();
        assertNull(Convert.intToRoman(0));
    }

    @org.junit.Test
    public void whenNumberis_4000_result_NUll() {
        Convert tester2 = new Convert();
        assertNull(Convert.intToRoman(4000));
    }

    @org.junit.Test
    public void whenNumberis_6000_result_NUll() {
        Convert tester2 = new Convert();
        assertNull(Convert.intToRoman(6000));
    }

    @org.junit.Test
    public void whenNumberis_negative_10_result_NUll() {
        Convert tester2 = new Convert();
        assertNull(Convert.intToRoman(-10));
    }

    @org.junit.Test
    public void whenNumberis_1_result_I() {
        Convert tester2 = new Convert();
        assertEquals("I", Convert.intToRoman(1));
    }

    @org.junit.Test
    public void whenNumberis_4_result_IV() {
        Convert tester2 = new Convert();
        assertEquals("IV", Convert.intToRoman(4));
    }

    @org.junit.Test
    public void whenNumberis_5_result_V() {
        Convert tester2 = new Convert();
        assertEquals("V", Convert.intToRoman(5));
    }

    @org.junit.Test
    public void whenNumberis_9_result_IX() {
        Convert tester2 = new Convert();
        assertEquals("IX", Convert.intToRoman(9));
    }

    @org.junit.Test
    public void whenNumberis_10_result_X() {
        Convert tester2 = new Convert();
        assertEquals("X", Convert.intToRoman(10));
    }

    @org.junit.Test
    public void whenNumberis_14_result_XIV() {
        Convert tester2 = new Convert();
        assertEquals("XIV", Convert.intToRoman(14));
    }

    @org.junit.Test
    public void whenNumberis_15_result_XV() {
        Convert tester2 = new Convert();
        assertEquals("XV", Convert.intToRoman(15));
    }

    @org.junit.Test
    public void whenNumberis_40_result_XL() {
        Convert tester2 = new Convert();
        assertEquals("XL", Convert.intToRoman(40));
    }

    @org.junit.Test
    public void whenNumberis_50_result_L() {
        Convert tester2 = new Convert();
        assertEquals("L", Convert.intToRoman(50));
    }

    @org.junit.Test
    public void whenNumberis_90_result_() {
        Convert tester2 = new Convert();
        assertEquals("XC", Convert.intToRoman(90));
    }

    @org.junit.Test
    public void whenNumberis_100_result_C() {
        Convert tester2 = new Convert();
        assertEquals("C", Convert.intToRoman(100));
    }

    @org.junit.Test
    public void whenNumberis_400_result_CD() {
        Convert tester2 = new Convert();
        assertEquals("CD", Convert.intToRoman(400));
    }

    @org.junit.Test
    public void whenNumberis_500_result_D() {
        Convert tester2 = new Convert();
        assertEquals("D", Convert.intToRoman(500));
    }

    @org.junit.Test
    public void whenNumberis_900_result_CM() {
        Convert tester2 = new Convert();
        assertEquals("CM", Convert.intToRoman(900));
    }

    @org.junit.Test
    public void whenNumberis_1000_result_M() {
        Convert tester2 = new Convert();
        assertEquals("M", Convert.intToRoman(1000));
    }

    @org.junit.Test
    public void whenNumberis_3999_result_MMMCMXCIX() {
        Convert tester2 = new Convert();
        assertEquals("MMMCMXCIX", Convert.intToRoman(3999));
    }

    @org.junit.Test
    public void whenNumberis_2000_result_MM() {
        Convert tester2 = new Convert();
        assertEquals("MM", Convert.intToRoman(2000));
    }

    @org.junit.Test
    public void whenNumberis_333_result_CCCXXXIII() {
        Convert tester2 = new Convert();
        assertEquals("CCCXXXIII", Convert.intToRoman(333));
    }

    @org.junit.Test
    public void whenNumberis_3333_result_MMMCCCXXXIII() {
        Convert tester2 = new Convert();
        assertEquals("MMMCCCXXXIII", Convert.intToRoman(3333));
    }

    @org.junit.Test
    public void whenNumberis_111_result_CXI() {
        Convert tester2 = new Convert();
        assertEquals("CXI", Convert.intToRoman(111));
    }

    @org.junit.Test
    public void whenNumberis_1111_result_MCXI() {
        Convert tester2 = new Convert();
        assertEquals("MCXI", Convert.intToRoman(1111));
    }

    @org.junit.Test
    public void whenNumberis_222_result_CCXXII() {
        Convert tester2 = new Convert();
        assertEquals("CCXXII", Convert.intToRoman(222));
    }

    @org.junit.Test
    public void whenNumberis_2222_result_MMCCXXII() {
        Convert tester2 = new Convert();
        assertEquals("MMCCXXII", Convert.intToRoman(2222));
    }

    @org.junit.Test
    public void whenNumberis_444_result_CDXLIV() {
        Convert tester2 = new Convert();
        assertEquals("CDXLIV", Convert.intToRoman(444));
    }

    @org.junit.Test
    public void whenNumberis_3500_result_MMMD() {
        Convert tester2 = new Convert();
        assertEquals("MMMD", Convert.intToRoman(3500));
    }

    @org.junit.Test
    public void whenNumberis_2799_result_MMDCCXCIX() {
        Convert tester2 = new Convert();
        assertEquals("MMDCCXCIX", Convert.intToRoman(2799));
    }

    @org.junit.Test
    public void whenNumberis_2638_result_MMDCXXXVIII() {
        Convert tester2 = new Convert();
        assertEquals("MMDCXXXVIII", Convert.intToRoman(2638));
    }

    @org.junit.Test
    public void whenNumberis_2324_result_MMCCCXXIV() {
        Convert tester2 = new Convert();
        assertEquals("MMCCCXXIV", Convert.intToRoman(2324));
    }

    @org.junit.Test
    public void whenNumberis_7_result_VII() {
        Convert tester2 = new Convert();
        assertEquals("VII", Convert.intToRoman(7));
    }

    @org.junit.Test
    public void whenNumberis_183_result_CLXXXIII() {
        Convert tester2 = new Convert();
        assertEquals("CLXXXIII", Convert.intToRoman(183));
    }

    @org.junit.Test
    public void whenNumberis_767_result_DCCLXVII() {
        Convert tester2 = new Convert();
        assertEquals("DCCLXVII", Convert.intToRoman(767));
    }

    @org.junit.Test
    public void whenNumberis_1295_result_MCCXCV() {
        Convert tester2 = new Convert();
        assertEquals("MCCXCV", Convert.intToRoman(1295));
    }

    @org.junit.Test
    public void whenNumberis_1906_result_MCMVI() {
        Convert tester2 = new Convert();
        assertEquals("MCMVI", Convert.intToRoman(1906));
    }

    @org.junit.Test
    public void whenNumberis_2024_result_MMXXIV() {
        Convert tester2 = new Convert();
        assertEquals("MMXXIV", Convert.intToRoman(2024));
    }

    @org.junit.Test
    public void whenNumberis_2028_result_MMXXVIII() {
        Convert tester2 = new Convert();
        assertEquals("MMXXVIII", Convert.intToRoman(2028));
    }
}