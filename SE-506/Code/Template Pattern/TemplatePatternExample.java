// Abstract class defining the template
abstract class BeverageTemplate {
    // Template method
    public final void prepareBeverage() {
        boilWater();
        addMainIngredient();
        pourInCup();
        addCondiments();
    }

    // Common steps
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pourInCup() {
        System.out.println("Pouring into the cup...");
    }

    // Abstract methods for steps that vary
    protected abstract void addMainIngredient();
    protected abstract void addCondiments();
}



