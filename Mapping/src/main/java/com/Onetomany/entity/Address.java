package com.Onetomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Address {
	 @Id
	    @GeneratedValue
	    private Long id;
	 @Column(name="address_name", length = 45)
	 private String addressName;
	 @Column(name="state", length=45)
	 private String state;
	 @Column(name="country", length=45)
	 private String country;

//	 @ManyToOne
//	 @JoinColumn(name = "employee_id")
//	 private Employee employee;
	
		@OneToMany(mappedBy = "address",cascade = CascadeType.ALL)
		private Set<Employee> employee;
//		private List<Employee> employee = new ArrayList<Employee>(0);
	public Long getId() {
		return id;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Address(Long id, String addressName, String state, String country,
			Set<com.Onetomany.entity.Employee> employee) {
		super();
		this.id = id;
		this.addressName = addressName;
		this.state = state;
		this.country = country;
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", addressName=" + addressName + ", state=" + state + ", country=" + country
				+ ", employee=" + employee + "]";
	}

	


}
