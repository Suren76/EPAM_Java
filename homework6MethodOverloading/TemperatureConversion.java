package homework6MethodOverloading;

public class TemperatureConversion {
    public static void main(String[] args) {
        // 373.15 Kelvin
        float temperatureInFahrenheit = 212;
        double temperatureInCelsius = 100;

        System.out.println("Temperature in Celsius converted to Fahrenheit: " + convertTemperature(temperatureInCelsius));
        System.out.println("Temperature in Fahrenheit converted to Celsius: " + convertTemperature(temperatureInFahrenheit));
    }

    static double convertTemperature(double temperatureInCelsius) {
        return convertTemperatureInCelsiusToFahrenheit(temperatureInCelsius);
    }

    static double convertTemperature(float temperatureInFahrenheit) {
        return convertTemperatureInFahrenheitToCelsius(temperatureInFahrenheit);
    }

    static double convertTemperatureInFahrenheitToCelsius(double temperature) {
        double temperatureInCelsius = (temperature - 32) * 5 /9;
        checkIsTemperatureLowerThanKelvinZero(temperatureInCelsius);
        return temperatureInCelsius;
    }

    static double convertTemperatureInCelsiusToFahrenheit(double temperature) {
        checkIsTemperatureLowerThanKelvinZero(temperature);
        return temperature * 9 /5 + 32;
    }

    static void checkIsTemperatureLowerThanKelvinZero(double temperatureInCelsius) {
        double temperatureInKelvin = temperatureInCelsius + 273.15;
        if (temperatureInKelvin < 0) {
            System.out.println("Is is not possible to have temperature lower than kelvin 0!");
            System.exit(120);
        }
    }
}
