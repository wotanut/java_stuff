package temperature_converter;
import java.util.*;

public class main {
    public static void main(String[] args)
    {
        System.out.println("Enter the temperature in Fahrenheit: ");

        Scanner input = new Scanner(System.in);
        Integer farenheit = Integer.parseInt(input.nextLine());
        input.close();

        Integer celsius = 5 * (farenheit - 32) / 9;

        System.out.println("The temperature in celsius is: " + celsius + " degrees");
    }
}