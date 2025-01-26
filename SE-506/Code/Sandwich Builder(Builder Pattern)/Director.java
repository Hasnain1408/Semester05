public class Director {
    public void constructChickenSandwich(Builder builder) {
        builder.setBread("Regular");
        builder.setFilling("Grilled Chicken");
        builder.setSpread("Cheese");
    }

    public void constructEggSandwich(Builder builder) {
        builder.setBread("Toasted");
        builder.setFilling("Fried Egg");
        builder.setSpread("Sauce");
    }

    public void constructVeggieSandwich(Builder builder) {
        builder.setBread("Whole Grain");
        builder.setFilling("Lettuce, Tomato, Cucumber");
        builder.setSpread("Hummus");
    }
}

