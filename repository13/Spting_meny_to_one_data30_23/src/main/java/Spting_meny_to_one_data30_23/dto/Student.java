package Spting_meny_to_one_data30_23.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value = "prototype")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Qspider getQspider() {
		return qspider;
	}

	public void setQspider(Qspider qspider) {
		this.qspider = qspider;
	}

	private String name;
	private String email;
	private String branch;
	private String address;
	private long phone;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Autowired
	private Qspider qspider;

}
