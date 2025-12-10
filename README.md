# Sales-Commission-Calculator
## Description
A Java console app that reads property sales data from a file, applies a default or custom commission rate, and calculates income and commission totals.

## Features
- Reads sales data from `sales.txt`
- Allows custom commission rate or uses default (30%)
- Calculates income and commission per property type
- Displays total income and commission

## Requirements
- Java Development Kit (JDK) 8 or higher
- A text file named `sales.txt` containing property data in the format:
  ```
  propertyType numberOfSales pricePerProperty
  ```

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/sales-commission-calculator.git
   ```
2. Navigate to the project directory:
   ```bash
   cd sales-commission-calculator
   ```

## Usage
1. Compile the Java file:
   ```bash
   javac SalesCommission.java
   ```
2. Run the program:
   ```bash
   java SalesCommission
   ```
3. Follow the prompts to specify a custom commission rate or use the default.

## Example Output
```
Do you wish to specify a custom commission rate
yes
Enter your custom commission rate
25
Property: House
Number sold: 3
Price: £200000.00
Income: £600000.00
Commission: £150000.00
Total Income: £600000.00
Total Commission: £150000.00
```

## License
This project is licensed under the MIT License.
