import java.time.LocalDate;

/**
 * Represents specialized laboratory equipment in the inventory. These items
 * typically require more maintenance and calibration than regular equipment or
 * furniture. Examples might include microscopes, spectrometers, or other
 * scientific instruments.
 *
 * This is a customized version for uniqueness in your project.
 */
public class NiranLabEquipment extends NiranInventoryItem {
    private String laboratoryType; // renamed from labType

    /**
     * Constructs a new lab equipment item.
     *
     * @param id             unique identifier for the lab equipment
     * @param name           name of the equipment
     * @param laboratoryType type of lab this equipment belongs to (e.g., chemistry, physics)
     * @param purchaseDate   date of purchase
     * @param price          purchase price
     * @param warrantyEnd    warranty expiration date
     */
    public NiranLabEquipment(String id, String name, String laboratoryType, LocalDate purchaseDate, double price,
                             LocalDate warrantyEnd) {
        super(id, name, purchaseDate, price, warrantyEnd);
        this.laboratoryType = laboratoryType;
    }

    /**
     * Returns the laboratory type for this equipment.
     */
    public String getLaboratoryType() {
        return laboratoryType;
    }

    /**
     * Provides a maintenance fee calculation specific to laboratory equipment.
     * Laboratory equipment tends to need more upkeep, so we use 10% of the price.
     *
     * @return maintenance fee
     */
    @Override
    public double getMaintenanceFee() {
        return getPrice() * 0.10; // 10% of purchase price
    }

    @Override
    public String toString() {
        return String.format("[NiranLabEquipment] %s, Lab Type: %s, Maintenance Fee: %.2f",
                super.toString(), laboratoryType, getMaintenanceFee());
    }
}
