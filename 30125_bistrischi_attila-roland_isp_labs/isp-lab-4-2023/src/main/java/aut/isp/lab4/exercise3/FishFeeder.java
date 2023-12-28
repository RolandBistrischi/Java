package aut.isp.lab4.exercise3;


public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = 14;
    }

    public String verifFeed() {
        if (meals > 0) {
            meals--;
            return "Fish is feeding";
        } else
            return "Fish no more feed! Fish is hungary!\n";
    }

    public void feed() {
        System.out.println(this.verifFeed());
    }

    public void fillUp() {
        meals = 14;
        System.out.println("Filled Up");
    }

    public void setMeals(int meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
}
