package com.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationTest {

    MathOperation mathOperation = new MathOperation();

    @Test
    public void addOperation() {
        assertEquals (8, mathOperation.addOperation(3,5));
    }
}