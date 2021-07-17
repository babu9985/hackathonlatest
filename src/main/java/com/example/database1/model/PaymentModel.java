package com.example.database1.model;

public class PaymentModel {
	
	 String customerid;
	    String transdesc;
	    String amount;
	    String paymenttype;
	    String category;
	    String date;
	    
	    
	  
	    public String getCustomerid() {
	        return customerid;
	    }
	    public void setCustomerid(String customerid) {
	        this.customerid = customerid;
	    }
	    public String getTransdesc() {
	        return transdesc;
	    }
	    public void setTransdesc(String transdesc) {
	        this.transdesc = transdesc;
	    }
	    public String getAmount() {
	        return amount;
	    }
	    public void setAmount(String amount) {
	        this.amount = amount;
	    }
	    public String getPaymenttype() {
	        return paymenttype;
	    }
	    public void setPaymenttype(String paymenttype) {
	        this.paymenttype = paymenttype;
	    }
	    public String getCategory() {
	        return category;
	    }
	    public void setCategory(String category) {
	        this.category = category;
	    }
	    public String getDate() {
	        return date;
	    }
	    public void setDate(String date) {
	        this.date = date;
	    }

}
