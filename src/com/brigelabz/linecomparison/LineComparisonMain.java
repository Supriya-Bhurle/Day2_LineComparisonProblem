package com.brigelabz.linecomparison;

public class LineComparisonMain {
    public static void main(String[] args) {
        LengthOfLines lineComapar = new LengthOfLines();
        LineComparison lineComparison = lineComapar.setCompareValues();
        lineComapar.geometryCalculation(lineComparison);
        lineComapar.compareOrEqual();

    }
}
