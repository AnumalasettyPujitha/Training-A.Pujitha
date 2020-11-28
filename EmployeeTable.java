package jdbcprogram;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Insert \n2.Display \n3.Update \n4.Delete \n5.Exit");
		int number=0;
		for(;number<=5;) {
			System.out.println("Enter a number between 1 and 5");
			number=sc.nextInt();
			if(number==1)
				Insert.insert();
			else if(number==2)
				Display.display();
			else if(number==3)
				Update.update();
			else if(number==4)
				Delete.delete();
			else if(number==5) {
				System.out.println("exit");
				System.exit(0);
			}
		}
	}

}
