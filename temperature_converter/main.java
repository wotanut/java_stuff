package temperature_converter;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class main {
    public static void main(String[] args)
    {
        Integer result = null;

        System.out.println("What do you want to convert too \n 1) Celcius \n 2) Farenheit ");

        Scanner input = new Scanner(System.in);
        String direction = input.nextLine();


        if (direction.toLowerCase().equals("1") || direction.toLowerCase().equals("celcius"))
        {
            System.out.println("Please enter the temperature in farenheit ");
            Integer i = Integer.parseInt(input.nextLine());

            result = farenheit_to_celcius(i);
        }
        else if (direction.toLowerCase().equals("2") || direction.toLowerCase().equals("farenheit"))
        {
            System.out.println("Please enter the temperature in Celcius ");
            Integer i = Integer.parseInt(input.nextLine());

            result = clecius_to_farenheit(i);
        }
        else
        {
            System.out.println("Invalid input");
            main(args=null);
            System.exit(1);
        }

        System.out.println("The temperature in celsius is: " + result + " degrees");
        input.close();
    }

    public static Integer farenheit_to_celcius(Integer farenheit)
    {
        Integer celcius = 5 * (farenheit - 32) / 9;
        return celcius;
    }
    public static Integer clecius_to_farenheit(Integer celcius)
    {
        Integer farenheit = 9 * (celcius +32) /5;
        return farenheit;
    }
}