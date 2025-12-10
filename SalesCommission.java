	package SalesCommissionSystem;
	
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.util.Scanner;
	
	public class SalesCommission {
	
		public static void main(String[] args) throws FileNotFoundException  {
			// TODO Auto-generated method stub
			//Created Scanners for user input and file input
			Scanner console = new Scanner(System.in);
			Scanner file = new Scanner(new FileReader("sales.txt"));

			//Declared my variables
			String specify; //yes or no answer
			double commission; //commission rate used in calculations
			final double rate = 0.3; //default commission rate
			double total_income = 0; //total income
			double total_commission = 0; //total commission
			String type; // type of property
			int num; //number of sales
			double income; //income per property type
			double comm; //commission per property type
			double price; //price of each property
			
			// I asked user if they want a custom commission rate
			System.out.println("Do you wish to specify a custom commission rate");
			specify = console.nextLine();

			// I made a loop to make sure user only answer yes and no
			while (!(specify.equals("yes") || specify.equals("no"))){
				System.out.println("ONLY YES OR NO");
				System.out.println("Do you wish to specify a custom commission rate");
				specify = console.nextLine();
			}

			// This is used to answer the custom commission rate
			if (specify.equals("yes")){
				System.out.println("Enter your custom commission rate");

				//I made this to check if the input is a number
				while (!console.hasNextDouble()){
					System.out.println("This isnt a number. Only enter an number");
					console.next();
				}
				//I add /100 to make it a decimal
				commission = console.nextDouble() / 100;
			}
			else{
				//This is showing the default commission rate
				System.out.println("Using default rate" + " " + rate);
				commission = rate;
			}
			//This reads sales data from the sales.txt file
			while (file.hasNext()) {
				type = file.next();  //this reads the property type
				num = file.nextInt(); //this reads the number of properties
				price = file.nextDouble(); //this reads the selling price
				
				// This calculates the income and commission
				income = num * price;
				comm = income * commission;
				
				// This adds the totals
				total_income = total_income + income;
				total_commission = total_commission + comm;
				
				// This prints the result
				System.out.println("Property: " + type);/
				System.out.println("Number sold: " + num);
				System.out.printf("Price: £%.2f %n" price);
				System.out.printf("Income: £%.2f %n" income);
				System.out.printf("Commission: £%.2f %n" comm);
			}
			
			// This prints the total
			System.out.printf("Total Income: £%.2f %n" total_income);
			System.out.printf("Total Commission: £%.2f %n" total_commission);
			
			// This closes Scanners
			file.close();
			console.close();
		}
	
	}
