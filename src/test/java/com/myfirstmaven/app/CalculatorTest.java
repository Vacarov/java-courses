package com.myfirstmaven.app;

import junit.framework.Assert;

import static junit.framework.Assert.assertEquals;

/**
 * Created by wergin on 13-Mar-17.
 */
public class CalculatorTest {
    @org.junit.Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(2,1,7);
        assertEquals(10,calculator.getResult());
    }
}