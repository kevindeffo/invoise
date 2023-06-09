package com.mycompany.invoise.core.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public class Invoice {
    @Id
    @Column("INVOICE_NUMBER")
    private String number;
    private String customerName;
    private  String oderNumber;

    public Invoice(String number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public Invoice(String number, String customerName, String oderNumber) {
        this.number = number;
        this.customerName = customerName;
        this.oderNumber = oderNumber;
    }

    public Invoice() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOderNumber() {
        return oderNumber;
    }

    public void setOderNumber(String oderNumber) {
        this.oderNumber = oderNumber;
    }
}
