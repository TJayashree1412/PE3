package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Date;
public class CalculateFirstAndLastDateOfWeekTest {
    CalculateFirstAndLastDateOfWeek calculateFirstAndLastDateOfWeek;
    @Before
    public void setUp() throws Exception {
        calculateFirstAndLastDateOfWeek=new CalculateFirstAndLastDateOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        calculateFirstAndLastDateOfWeek=null;
    }

    @Test
    public void calculateFirstDateOfWeek() {
        //arrange
        Date now =new Date();
        String expected="First Date of Week : Mon 24/12/2018";
        //act
        String actual=calculateFirstAndLastDateOfWeek.calculateFirstDateOfWeek(now);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void calculateLastDateOfWeek() {
        //arrange
        Date now =new Date();
        String expected="Last date of the week : Sun 30/12/2018";
        //act
        String actual=calculateFirstAndLastDateOfWeek.calculateLastDateOfWeek(now);
        //assert
        assertEquals(expected,actual);
    }
}