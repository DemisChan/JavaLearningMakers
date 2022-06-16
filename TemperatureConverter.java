public class TemperatureConverter {

  public static void main(String[] args) {
    TemperatureConverter converter = new TemperatureConverter();

    float fahrenheit = 60.0f;
    System.out.printf("%.2f in fahrenheit = %.2f in celcius\n", fahrenheit, converter.toCelsius(fahrenheit));

    float celcius = 27.0f;
    System.out.printf("%.2f in celcius = %.2f in fahrenheit\n", celcius, converter.toFahrenheit(celcius));
  }

  public float toCelsius(float fahrenheit) {
    float factor = (5.0f / 9.0f);
    return (fahrenheit - 32) * factor;
  } 

  public float toFahrenheit(float celcius) {
    float factor = (9.0f / 5.0f);
    return celcius * factor + 32;
  }
}