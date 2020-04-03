package com.capgemini.bus_booking.bean;

public class Manager {
	private int mgr_id;
	private String mgr_name;

	public Manager(int mgr_id, String mgr_name, String mgr_email, String mgr_dob, String mgr_pno, String mgr_address) {
		super();
		this.mgr_id = mgr_id;
		this.mgr_name = mgr_name;
		this.mgr_email = mgr_email;
		this.mgr_dob = mgr_dob;
		this.mgr_pno = mgr_pno;
		this.mgr_address = mgr_address;
	}

	private String mgr_email;
	private String mgr_dob;
	private String mgr_pno;
	private String mgr_address;

	public int getMgr_id() {
		return mgr_id;
	}

	public void setMgr_id(int mgr_id) {
		this.mgr_id = mgr_id;
	}

	public String getMgr_name() {
		return mgr_name;
	}

	public void setMgr_name(String mgr_name) {
		this.mgr_name = mgr_name;
	}

	public String getMgr_email() {
		return mgr_email;
	}

	public void setMgr_email(String mgr_email) {
		this.mgr_email = mgr_email;
	}

	public String getMgr_dob() {
		return mgr_dob;
	}

	public void setMgr_dob(String mgr_dob) {
		this.mgr_dob = mgr_dob;
	}

	public String getMgr_pno() {
		return mgr_pno;
	}

	public void setMgr_pno(String mgr_pno) {
		this.mgr_pno = mgr_pno;
	}

	public String getMgr_address() {
		return mgr_address;
	}

	public void setMgr_address(String mgr_address) {
		this.mgr_address = mgr_address;
	}

}
