package lectures;

public class w9Address {//Address can have a phone number

	private String city;
	private int postCode;
	private w9Telephone telephone;
	public w9Address(String city, int postCode, w9Telephone telephone) {
		super();
		this.city = city;
		this.postCode = postCode;
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "w9Address [city=" + city + ", postCode=" + postCode + ", telephone=" + telephone + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public w9Telephone getTelephone() {
		return telephone;
	}
	public void setTelephone(w9Telephone telephone) {
		this.telephone = telephone;
	}
	
}
