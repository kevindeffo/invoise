package com.mycompany.invoise.repository.database;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    public List<Invoice> invoices = new ArrayList<Invoice>();
    @Override
    public void create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Database: invoice added with number "+invoice.getNumber()+" for customer "+ invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber("Num_1");
        invoice1.setCustomerName("ENEO");

        Invoice invoice2 = new Invoice();
        invoice2.setNumber("Num_2");
        invoice2.setCustomerName("CDE");

        Invoice invoice3 = new Invoice();
        invoice3.setNumber("Num_3");
        invoice3.setCustomerName("Campost");
        return List.of(invoice1, invoice2, invoice3);
    }
}
