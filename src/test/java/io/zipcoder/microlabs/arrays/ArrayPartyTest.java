package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nMushrooms";
        //: When
        String actual = "*** Output ***\n" + arrayParty.lastElement(breakfast);
        //: Then
        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOne(){
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nTomatoes";

        String actual = "*** Output ***\n" + arrayParty.lastButOne(breakfast);
        Assert.assertEquals(expected, actual);

    }

    //TODO Define the method reverseTest
    @Test
    public void reverseTest(){
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                ": Mushrooms\n" +
                ": Tomatoes\n" +
                ": Bacon\n" +
                ": Beans\n" +
                ": Eggs\n" +
                ": Sausage";
        String actual = arrayParty.reverse(breakfast);
        Assert.assertEquals(expected, actual);

    }

    //TODO Define the method isPalindromeTest
    


    //TODO Define the method compressTest

    //TODO Define the method packTest


}
