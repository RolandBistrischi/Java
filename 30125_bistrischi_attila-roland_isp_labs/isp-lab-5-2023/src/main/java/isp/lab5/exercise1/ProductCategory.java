package isp.lab5.exercise1;

/**
 * @author Radu Miron
 */
public enum ProductCategory {
    ELECTRONICS("Electronics & Gadgets"),
    FASHION("Fashion"),
    HOME_AND_GARDEN("Home and garden"),
    BEAUTY("Beauty"),
    TOYS("Toys"),
    SPORTS_AND_OUTDOORS("Sports & Outdoors"),
    HEALTH_AND_WELLNESS("Health & Wellness"),
    BOOKS_AND_MAGAZINES("Books & Magazines"),
    MUSIC_AND_MOVIES("Music & Movies"),
    PETS("Pets"),
    FOOD_AND_DRINK("Food & Drink");
    // todo: add the rest of the constants

    private String displayName;

    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
