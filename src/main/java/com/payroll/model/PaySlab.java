package com.payroll.model;

import java.io.Serializable;

public class PaySlab implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -231748596535894584L;
	private int hra;
	private int ta;
	private int pf;
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}

}
