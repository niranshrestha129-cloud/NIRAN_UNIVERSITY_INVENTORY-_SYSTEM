import java.time.LocalDate;

/**
 * Represents general equipment in the university inventory. This could include
 * items like laptops, projectors, tablets, etc. This version is uniquely named
 * to distinguish from other similar projects. Inherits common inventory properties
 * from {@link NiranInventoryItem}.
 */
public class Equipment extends InventoryItem {
    private String brandName; // renamed from brand

    /**
     * Constructs a new equipment item.
     *
     * @param id           unique identifier for the equipment
     * @param name         name of the equipment
     * @param brandName    manufacturer or brand of the equipment
     * @param purchaseDate date of purchase
     * @param price        purchase price
     * @param warrantyEnd  warranty expiration date
     */
    public Equipment(String id, String name, String brandName, LocalDate purchaseDate, double price, LocalDate warrantyEnd) {
        super(id, name, purchaseDate, price, warrantyEnd);
        this.brandName = brandName;
    }

    /**
     * Returns the brand of the equipment.
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Provides a maintenance fee calculation specific to general equipment.
     * Here we consider 5% of the price as a basic maintenance fee.
     *
     * @return maintenance fee
     */
    @Override
    public double getMaintenanceFee() {
        return getPrice() * 0.05; // 5% of purchase price
    }

    @Override
    public String toString() {
        return String.format("[Equipment] %s, Brand: %s, Maintenance Fee: %.2f", super.toString(), brandName,
                getMaintenanceFee());
    }
}
