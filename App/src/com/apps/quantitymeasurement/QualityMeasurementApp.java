package com.apps.quantitymeasurement;
public class QualityMeasurementApp {
    public static class Feet{
        private final double value;
        public Feet(double value){
            this.value = value;
        }
        @Override
        public boolean equals(Object o)
        {
            if (!(o instanceof Feet))
                return false;
            if (o == null) return false;
            Feet feet = (Feet)o;
            if (Double.compare(feet.value,value)==0) return true;
            return false;        }

    }
    public static void main (String [] args){
        Feet feet = new Feet(1.0);
        Feet feet2 = new Feet(2.0);
        System.out.println("is feet equals to feet2 "+feet.equals(feet2));

    }
}
