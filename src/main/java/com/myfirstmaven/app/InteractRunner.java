package com.myfirstmaven.app;
import java.util.Scanner;
public class InteractRunner{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit="no";
			while(!exit.equals("yes")){
					System.out.println("=====MENU====");
					System.out.println("1.add");
					System.out.println("2.substraction");
					System.out.println("3.exit");
					int option;
					System.out.println("Selecteaza o optiune : ");
					option = Integer.parseInt(reader.next());
				System.out.println("Enter first args : ");
				String num1=reader.next();
				System.out.println("Enter second args : ");
				String num2 = reader.next();
				switch(option){
					case 1: calc.add(Integer.valueOf(num1),Integer.valueOf(num2));
							System.out.println("Result :" + calc.getResult());
							calc.cleanResult();
							break;
					case 2:	calc.substraction(Integer.valueOf(num1),Integer.valueOf(num2));
							System.out.println("Result :" + calc.getResult());
							calc.cleanResult();
							break;
					case 3: System.out.println("Are you sure? : yes/no :");
							exit = reader.next();
							break;
					default : System.out.println("Selectati o optiune corecta.");break;
				}
			}
		}
		finally{
			reader.close();
		}
	}
}