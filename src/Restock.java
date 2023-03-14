import java.util.Scanner;	

public class Restock {
	public static void main(String[]args) {
			
			int sodaInv = 100;
			int sodaRestock = 40;
			int chipsInv = 40;
			int chipsRestock = 20;
			int candyInv = 60;
			int candyRestock = 40;
			
			Scanner scan = new Scanner(System.in);		
			
		System.out.println("Welcome to the restocking tool!");
		
		System.out.println("How many sodas have been sold today?");
			int sodaSold = scan.nextInt();
			int sodaNew = sodaInv - sodaSold;
			
				if(sodaNew <= sodaInv && sodaNew >= 0){
				
					System.out.println("There are " + sodaNew + " sodas left.");				
				
				}else if(sodaNew < 0){
			
					System.out.println("That is not a valid entry.");
				}
				
					if(sodaNew >= 0) {
						sodaInv = sodaNew;
					}

		System.out.println("How many chips have been sold today?");
			int chipsSold = scan.nextInt();
			int chipsNew = chipsInv - chipsSold;
			
				if(chipsNew <= chipsInv && chipsNew >= 0){
					
					System.out.println("There are " + chipsNew + " chips left.");
				
				}else if(chipsNew < 0){
					
					System.out.println("That is not a valid entry.");
				}
					if(chipsNew >= 0) {
						chipsInv = chipsNew;
					}
			
		
		System.out.println("How many candies have been sold today?");
			int candySold = scan.nextInt();
			int candyNew = candyInv - candySold;
			
				if(candyNew <= candyInv && candyNew >= 0){
				
					System.out.println("There are " + candyNew + " candies left.");
				
				} else if(candyNew < 0){
				
					System.out.println("That is not a valid entry.");
				}
		
					if(candyNew >= 0) {
						candyInv = candyNew;
					}
		
					
		System.out.print("Thank you for filling out the values. Here's what needs to be restocked:");
		
			if(sodaInv <= sodaRestock) {
				System.out.print(" Soda");
			}
			if(chipsInv <= chipsRestock) {
				System.out.print(" Chips");
			}
			if(candyInv <= candyRestock) {
				System.out.print(" Candy");
			}
			
}
}
