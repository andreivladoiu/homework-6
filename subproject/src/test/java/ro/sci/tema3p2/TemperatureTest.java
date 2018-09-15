package ro.sci.tema3p2;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {

    Temperature temp = new Temperature();

    @Test
    public void testTemperatureForConversion1() {
        //given
        double tempF = 122.0;

        //test
        double tempC = temp.convert(tempF);

        //then
        Assert.assertTrue(tempC==50);
    }

    @Test
    public void testTemperatureForConversion2() {
        //given
        double tempF = 32.0;

        //test
        double tempC = temp.convert(tempF);

        //then
        Assert.assertTrue(tempC==0);
    }

    @Test
    public void testTemperatureForConversion3() {
        //given
        double tempF = 212.0;

        //test
        double tempC = temp.convert(tempF);

        //then
        Assert.assertTrue(tempC==100);
    }
}