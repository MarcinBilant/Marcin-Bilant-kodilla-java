package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    public int publicationYearMedain(Set<BookA> bookASet) {
        Map<BookSignature, BookB> bookMap = new HashMap<>();
        for (BookA book : bookASet) {
            bookMap.put(new BookSignature(book.getSignature()),
                    new BookB(book.getAuthor(),book.getTitle(),book.getPublicationYear()));

        }
        return medianPublicationYear(bookMap);
    }

}
