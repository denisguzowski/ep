import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTemperatureConverter {
    private static  TemperatureConverter converter;

    @Parameterized.Parameter
    public double temperatureC;
    @Parameterized.Parameter(1)
    public double temperatureK;
    @Parameterized.Parameter(2)
    public double temperatureF;

//    public TestTemperatureConverter(double temperatureC, double temperatureK, double temperatureF) {
//        this.temperatureC = temperatureC;
//        this.temperatureK = temperatureK;
//        this.temperatureF = temperatureF;
//    }


    @BeforeClass
    public static void init(){
        converter = new TemperatureConverter();
    }

    @Parameterized.Parameters(name = "{index}: {0} C is {1} K is {2} F")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0.0, 273.2, 32.0},
                {-100.0, 173.2, -148.0},
                {-273.2, 0.0, -459.76},
                {273.2, 546.4, 523.76}
        });
    }

    @Test
    public void testConvertFtoC(){
        Assert.assertEquals(temperatureC, converter.convertFtoC(temperatureF), 0.01);
    }

    @Test
    public void testConvertCtoF(){
        Assert.assertEquals(temperatureF, converter.convertCtoF(temperatureC), 0.01);
    }

    @Test
    public void testConvertCtoK(){
        Assert.assertEquals(temperatureK,converter.convertCtoK(temperatureC), 0.01);
    }

    @Test
    public void testConvertKtoC(){
        Assert.assertEquals(temperatureC, converter.convertKtoC(temperatureK), 0.01);
    }

    @Test
    public void testConvertFtoK(){
        Assert.assertEquals(temperatureK, converter.convertFtoK(temperatureF), 0.1);
    }

    @Test
    public void testConvertKtoF(){
        Assert.assertEquals(temperatureF, converter.convertKtoF(temperatureK), 0.1);
    }

}
