package com.bridgelabz.line_comparison_computation_problem;

public class LineLengthCalculation {
    float x1, y1, x2, y2;
    double length;

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
        lineLengthCalculation1.compareTo(lineLengthCalculation.length, lineLengthCalculation1.length);
    }

    double getLength() {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    void compareTo(Double lineLengthCalculation, Double lineLengthCalculation1) {
        switch (lineLengthCalculation.compareTo(lineLengthCalculation1)) {
            case 0:
                System.out.println("Both Lines are Equal");
                break;
            case 1:
                System.out.println("Line 1 is greater than Line 2");
                break;
            case -1:
                System.out.println("Line 1 is smaller than Line 2");
                break;
        }
    }
}