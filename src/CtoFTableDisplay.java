public class CtoFTableDisplay
{
    static void main(String[] args)
    {

        System.out.println("Celsius Fahrenheit");
        System.out.println("-----------------");

        for (int t = 0; t <= 200; t++)
        {
            double Celsius = t - 100;
            double Farenheit = CtoF(Celsius);
            System.out.printf("%6.1f %8.1f\n", Celsius, Farenheit);

        }
    }

    /**
     * a method that transforms a temperature in celsius to a temperature in farenheit
     * @param Celsius a celsius value
     * @return the respective farenheit value
     */
    public static double CtoF(double Celsius)
    {
        double Farenheit = (Celsius * 1.8) + 32;

        return Farenheit;

    }
}
