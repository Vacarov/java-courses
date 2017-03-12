import java.util.Scanner;
public class InteractRunner{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit="no";
			while(!exit.equals("yes")){
				System.out.println("Enter first args : ");
				String num1=reader.next();
				System.out.println("Enter second args : ");
				String num2 = reader.next();
				calc.add(Integer.valueOf(num1),Integer.valueOf(num2));
				System.out.println("Result :" + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes/no :");
				exit = reader.next();
			}
		}
		finally{
			reader.close();
		}
	}
}