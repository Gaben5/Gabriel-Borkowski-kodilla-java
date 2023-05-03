package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    void testInvoiceDaoSave(){
        //Given
        Product p1 = new Product("Xiaomi");
        Product p2 = new Product("Apple");

        Item i1 = new Item(p1, new BigDecimal(100), 3, new BigDecimal(300));
        Item i2 = new Item(p2, new BigDecimal(1000), 5, new BigDecimal(5000));

        Invoice invoice = new Invoice("12/ABC");

        i1.setProduct(p1);
        i2.setProduct(p2);

        invoice.getItems().add(i1);
        invoice.getItems().add(i2);

        i1.setInvoice(invoice);
        i2.setInvoice(invoice);
        //WHen
        invoiceDao.save(invoice);
        int id = invoice.getId();
        int invoiceItemsSize = invoice.getItems().size();

        //Then
        assertNotEquals(0,id);
        assertEquals(2,invoiceItemsSize);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
