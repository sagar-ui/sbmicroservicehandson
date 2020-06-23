package com.cognizant.loan.model;

public class Loan {
	private String number;
	private String type;
	private double loan;
	private double emi;
	private double tenure;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getLoan() {
		return loan;
	}

	public void setLoan(double loan) {
		this.loan = loan;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
}
