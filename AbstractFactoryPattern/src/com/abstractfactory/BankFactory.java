package com.abstractfactory;

public class BankFactory extends AbstractFactory{
	public Bank getBank(String bank){  
	      if(bank == null){  
	         return null;  
	      }  
	      if(bank.equalsIgnoreCase("Baroda")){  
	         return new Baroda();  
	      } else if(bank.equalsIgnoreCase("SBI")){  
	         return new SBI();  
	      }  
	      return null;  
	   }

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}  
}
