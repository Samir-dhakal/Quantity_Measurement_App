package com.apps.quantitymeasurement;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.apps.quantitymeasurement.QualityMeasurementApp.Feet;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class UC1TestCase {
    @Test
    public void testFeetEquality_SameValue(){
        Feet feet = new Feet(1.0);
        Feet feet2 = new Feet(1.0);
        assertTrue(feet.equals(feet2));
    }
    @Test
    public void testFeetEquality_DifferentValue(){
        Feet feet = new Feet(1.0);
        Feet feet2 = new Feet(2.0);
        assertFalse(feet.equals(feet2));
    }

    @Test
    public void testFeetEquality_NullComparison(){
        Feet feet = new Feet(1.0);

        assertFalse(feet.equals(null));
    }

    @Test
    public void testFeetEquality_DifferentClass(){
        Feet feet = new Feet(1.0);
        Integer ram=4;
        assertFalse(feet.equals(ram));
    }

    @Test
    public void testFeetEquality_SameReference(){
        Feet feet = new Feet(1.0);
        assertTrue(feet.equals(feet));
    }

}
