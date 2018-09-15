package ro.sci.tema3p3;

import org.junit.Assert;
import org.junit.Test;

public class TimeTest {

    Time time = new Time();

    @Test
    public void testIfTimeIsValid1() {
        //given
        int hour = 23;
        int minute = 45;

        //test
        boolean valid = time.checkIfValid(hour, minute);

        //then
        Assert.assertTrue(valid);
    }

    @Test
    public void testIfTimeIsNotValid1() {
        //given
        int hour = 24;
        int minute = 30;

        //test
        boolean valid = time.checkIfValid(hour, minute);

        //then
        Assert.assertFalse(valid);
    }

    @Test
    public void testIfTimeIsNotValid2() {
        //given
        int hour = 6;
        int minute = 65;

        //test
        boolean valid = time.checkIfValid(hour, minute);

        //then
        Assert.assertFalse(valid);
    }

}
