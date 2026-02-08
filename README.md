# Niran University Inventory System

This Java application manages the inventory of Niran University, including general equipment, furniture, and laboratory items. Staff members can add new items, assign items to staff, return items, and track inventory status. The system prevents double-booking and over-assignment, making inventory management simple and efficient.

## Features

- Add and manage inventory items (equipment, furniture, lab equipment)
- Assign items to staff members with assignment limits
- Handle unavailable items and assignment exceptions
- Return items and update inventory status
- Exception handling for assignment limits and unavailable items

## Project Structure

- NiranUniversityInventorySystem.java – Main application logic and user interface
- InventoryItem.java – Base class for inventory items
- Equipment.java, Furniture.java, LabEquipment.java – Item subclasses
- StaffMember.java – Staff member management and item assignment
- AssignmentLimitExceededException.java – Exception for assignment limits
- ItemUnavailableException.java – Exception for unavailable items

## How to Run

1. Compile all Java files: `javac *.java`
2. Run the main application: `java NiranUniversityInventorySystem`

## Usage

- Follow the on-screen prompts to add items, assign them to staff, and manage inventory.
- The system will notify you if an assignment exceeds limits or if an item is unavailable.

## License

This project is for educational purposes.
