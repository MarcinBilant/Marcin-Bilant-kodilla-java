package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookStatistic;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Statistic;

import java.util.Map;

public class MedianAdaptee implements BookStatistic {
    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        Statistic theStatistic = new Statistic();
        return theStatistic.averagePublicationYear(books);
    }
    @Override
    public int  medianPublicationYear(Map<BookSignature, BookB> books) {
        Statistic theStatistic = new Statistic();
        return theStatistic.medianPublicationYear(books);
    }


}
