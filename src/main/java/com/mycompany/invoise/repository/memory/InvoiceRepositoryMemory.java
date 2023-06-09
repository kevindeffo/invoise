package com.mycompany.invoise.repository.memory;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
    public List<Invoice> invoices = new ArrayList<Invoice>();

    public void create (Invoice invoice){
        invoices.add(invoice);
        System.out.println("invoice added with number "+invoice.getNumber()+" for customer "+ invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        return null;
    }
}
