import service.LegacyWeatherService;
import service.NewWeatherService;
import service.WeatherService;
import service.adapter.NewWeatherServiceAdapter;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String legacyTemperature = sc.nextLine();
        String legacyCondition = sc.nextLine();

        // Using the legacy weather service with user input
        WeatherService legacyService = new LegacyWeatherService(legacyTemperature, legacyCondition);
        System.out.println("Legacy Weather Service Data:");

        // TODO: Print the weather data retrieved from the Legacy weather service.

        System.out.println(legacyService.getWeatherData());

        String temperature = sc.nextLine();
        String condition = sc.nextLine();

        // TODO: Create an adapter for the new weather service.

        WeatherService adaptedService = new NewWeatherServiceAdapter(new NewWeatherService(temperature, condition));
        System.out.println("New Weather Service Data:");

        // TODO: Print the weather data retrieved from the new weather service.
        System.out.println(adaptedService.getWeatherData());


        sc.close();
    }
}