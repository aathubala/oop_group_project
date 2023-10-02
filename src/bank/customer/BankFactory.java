package bank.customer;

public class BankFactory {

	public Bank getBank(String bank) {
		if(bank == null) {
			return null;
		}
		if(bank.equalsIgnoreCase("Estat")) {
			return new CustomerDBUtil();
		}
		
		return null;
	}
}
