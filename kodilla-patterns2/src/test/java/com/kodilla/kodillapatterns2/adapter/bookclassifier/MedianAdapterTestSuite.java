package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookB;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //given
        BookA book1 = new BookA("Jan", "Kowalski", 2005, "123");
        BookA book2 = new BookA("Adam", "Malina", 2003, "456");
        BookA book3 = new BookA("Ania", "Kotek", 2011, "789");
        BookA book4 = new BookA("Hania","Platek",2018,"987");
        Set<BookA> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int median = medianAdapter.publicationYearMedain(books);
        //then
        assertEquals(2011, median);

    }
}
