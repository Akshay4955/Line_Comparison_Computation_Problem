package com.bridgelabz.line_comparison_computation_problem;

public class LineLengthCalculation {
    float x1, x2, y1, y2;

    public static void main(String[] args) {
        LineLengthCalculation lineLengthCalculation = new LineLengthCalculation();
        lineLengthCalculation.x1 = 10.12f;
        lineLengthCalculation.x2 = 20.23f;
        lineLengthCalculation.y1 = 70.67f;
        lineLengthCalculation.y2 = 67.56f;
        System.out.println("Length of Line is " + lineLengthCalculation.getLength());
    }

    double getLength() {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
