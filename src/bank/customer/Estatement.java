package bank.customer;

public class Estatement {
	
	private int id;
	private String ecno;
	private String name;
	private String cvn;
	private String email;
	private String phone;
	

	public Estatement(int id, String ecno, String name, String cvn, String email, String phone) {
		this.id = id;
		this.ecno = ecno;
		this.name = name;
		this.cvn = cvn;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}
		
	public String getEcno() {
		return ecno;
	}

	public String getName() {
		return name;
	}

	public String getCvn() {
		return cvn;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

}
