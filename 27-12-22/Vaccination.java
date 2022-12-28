package abstraction;

import java.util.Scanner;

abstract class Vaccine{
	Scanner sc=new Scanner(System.in);
	String Citizen,Name;
	int age,price;
	
	public void FirstDose() {
		sc.nextLine();
		System.out.println("Enter your Name:");
		Name= sc.nextLine();
		System.out.println("Enter your citizenship:");
		Citizen=sc.nextLine();
		//if((Citizen==("Indian"))|| (Citizen==("INDIAN"))||(citizen==("indian")))
		if(Citizen.equalsIgnoreCase("Indian")) {
			System.out.println("Enter your age:");
			age=sc.nextInt();
			if(age>=18) {
				System.out.println("Enter the price");
				price=sc.nextInt();
				if(price==250) {
					System.out.println("You are vaccinated successfully!!");
					
				}
				else {
					System.out.println("The amount should be Rs.250");
				}
			}
			else {
				System.out.println("Age must above or equal 18 years");
			}
		}
		else {
			System.out.println("Vaccination is only for Indian citizenship");
		}
	}
	public void SecondDose() {
		System.out.println("Have you recieved your 1st dose? y/n");
		char c=sc.next().charAt(0);
		if(c=='y'|| c=='Y') {
			System.out.println("Has it been two months since your 1st dose?y/n");
			 c=sc.next().charAt(0);
			 if(c=='y'|| c=='Y') {
				 System.out.println("Enter the amount for Second dose:");
				 price=sc.nextInt();
					if(price==150) {
						System.out.println("Second dose vaccinated successfully!!");
						
					}
					else {
						System.out.println("The amount should be Rs.150");
					}
			 }
			 else {
				 System.out.println("Please come after the completation of 2 months.");
			 }
		}
		else {
			System.out.println("Please recieve the 1st dose and come again.");
		}
		
	}
	abstract public void Booster();
	
}


class VaccinationSuccess extends Vaccine{

	@Override
	public void Booster() {
		System.out.println("Have you recieved you 2nd dose? y/n");
		char c=sc.next().charAt(0);
		if(c=='y'|| c=='Y') {
			System.out.println("Has it been three months since your 2nd dose?y/n");
			 c=sc.next().charAt(0);
			 if(c=='y'|| c=='Y') {
				 System.out.println("Booster dose vaccinated successfully!");
				 System.out.println("Congratulations!!!!! You have not to pay any amount for booster dose.");
			 }
			 else {
				 System.out.println("Please come after the completation of 3 months.");
			 }
	}
		else {
			System.out.println("Please recieve the 2nd dose and come.");
		}
	
}
}

public class Vaccination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VaccinationSuccess vac=new VaccinationSuccess();
		
		do {
			System.out.println("Welcome to Covid-19 Vaccination center");
			System.out.println("1)First Dose \n 2)Second Dose\n 3)Booster Dose\n 4)Exit");
			
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					vac.FirstDose();
					System.out.println("-----------------------------");
					break;
				case 2:
					vac.SecondDose();
					System.out.println("-----------------------------");
					break;
				case 3:
					vac.Booster();
					System.out.println("------------------------------");
					break;
				case 4:
					System.exit(0);
					break;
					default:
						System.out.println("Wrong choice!!");
			}
		}
		while (true);
		
	}

}

