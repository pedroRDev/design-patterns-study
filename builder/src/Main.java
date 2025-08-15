import classes.Meal;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get full meal components from user
        String fullMainDish = sc.nextLine();

        String fullSideDish = sc.nextLine();

        String fullDrink = sc.nextLine();

        String fullDessert = sc.nextLine();

        String fullAppetizer = sc.nextLine();

        // TODO: Construct a full meal using MealBuilder with the provided components.
        Meal meal = new Meal.MealBuilder(fullMainDish, fullSideDish, fullDrink)
                                                    .setAppetizer(fullAppetizer)
                                                    .setDessert(fullDessert)
                                                    .build();

        System.out.println("Full Meal Summary:");

        // TODO: Print the summary of the constructed full meal.

        meal.printMealSummary();

        // Get simple meal components from user
        String simpleMainDish = sc.nextLine();

        String simpleSideDish = sc.nextLine();

        String simpleDrink = sc.nextLine();

        // TODO: Construct a simple meal using MealBuilder with the provided components.

        Meal simpleMeal = new Meal.MealBuilder(simpleMainDish, simpleSideDish, simpleDrink).build();


        System.out.println("Simple Meal Summary:");

        // TODO: Print the summary of the constructed simple meal.

        simpleMeal.printMealSummary();

        sc.close();
    }
}