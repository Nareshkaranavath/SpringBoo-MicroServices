package com.jackcon.binding;

public class Customer {

	private Integer id;
	private String name;
	private Long pno;

	public Customer() {

		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String name, Long pno) {
		super();
		this.id = id;
		this.name = name;
		this.pno = pno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPno() {
		return pno;
	}

	public void setPno(Long pno) {
		this.pno = pno;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", pno=" + pno + "]";
	}

}
