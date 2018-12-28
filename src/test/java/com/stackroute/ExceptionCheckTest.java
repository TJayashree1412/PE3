package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionCheckTest {
     private ExceptionCheck exceptionCheck;

    @Before
    public void setUp() throws Exception {
        exceptionCheck=new ExceptionCheck();
    }

    @After
    public void tearDown() throws Exception {
        exceptionCheck=null;
    }

    @Test
    public void checkNegativeArraySizeException() {
        //arrange
        String expected="NegativeArraySizeException";
        //act
        String actual=exceptionCheck.checkNegativeArraySizeException();
        //assert
        assertEquals(expected,actual);

    }

    @Test
    public void checkIndexOutOfBoundsException() {
        //arrange
        String expected="class java.lang.ArrayIndexOutOfBoundsException";
        //act
        String actual=exceptionCheck.checkIndexOutOfBoundsException();
        //assert
        assertEquals(expected,actual);
    }


    @Test
    public void checkNullPointerException() {
        //arrange
        String expected="NullPointerException";
        //act
        String actual=exceptionCheck.checkNullPointerException();
        //assert
        assertEquals(expected,actual);
    }

}