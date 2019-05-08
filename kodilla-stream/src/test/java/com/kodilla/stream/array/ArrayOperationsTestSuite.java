package com.kodilla.stream.array;
import org.junit.Test;

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


    }
}
