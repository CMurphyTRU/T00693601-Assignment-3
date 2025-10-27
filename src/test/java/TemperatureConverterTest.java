import org.example.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest
{
    public final TemperatureConverter TCon = new TemperatureConverter();

    @Test
    public void TestCelsiusToFahrenheit()
    {
        double result = TCon.celsiusToFahrenheit(0);
        assertEquals(32.0, result);
    }

    @Test
    public void TestFahrenheitToCelsius()
    {
        double result = TCon.fahrenheitToCelsius(212);
        assertEquals(100.0, result);
    }

    @Test
    public void TestCelsiusToKelvin()
    {
        double result = TCon.celsiusToKelvin(0);
        assertEquals(273.15, result);
    }


}
