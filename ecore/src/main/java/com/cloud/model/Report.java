package com.cloud.model;

import java.util.Date;

import com.cloud.admin.model.ModelAbstact;

public class Report extends ModelAbstact{
	public double totalAmoun;
	public Date pritedDate;
	public String paymentMethod;
	public double payedAmoun ;
	
	public double getTotalAmoun() {
		return totalAmoun;
	}
	public void setTotalAmoun(double totalAmoun) {
		this.totalAmoun = totalAmoun;
	}
	public Date getPritedDate() {
		return pritedDate;
	}
	public void setPritedDate(Date pritedDate) {
		this.pritedDate = pritedDate;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public double getPayedAmoun() {
		return payedAmoun;
	}
	public void setPayedAmoun(double payedAmoun) {
		this.payedAmoun = payedAmoun;
	}
	
}
