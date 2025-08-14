package Classes;

public class Meal {
    private String mainDish;
    private String sideDish;
    private String drink;
    private String dessert;
    private String appetizer;

    private Meal(MealBuilder builder) {
        // TODO: Implement the Meal constructor to initialize Meal components from the MealBuilder.
        this.mainDish = builder.mainDish;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.appetizer = builder.appetizer;
    }

    public static synchronized Meal getInstance(MealBuilder builder) {
        //TODO: Return a new instance of Meal using the provided MealBuilder
        return new Meal(builder);
    }

    public void printMealSummary() {
        System.out.println("Main Dish: " + mainDish);
        System.out.println("Side Dish: " + sideDish);
        System.out.println("Drink: " + drink);
        System.out.println("Dessert: " + dessert);
        System.out.println("Appetizer: " + appetizer);
    }

    public static class MealBuilder {
        public String mainDish;
        public String sideDish;
        public String drink;
        public String dessert = "Default Dessert";
        public String appetizer = "Default Appetizer";

        public MealBuilder(String mainDish, String sideDish, String drink) {
            // TODO: Initialize MealBuilder components using the provided parameters.
            this.mainDish = mainDish;
            this.sideDish = sideDish;
            this.drink = drink;
        }

        public MealBuilder setDessert(String dessert) {
            // TODO: Initialize the MealBuilder dessert field with the provided dessert parameter.
            this.dessert = dessert;
            return this;
        }

        public MealBuilder setAppetizer(String appetizer) {
            // TODO: Initialize the MealBuilder appetizer field with the provided dessert parameter.
            this.appetizer = appetizer;
            return this;
        }

        public Meal build() {
            // TODO: Write the return statement to complete the object construction process.
            return new Meal(this);
        }
    }
}
