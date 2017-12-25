package codewars.challenge5;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccumulTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        testing(Accumul.accum("abcd"), "A-Bb-Ccc-Dddd"); 
     
    }
    @Test
    public void test2() {       
        testing(Accumul.accum("RqaEzty"),"R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"); 
    }
    
    @Test
    public void test3() {
        testing(Accumul.accum("cwAt"), "C-Ww-Aaa-Tttt"); 
    }
    
    @Test
    public void test4() {
        System.out.println("Fixed Tests accum");
        
        testing(Accumul.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        testing(Accumul.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        testing(Accumul.accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        testing(Accumul.accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        testing(Accumul.accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    }
}
