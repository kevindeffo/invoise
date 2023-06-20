package com.mycompany.invoise.core.repository.memory;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
//import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
    public List<Invoice> invoices = new ArrayList<Invoice>();

    public Invoice save (Invoice invoice){
        invoices.add(invoice);
        System.out.println("invoice added with number "+invoice.getNumber()+" for customer "+ invoice.getCustomerName());
        return invoice;
    }

    @Override
    public <S extends Invoice> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public Optional<Invoice> findById(String number) {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public boolean existsById(String s) {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public Iterable<Invoice> findAll() {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public Iterable<Invoice> findAllById(Iterable<String> strings) {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public void deleteById(String s) {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public void delete(Invoice entity) {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public void deleteAll(Iterable<? extends Invoice> entities) {
        throw new UnsupportedOperationException() ;
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException() ;
    }
}
