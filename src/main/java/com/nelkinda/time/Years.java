package com.nelkinda.time;

public class Years {
    public static int numberOfDaysPerYear(int year) {
        return (year % 4 == 0) ? 366 : 365;
    }
}
