package com.springcore.customer;

public class Customer {
    private int  customerid;
    private String customername;
    private long customercontact;
    private Address address;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getCustomercontact() {
		return customercontact;
	}
	public void setCustomercontact(long customercontact) {
		this.customercontact = customercontact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customercontact="
				+ customercontact + ",address=" + address + "]";
	}
    
}
