package com.kodilla.stream.array;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int [] numbers = new int[20];

        //When
        for(int i=0; i<20; i++) {
            numbers[i] = 2 + i;
        }

        //Then
        int size = numbers.length;

        double exeptecedavergae = 11.5;
        Assert.assertEquals(exeptecedavergae,ArrayOperations.getAverage(numbers),0.001);


    }
}
