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
}
