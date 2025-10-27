package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TemperatureConverter
{
    public static void main(String[] args)
    {



    }

    public double celsiusToFahrenheit(double celsius)
    {
        return (celsius * 1.8) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit -32) / 1.8;
    }

    public double celsiusToKelvin(double celsius)
    {
        return celsius + 273.15;
    }

}