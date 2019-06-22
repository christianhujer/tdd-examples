package com.nelkinda.time;

import org.junit.Assert;
import org.junit.Test;

public class YearsTest {
    @Test
    public void year2019_has365Days() {
        final int expected = 365;
        final int actual = Years.numberOfDaysPerYear(2019);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void year2016_has366Days() {
        final int expected = 366;
        final int actual = Years.numberOfDaysPerYear(2016);
        Assert.assertEquals(expected, actual);
    }
}
