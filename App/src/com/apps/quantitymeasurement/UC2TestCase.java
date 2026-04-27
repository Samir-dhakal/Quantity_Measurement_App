package com.apps.quantitymeasurement;

import org.testng.annotations.Test;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class UC2TestCase {
    @Test
    public void testFeetEquality_SameValue(){

        Feet f1= new Feet(1.0);
        QuantityMeasurementApp.Feet f2= new QuantityMeasurementApp.Feet(1.0);
        boolean output=f1.equals(f2);
        assertTrue(output);
    }


    @Test
    public void testEquality_DifferentValue(){
        QuantityMeasurementApp.Feet f1= new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 =new QuantityMeasurementApp.Feet(2.0);
        boolean output = f1.equals(f2);
        assertFalse(output);
    }

    @Test
    public void testEquality_NullComparison(){
        QuantityMeasurementApp.Feet f1 =new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = null;
        boolean output = f1.equals(f2);
        assertFalse(output);
    }

    @Test
    public void testEquality_NonNumericInput(){
        QuantityMeasurementApp.Feet f1= new QuantityMeasurementApp.Feet(1.0);

        boolean output = f1.equals("assss");
        assertFalse(output);


    }

    @Test
    public void testEquality_SameReference(){
        QuantityMeasurementApp.Feet f1=new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2= f1;
        boolean output= f1.equals(f2);
        assertTrue(output);
    }

    @Test
    public void testInchesEquality_SameValue(){
        QuantityMeasurementApp.Inches i1= new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches i2 =new QuantityMeasurementApp.Inches(1.0);
        assertTrue(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_DifferentValue(){
        QuantityMeasurementApp.Inches i1= new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches i2= new QuantityMeasurementApp.Inches(2.0);

        assertFalse(i1.equals(i2));
    }

    @Test
    public void testInchesEquality_Nullcomparison(){
        QuantityMeasurementApp.Inches i1= new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i1.equals(null));
    }

    @Test
    public void testInchesEquality_NonNumericInput(){
        QuantityMeasurementApp.Inches i1= new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i1.equals("aaaa"));
    }
    @Test
    public void testInchesEquality_SameRefernce(){
        QuantityMeasurementApp.Inches i1=new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches i2= i1;
        assertTrue(i1.equals(i2));
    }
}
