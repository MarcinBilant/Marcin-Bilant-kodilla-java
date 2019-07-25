package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.Arrays;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //given
        Product product1 = new Product("Laptop");
        Product product2 = new Product("Phone");

        BigDecimal priceProduct1 = new BigDecimal("3500");
        BigDecimal priceProduct2 = new BigDecimal("3100");

        Item item1 = new Item(product1, priceProduct1, 1);
        Item item2 = new Item(product2, priceProduct2, 2);

        Invoice invoice1 = new Invoice("2019");
        //invoice1.setItems(Arrays.asList(item1,item2));
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        //when
       invoiceDao.save(invoice1);
       int invoice1Id = invoice1.getId();

        //then
        Assert.assertEquals(2, productDao.count());
        Assert.assertEquals(2, itemDao.count());
        Assert.assertEquals(1, invoiceDao.count());

        //cleanup
       try {
            productDao.deleteAll();
            itemDao.deleteAll();
            invoiceDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }
}
