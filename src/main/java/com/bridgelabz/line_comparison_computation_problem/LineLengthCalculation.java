package com.bridgelabz.line_comparison_computation_problem;

public class LineLengthCalculation {
    float x1, y1, x2, y2;
    Double length;

    public static void main(String[] args) {
        LineLengthCalculation lineLengthCalculation = new LineLengthCalculation();
        lineLengthCalculation.x1 = 100.23f;
        lineLengthCalculation.y1 = 102.34f;
        lineLengthCalculation.x2 = 143.24f;
        lineLengthCalculation.y2 = 150.67f;
        lineLengthCalculation.length = lineLengthCalculation.getLength();
        LineLengthCalculation lineLengthCalculation1 = new LineLengthCalculation();
        lineLengthCalculation1.x1 = 10.34f;
        lineLengthCalculation1.y1 = 12.56f;
        lineLengthCalculation1.x2 = 30.87f;
        lineLengthCalculation1.y2 = 45.34f;
        lineLengthCalculation1.length = lineLengthCalculation1.getLength();
        if (lineLengthCalculation.length .equals(lineLengthCalculation1.length))
            System.out.println("Both Lines are Equal");
        else
            System.out.println("Both Lines are not Equal");
    }
    double getLength() {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
