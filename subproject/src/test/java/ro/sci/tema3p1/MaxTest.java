package ro.sci.tema3p1;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    Max max = new Max();

    @Test
    public void testMaxForGettingMax1() {
        //given
        int noOne = 3;
        int noTwo = 7;

        //test
        int bigger = max.getMax(noOne,noTwo);

        //then
        Assert.assertTrue(bigger==7);
    }

    @Test
    public void testMaxForGettingMax2() {
        //given
        int noOne = -5;
        int noTwo = 0;

        //test
        int bigger = max.getMax(noOne,noTwo);

        //then
        Assert.assertTrue(bigger==0);
    }

    @Test
    public void testMaxForGettingMax3() {
        //given
        int noOne = 19;
        int noTwo = 19;

        //test
        int bigger = max.getMax(noOne,noTwo);

        //then
        Assert.assertTrue(bigger==19);
    }

}
