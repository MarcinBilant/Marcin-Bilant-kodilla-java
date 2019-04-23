package com.kodilla.testing.collection;



import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList <Integer> numbers = new ArrayList<Integer>() ;
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList <Integer> numbers = new ArrayList<Integer> ();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        ArrayList<Integer> exepted = new ArrayList<>();
        exepted.add(2);
        exepted.add(4);
        exepted.add(6);
        exepted.add(8);
        exepted.add(10);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(exepted, result);
    }
}
